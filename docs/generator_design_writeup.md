# Palladio Text Add-On

Diese Add=On erweitert Palladio Studio um die Funktionalität Palladio Modelle als eine Text-Form darzustellen, welches einige Vorteile mit sich bringt. Zum einen ist es einfacher in Source Control einzubinden, da sich Text einfach unterscheiden lässt, im Vergleich zu einem XML Modell. Es ich auch einfacher auszutauschen, da eine Datei mehrere Modelle repräsentieren kann. Zuletzt ist es auch einfacher Änderungen am Modell durchzuführen, da eine Änderung im Text schneller zu bearbeitet ist.

```
repository MediaStore {	
	datatype FileContent {}
	datatype AudioCollectionRequest {
		Count PrimitiveTypes::Integer
		Size PrimitiveTypes::Integer
	}
	
	interface IFileStorage {
		op getFiles(audioRequest AudioCollectionRequest) FileContent
		op storeFile(file FileContent)
	}

    component FileStorage {
		provides store IFileStorage
		requires cpu ICPU
		requires hdd IHDD
		
		seff store.getFiles {
			cpu.process(«audioRequest.Count.VALUE*75182981.91»)
			hdd.read(«audioRequest.Size.VALUE * audioRequest.Count.VALUE»)
			«audioRequest.Count.VALUE * audioRequest.Size.VALUE» -> .BYTESIZE
		}
		
		seff store.storeFile {
			cpu.process(«75182981.91»)
		}
	}
}
```

## Gramatik
Die verwendete Sprache ist eine auf Klammern basierende Grammatik die einen Großteil von Palladio's Elementen abdeckt. (Fast) Jedes Top-Level Element in der Grammatik entspricht einer separaten Sich auf das Modell in Palladio, wie etwa ein Repository oder ein System. Fast jedes, denn es gibt noch zwei extra Elemente, die uns hier im Text unterstützung leisten: Mapping und Imports.

### Mapping und Imports

Imports erlauben es uns das textuelle Modell auf mehrere Dateien auszulagern, was primär genutzt wird um die Standarddefinitionen von Palladio bereitzustellen. Die in der importierten Datei definierten Elemente stehen danach in der importierenden Datei zur Benutzung bereit, als wären sie direkt in dieser definiert worden.

Beispiel: Import der Datei `std_definitions.tpcm`
```
import "std_definitions.tpcm"
```

Mappings sind dazu da, um explizit ein Element auf ein Anderes zu "Mappen", also dem Generator bereits vorzugeben, welches Element bei der Transformation verwendet werden soll. Der Hauptzweck dahinter ist, dass es in Palladio vorgegebene Elemente für bestimmte Zwecke gibt, welche die Simulation steuern. Ohne die im Mapping gemachten Vorgaben würde der Generator nichts von diesen vorgegebenen Elementen wissen und dadurch eigene Elemente erstellen. Die daraus folgenden Simulation wären unvollständig bis nutzlos. Ein normaler Benutzer sollte das Feature nicht benötigen, _außer_ für diese Standardelemente, aber auch das sollte bereits vorgegeben sein. Wichtig ist hierbei, dass trotzdem im textuellen Modell ein Element benötigt wird, welches die Eigenschaften bereit stellt. Das Mapping selbst ist also kein import.

Beispiel: Mapping Definition für die Verwendung des CPU-Interfaces aus Palladio
```
resourcetypes {
	interface ICPU {
		op process(amount PrimitiveTypes::Double)
	}
}

mapping {
    ICPU -> "pathmap://PCM_MODELS/Palladio.resourcetype#_tw_Q8E5CEeCUKeckjJ_n-w"
	ICPU::process -> "pathmap://PCM_MODELS/Palladio.resourcetype#_wF22kE5CEeCUKeckjJ_n-w"
}
```

