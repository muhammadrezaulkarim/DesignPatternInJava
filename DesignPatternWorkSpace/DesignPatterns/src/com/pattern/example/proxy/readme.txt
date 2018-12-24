Proxy is applicable whenever there is a need for a more versatile or sophisticated reference to an object than a simple pointer. 
Proxy receives client requests, does some work (access control, caching, etc.) and then passes request to a service object.
Proxy is invaluable when you have to add some additional behaviors to a class which code you can’t change.

 
Some commonly used Proxy objects:
..............................................
1. Remote proxy: acts as a local representative for an object in a different address space

2. Virtual proxy: To provide the required functionality to allow the on demand creation of a memory intensive object (until required)

3. Cache Proxy/Server Proxy: To provide the functionality required to store the results of most frequently used target operations. 
The proxy object stores these results in some kind of a repository. When a client object requests the same operation, 
the proxy returns the operation results from the storage area without actually accessing the target object.

4. Protection proxy: controls access to the original object. Protection proxies are useful when objects should have 
different access rights.

5. Firewall Proxy: The primary use of a firewall proxy is to protect target
objects from bad clients. A firewall proxy can also be used to provide the functionality required to prevent clients from accessing
harmful targets.

5. Synchronization Proxy: To provide the required functionality to allow safe concurrent accesses to a target object by different client objects.

Example:
1. Remote Proxy: In Java, the concept of Remote Method Invocation (RMI) makes extensive use
of the Remote Proxy pattern

2. Caching Proxy: pattern can helps to implement the lazy initialization and caching to an inefficient 3rd-party Youtube integration library

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



