# Palladio-Addons-TextBasedModelGenerator

This repository currently contains two separate approaches (TPCM and TRepo) to provide a textual editing environment for Palladio models. Both use a Xtext based grammar and the Xtext generator framework to create the PCM instances. 

## TPCM 
TPCM is a textual modeling language aiming to capture the complete feature set of the Palladio Component Model. Based on the textual model description, the traditional PCM model files are generated and updated in the background. In order to facilitate a native textual experience, TPCM does not support interacting with existing non-textual model files. A mapping mechanism of textual specifications to existing model artifacts will be integrated in the near future.

### Installation

Install the *TPCM* feature into a recent Eclipse using the update-site https://updatesite.palladio-simulator.com/palladio-addons-textbasedmodelgenerator/nightly/

### Specification and Example

The TPCM language currently supports the PCM view points _Repository_, _System_, _Resource Environment_, _Allocation_, _Usage_ and _Resource Types_. There are, however, some limitations to the expressiveness:

* In order to provide a unified interface-based language, TPCM does not support specifying Resource Demands directly in the internal action. Instead, please use the _Resource Call_ mechanism.
* Fork/Join actions are not yet supported by the RDSEFF language
* Reliability modeling is not yet part of the language
* Component parameters are not yet part of the language

All view points can be specified in a single .tpcm file otr split into multiple ones. A comprehensive specification-by-example can be found in the folder _tests/org.palladiosimulator.textual.tpcm.tests/test-resources/parser_. 

### Example
``` Smalltalk
import "std_definitions.tpcm"

repository demoRepo {
	datatype PrimitiveInt INT 

	interface IService1 {
		op foo(param1 PrimitiveInt)
	}

	interface IService2 {
		op bar(param1 PrimitiveInt) PrimitiveInt
	}

	component Service1 {
		provides ps1 IService1
		requires rs2 IService2
		requires cpu ICPU

		seff ps1.foo {
			rs2.bar(param1)
			cpu.process(param1)
		}
	}
	component Service2 {
		provides ps2 IService2
		...
	}
}

system demoSystem {
	provides serv1 demoRepo::IService1 -> assembly A1 demoRepo::Service1
	
	A1 -> assembly A2 demoRepo::Service
}

resourceenvironment demoEnv {
	container C1 {
		processing CPU CPUResource 
	}
}

allocation demoAllocation {
	demoSystem::A1, demoSystem::A2 --> demoEnv::C1
}

usage demoUsage {
	"Simple Demo Scenario" population(«20») thinkTime(«0.1») {
		demoSystem::serv1.foo («100»)
		delay «10»
		demoSystem::serv1.foo («IntPMF[(0.5;5)(0.5;10)]»)
	}
}
```

## TRepo 

TRepo constitutes a textual specification of PCM repositories. In contrast to TPCM, it provides support to work with existing (non-textual) repositories. TRepo is not maintained, anymore.

### Installation

Install the *RepoLang* feature into a recent Eclipse using the update-site https://updatesite.palladio-simulator.com/palladio-addons-textbasedmodelgenerator/nightly/

### Usage

Create a new text file with the ending `.trepo` in any project.
Add the components using the grammar.
The pcm repository will be generated automatically in the `src-gen` folder.

### Example
``` Smalltalk
Repository textualRepository

import myRepository.*
 
Types { 
	struct MyType  {
		key : STRING 
		value : STRING
		type: STRING
	}
	collection MyCollection of STRING
} 

Interface IConsumer { 
	String invoke (foo: BOOL, bar: BYTE)
	commit
} 

Interface IDatabase { 
	MyCollection query
} 

 
Component MyConsumer 
	provides IConsumer as consumer 
	requires IDatabase as database
{
	SEFF on consumer invoke {
		ACQ threadPool
		EXT database -> query
		REL threadPool

  }
  PassiveResource threadPool (10)		
}

```