Aktuell ist das Mapping sehr "einfach" und bezieht sich nur auf ein explizites Element. Falls dieses Element noch weitere Kind-Elemente hat, werden diese nicht automatisch mit übetragen. In einigen Fällen ist das kein Problem, falls jedoch ein Kind-Element direkt Referenziert wird, ohne über das Eltern-Element zu gehen, muss auch für das Kind-Element so ein Mapping angegeben werden. Im Vorherigen Beispiel ist dies der Fall, da hier auch für die `process`-Signature so ein Mapping angegeben wird. Um sicher zu gehen, sollte einfach für alle Elemente so ein Mapping angegeben werden.

### Palladio Elemente

Alle Ansichten von Palladio auf das Modell since als oberste Knoten in der Grammatik angegeben. Das heißt, auf oberster Ebene sind `repository`, `resourcetypes`, `system`, `allocation` und `usagemodel` vertreten. Es können jeweils beliebig viele von diesen definiert werden, jedoch sollte sichergestellt werden, dass, sobald mehr als eins vom gleichen Typ in der Datei definiert werden, diese eindeutig benamt werden. Wenn lediglich eins vom Typ in der Datei existieren, sind die Namen optional.

Je nachdem welchen Typ von Sicht man verwendet, gibt es entsprechend innere Elemente zur Benutzung, die zur Sicht gehören, wie die Definition von Komponenten, Ressourcen und Systemen.

### Nicht umgesetzte Elemente

Vereinzelnd wurden bestimmte Elemente aus verschiedenen Gründen nicht umgesetzt. Dies gilt etwa für interne Aktionen mit einem "resource demand". Stattdessen sollte hier ein Resource Call verwendet werden. Infrastructure Interfaces, und somit auch Internal Actions mit Infrastructure Calls, werden auch in dieser ersten Version noch nicht unterstützt.

## Transformationsprozess

Interessant ist jetzt natürlich, wie von der textuellen Repräsentation zur Repräsentation in Palladio gelangt wird. Im Grunde sind beides EMF-Modelle und haben somit eine recht ähnliche Struktur, wodurch es in den meisten Fällen möglich wäre eine 1-zu-1 Übetragung des Elementes aus des textuellen Darstellung in Palladio bereitzustellen. Das ist jedoch nicht immer der Fall, da zum Teil Elemente ausgelassen werden können oder lediglich implizit aus dem Kontext kommen. Es würde also nicht genügen nur anzugeben, welches Element auf welches andere Element abbildet. Dennoch deckt diese direkte Übertragung einen großen Anteil der Elemente ab.

Daraus folgt nun, dass explizit angegeben werden muss, wie einzelne Elemente übertragen werden können und es außerdem erlaubt, diese Übertragung mit weiteren Informationen zu befüllen beziehungsweise allgemein das Element spezifisch anzupassen. Natürlich könnte man nun die Transformation direkt in den Generator schreiben; das wäre einfach und zweckmäßig. Dies wurde auch in einer früheren Iteration realisiert. Leider hat das den Nachteil, dass bei einer Änderung einer Transformation es als ganzes, inklusive des Parsers und anderer Komponenten, neu ausgeliefert werden muss, auch wenn sich in diesen Teilen nichts geändert hat. Außerdem wäre es nicht möglich (ohne Mehraufwand) eine "Light" Version bereitzustellen, die lediglich den Parser selbst (mit Validierung) enthält und nichts von den Palladio Elementen weiß.

Um diese Use Cases auch zu ermöglichen wurde das Add-On nun in zwei Teilen aufgebaut: ein Generator und eine Konfiguration. Der Generator beinhaltet den Parser (mit Validierung) und eine sehr generelle Komponente zum Transformieren von Modellen. Diese wird dann vom Konfigurationsteil genau so eingerichtet, dass sie das textuelle Modell in das Palladio-Modell transformiert. Falls nun Änderungen anstehen, die die Art der Transformation verändern, reicht es die Konfiguration neu auszuliefern während der Generator unberührt bleibt. Und falls keine Konfiguration vorhanden ist kann der Generator weiterhin verwendet werden um etwa Validierung und das Parsen weiter durchzuführen.

### Der Generator

