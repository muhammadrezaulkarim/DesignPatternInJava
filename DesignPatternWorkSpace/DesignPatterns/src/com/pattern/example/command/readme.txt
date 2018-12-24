A simple example taken from: https://www.baeldung.com/java-command-pattern

Context:
..........
In OOP, an application makes use of the services of different objects (Receiver objects for processing request). In
terms of implementation, the application may depend on a designated Invoker object that invokes methods on these receiver objects by passing the required data as arguments.

CLIENT ---> INVOKER ---> RECEIVER

In this design, the application that forwards the request and the set of Receiver objects that offer the services required to 
process the request are closely tied to each other in that they interact with each other directly. This could result in a 
set of conditional if statements in the implementation of the invoker (one for each requested service).

When a new type of feature is to be added to the application, the existing code needs to be modified (another if statement needs to be added) and it violates the basic object-oriented open-closed principle.
 
Using the Command pattern, the invoker that issues a request on behalf of the client and the set of service-rendering Receiver 
objects can be decoupled.


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






