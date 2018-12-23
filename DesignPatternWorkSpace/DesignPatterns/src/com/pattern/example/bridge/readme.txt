*** Abstraction refers to the process of identifying
the set of attributes and behavior of an object that is specific to a particular usage.

The related object can have more than one associated abstractions, each with a distinct usage

For example, logger abstraction refers to the abstraction of the message logging
functionality. ****

*** A given abstraction may have one or more implementations for its methods. In terms of implementation, an abstraction can be designed as an
interface with one or more concrete implementers ***

For example, a message can be logged to different types of destinations such as a file, console and others. Depending on the destination type, a different implementation
of the logger abstraction is needed. This requirement can be designed with a common Logger abstraction interface (e.g. MessageLogger Java Interface) that declares the interface (methods) of the abstraction
and different implementers(e.g. FileLogger or ConsoleLogger Class) corresponding to different destination types provide implementation for the logger abstraction.  
(Please see the factory pattern example)

This kind of design will allow log messages in normal text format. What will happen if we want to support logging in encrypted format? 
To support this extended functionality, we have to modify the existing code violating object-oriented OPEN-CLOSED DESIGN principle. Both the 
abstraction interface and its implementation are closely tied together and hence they cannot be independently varied without affecting
each other.

To be more specific, we have to extend subclass hierarchy of the implementer classes to support all scenarios which might lead to an exponential number of 
subclasses. For the logging example, we can define implement subclasses like FileLoggerTextFormat, FileLoggerEncryptedFormat and so on***

-------------------------------------------------------------------------------------------------------------------
*** Using the Bridge pattern, a more efficient and manageable design of an abstraction can be achieved. 

The design of an abstraction using the Bridge pattern separates its interfaces from implementations so that each can be
modified without affecting other.

Applying the Bridge pattern, both the interfaces and the implementations
of an abstraction can be put into separate class hierarchies ***
--------------------------------------------------------------------------------------------------------------------------

Modified example with Bridge Pattern:

The interface for the logger abstraction can be designed in the form of a set of
classes representing different types of messages that a client object would like to
log.

Define a 'Message' Java interface that declares a method log(String msg), which can
be used by different client objects to log messages. (Please note that client no longer directly use abstraction implemeneter class log method)

Define two logger abstraction interface classes — 'TextMessage' and 'EncryptedMessage' - representing a plain text message and an
encrypted message, respectively which implements the 'Message' Java interface.


Design Highlights:

 Logger abstraction interface classes — TextMessage and Encrypted-
Message — do not provide implementation for the actual message logging
service. Like before, classes such as the FileLogger and Console-
Logger in the abstraction implementer class hierarchy provide the actual
message logging implementation.

 Client objects do not directly use the interface exposed by the abstraction
implementer classes.

 Each abstraction interface class maintains an object reference of the MessageLogger
(abstraction implementer) type. Whenever a client object
creates an abstraction interface object, it configures the interface object
with a MessageLogger object.

 Whenever a client object invokes the log method on an abstraction interface
object, the interface object does any required preprocessing and uses the
message logging service of the MessageLogger object it contains.




















