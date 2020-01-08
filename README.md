# Palladio-Addons-TextBasedModelGenerator

The TextBasedModelGenerator is an XText based grammar and generator that allows for the rapid creation of Palladio models using a textual DSL.


## Installation

Install the plugin from the Update-Site

## Usage

Create a new text file with the ending .tpcm in any project.
Add the components using the grammar.
The pcm repository will be generated automatically in the `src-gen` folder.

## Example
```
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