Der Generator ist ein normaler, auf Xtext basierender, Generator, der die vom Benutzer geschriebenen Text-Dateien als EMF-Model vom Xtext-Parser bekommt und dann daraus die entsprechenden Palladio-Dateien generiert. Wichtig ist hier bereits, dass normalerweise der Generator pro Datei aufgerufen wird. Falls also mehrere Datein vom Benutzer erstellt wurden, dann würde auch der Generator mehrmals aufgerufen werden. Xtext ist auch optimiert, nur bei Änderungen den Generator aufzurufen. Für normale Programmiersprachen ist das kein Problem; wenn ich aus einer Datei etwas referenziere, dann meist durch eine vom Benutzer angegebene ID (oder Name). In Palladio ist das jedoch leider nicht der Fall und es werden zufällig generierte IDs verwendet, die sich jedes mal aufs neue ändern. Leider muss also dieses Xtext-Verhalten umgangen werden und immer alle Dateien als eingabe verwendet werden.

Theoretisch könnte man es auch hier optimieren indem geschaut wird, welche anderen Dateien die neu zu generierende Datei über einen Import verwenden um diese dann auch zur Generierung hinzuzufügen. Jedoch müsste man das dann rekursiv durchführen, damit am Ende alle Elemente die neuen IDs verwenden. Letztlich müssten also in den meisten Fällen sowieso alle Dateien neu generiert werden. Der ganze Aufwand würde deswegen gespart und es werden einfach alle Dateien für die generierung hinzugezogen; die Performance ist dabei kein Problem.

