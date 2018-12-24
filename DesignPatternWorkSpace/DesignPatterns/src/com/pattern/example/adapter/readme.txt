Ref: https://www.baeldung.com/java-structural-design-patterns

An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly. 
An Adapter wraps an existing class with a new interface so that it becomes compatible with cliethe nt’s interface.

The main motive behind using this pattern is to convert an existing interface into another interface that the client expects. 
It’s usually implemented once the application is designed.


Example:

Consider a scenario in which there is an app that’s developed in the US which 
returns the top speed of luxury cars in miles per hour (MPH). Now we need to use the same app for our client 
in the UK that wants the same results but in kilometers per hour (km/h).

To deal with this problem, we’ll create an adapter which will convert the values and give us the desired results.

When to use:
............
1. When an outside component provides captivating functionality that we’d like to reuse, 
but it’s incompatible with our current application. A suitable Adapter can be developed to make them compatible
with each other.

2. When our application is not compatible with the interface that our client is expecting

3.When we want to reuse legacy code in our application without making any modification in the original code
