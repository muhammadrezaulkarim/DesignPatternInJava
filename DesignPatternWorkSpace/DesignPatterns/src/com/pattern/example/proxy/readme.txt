Proxy is applicable whenever there is a need for a more versatile or sophisticated reference to an object than a simple pointer. 
Proxy is also invaluable when you have to add some additional behaviors to a class which code you can’t change.

 
When to use Proxy objects:
..............................................
1. Virtual proxy: When we want a simplified version of a complex or heavy object. In this case, we may represent it with a 
skeleton object which loads the original object on demand, also called as lazy initialization. This is known as 
the Virtual Proxy

2. Remote proxy: When the original object is present in different address space, and we want to represent it locally. We 
can create a proxy which does all the necessary boilerplate stuff like creating and maintaining the connection, encoding, 
decoding, etc., while the client accesses it as it was present in their local address space. This is called the 
Remote Proxy

3. Protection Proxy: When we want to add a layer of security to the original underlying object to provide controlled 
access based on access rights of the client. This is called Protection Proxy

4. Cache Proxy/Server Proxy: When we want to provide the functionality required to store the results of most frequently 
used target operations. The proxy object stores these results in some kind of a repository. When a client object requests 
the same operation, the proxy returns the operation results from the storage area without actually accessing the 
target object.

5.Synchronization Proxy: When we want to provide the required functionality to allow safe concurrent accesses to a target
object by different client objects.


Example:
1. Remote Proxy: In Java, the concept of Remote Method Invocation (RMI) makes extensive use
of the Remote Proxy pattern

2. Caching Proxy: Implement the lazy initialization and caching to an inefficient 3rd-party Youtube integration library

3. Protection proxy: Suppose we have a class that can run some command on the system. Now if a client is given 
access to this class, the client can delete some system files or change some system settings.
To avoid this a proxy class can be created to provide controlled access.



Proxy versus Façade
...................
 Proxy
– A Proxy object represents a single object.
– The client object cannot access the target object directly.
– A Proxy object provides access control to the single target object.

 Façade
– A Façade object represents a subsystem of objects.
– The client object does have the ability to access the subsystem objects
directly, if needed.
– A Façade object provides a simplified higher level interface to a
subsystem of components.