Nachdem nun alle Dateien geparst vorliegen, werden aus diesen Elementen die "Mappings" (siehe [Mappings & Imports](#mappings-und-imports)) herausgezogen und in einen internen Cache gelegt. Dieser Cache beinhaltet alle bereits transformierten Elemente und die Objekt-ID ihres Ursprungsobjektes. Letzteres wird verwendet um den Cache nach existierenden Einträgen zu durchsuchen. Falls ein Eintrag gefunden werden konnte, kann das Ergebniss hier direkt verwendet werden, andernfalls müsste die Transformation ganz normal angewendet werden. Durch das Hinzufügen der Mapping-Elemente wird also die Transformation für diese Elemente komplett übersprungen und stattdessen die vorgegebenen Elemente verwendet.

Die restlichen Elemente aus den Dateien sind dann Imports und die vom Benutzer definierten Sichten. Die Imports werden bereits intern im Xtext-Parser verarbeitet und können also vom Generator ignoriert werden. Die Sichten hingegen werden nun einzeln nacheinander transformiert. Nach dieser Transformation werden Ergebnisse in ihre entsprechenden Dateien zugeordnet, in ein gemeinsames Resource Set gelegt und gespeichert, was EMF übernimmt.

### Transformation von Elementen

Die Transformationen für die einzelnen Elemente sind über Regeln für jedes Element definiert. Diese Regeln bestimmen, wann welche Transformation verwendet wird, welche Eigenschaften transformiert werden, wie das Zielobjekt erstellt wird und ob besimmte Aktionen nach der Transformation durchgeführt werden.

Beispiel: Angeben einer Regel zur Transformation von `Source` nach `Target`
```xtend
registry.configure(Source, Target) [
	create = [ source |
	    createTarget()
	]
	when = [ source |
		shouldTransform(source)
	]
	map([it.type]).thenSet [ target, transformedType |
		target.type = transformedType
	]
	after = [ target |
		target.updateReferences()
	]
]
```

Eine Regel hat immer mindestens zwei Teile: den Quell- & Zieltyp und wie ein Element des Zieltyps erstellt wird. Ersteres ist bereits Teil der Parameter für den Aufruf zur Erstellung der Regel. Der zweite Teil wird durch die Zuweisung eines Lambdas an `create` angegeben. Diese erhält das original Quell-Element und soll das Ziel-Element erstellen und kann bereits direkte Zuweisungen durchführen, wenn dies möglich ist. In den meisten Fällen werden aber Elemente benötigt, die selbst noch transformiert werden müssen, die hier in dem ersten Schritt noch nicht gesetzt werden können.

Zudem kann bei Angabe eines Lambdas für `when` definiert werden wann diese Transformation überhaupt ausgeführt werden soll. Bei der Auswahl einer einer Transformation wird der Generator alle möglichen Transformationen sich zusammensuchen und diese dann filtern nach den, die die Transformation für dieses Quell-Element zulassen. In anderen Worten wird es sich die Transformation suchen, deren `when` Lambda hier `true` zurück gibt, was auch der Standard ist, falls kein explizites `when` angegeben ist.

Der Großteil einer Regel sind die Transformationen von inneren Eigenschaften und Referenzen. Dies wird durch `map().thenSet` realisiert. Mit `map()` wir ein Lambda angegeben, welches die Eigenschaft aus der Quelle aussucht, welche transformiert werden soll. Falls man hier eine Liste hat, sollte `mapAll()` stattdessen verwendet werden. Es ist innerhalb des Lambdas auch erlaubt, konditional einen Wert auszuwählen oder die Liste an Werten zu filtern; es geht hier lediglich darum einen zu Transformierenden Wert aus dem Quell-Element zu holen, den der Generator dann transformieren kann. Über das daran folgende `thenSet` kann dann definiert werden, wie der transformierte Wert in das transformierte Ziel-Element eingesetzt werden kann. Dazu erhält das Lambda zwei Parameter: das transformierte Element an erster Position und den transformierten Wert des `map`-Aufrufs als zweites. Letzterer ist auch entsprechend eine Liste, wenn `mapAll` verwendet wurde. Falls der Wert, der durch `map/mapAll` ausgewählt wird, `null` ist, wird dieser einfach ignoriert und es wird keine Transformation durchgeführt.

Wie der Wert, der im `map` ausgewählt wurde, transformiert wird ist an dieser Stelle nicht angegeben. Er wird dann intern wie ein neues Element behandelt und dementsprechend von Neuem eine Transformationsregel für den Typ gesucht und angewendet. Hierdurch kommt die eigentliche Rekursion durch den Baum zustande. Falls hier ein Eltern-Element angegeben wird, würde es normalerweise zu Endlosrekursion kommen, da keins der Elemente je fertig bearbeitet werden würde. Das ist aber nicht der Fall, da Elemente bereits in den vorher erwähnten Cache gelangen direkt nachdem sie durch die `create`-Regel erstellt wurden und somit bevor `map` bzw. `mapAll` durchgeführt werden. Dadurch würden die Elemente aus dem Cache genommen, statt eine erneute Transformation durchzuführen.

Zuletzt kann durch `after` ein Lambda angegeben werden, welches nach der Transformation mit dem fertigen Ziel-Element aufgerufen wird. Hier kann dann noch einmal mit dem fertigen Element gearbeitet werden, um etwa innere Referenzen anzulegen oder fehlende Standardwerte zu setzen.

Die Regel wird danach in der Registry gespeichert und entsprechend für ein Element rausgesucht & verwendet, wenn dieses Transformiert werden soll. Es wird natürlich versucht, zur Zeit der Konfiguration bereits viele Fehler zu vermeiden, wie etwa ein fehlendes `create` oder zwei unkonditionale Regeln mit gleichen Quell- und Zieltyp. Leider gibt es immernoch ein Paar Fälle, wo erst zur Laufzeit ein Fehler entdeckt werden kann. Beispielsweise ist das der Fall, wenn es nur Regeln gibt, die eine `when` Kondition haben aber beim Transformieren ein Element für keines dieser zutrifft.

## Extension Mechanismus

Wie vorher erwähnt, ist der Generator und die Konfiguration aus mehreren Gründen getrennt von einander. Der Generator selbst wird bereits von Eclipse verwaltet und es muss somit nicht dessen Einbindung konfiguriert werden. Die Konfiguration hingegen braucht noch eine Schnittstelle, wo sie sich einbinden kann. Hier wird, wie für den Generator, auf Eclipse Extension Points und Extensions gesetzt. Der Generator bietet hier einen Extension Point an, welcher ein `TransformationRegistryConfigurer` Interface akzeptiert. Die Konfiguration bietet hier eine Implementation (`RegistryConfigurer`) als Extension an, welche dann von Eclipse zur Laufzeit angebunden wird.