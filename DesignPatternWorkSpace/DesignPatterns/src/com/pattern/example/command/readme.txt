A simple example taken from: https://www.baeldung.com/java-command-pattern


Command Pattern Implementation:

*** In a classic implementation, the command pattern requires implementing four components:
the Command, the Receiver, the Invoker, and the Client.***

*** A command is an object whose role is to store all the information required for executing an action, 
including the method to call, the method arguments, and the object (known as the receiver) that implements the method.

Command Classes: In this case, the TextFileOperation interface defines the command objects’ API, and the two implementations,
OpenTextFileOperation and SaveTextFileOperation, perform the concrete actions. The former opens a text file,
while the latter saves a text file.

***It’s worth stressing that the component that performs the file operations is the receiver (the TextFile instance), 
not the command classes***

Receiver class:
A receiver is an object that performs a set of cohesive actions. It’s the component that performs the actual action when the command’s 
execute() method is called.

In this case, a receiver class has been defined i.e. ( TextFile)  whose role is to model TextFile objects.

Invoker Class:
An invoker is an object that knows how to execute a given command but doesn’t know how the command has been implemented. 
It only knows the command’s interface.In some cases, the invoker also stores and queues commands, aside from executing them. 
This is useful for implementing some additional features, such as macro recording or undo and redo functionality.

In this case, the class TextFileOperationExecutor is the invoker class.

Client class:
A client is an object that controls the command execution process by specifying what commands to execute
and at what stages of the process to execute them.






