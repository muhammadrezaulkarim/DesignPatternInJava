The Visitor pattern is useful in designing an operation across a heterogeneous collection of objects of a class hierarchy. 
The Visitor pattern allows the operation to be defined without changing the class of any of the objects in the collection.

Imagine that we have a composite object which consists of components. The object’s structure is fixed – we either can’t change it, 
or we don’t plan to add new types of elements to the structure.
******Now, how could we add new functionality to our code without modification of existing classes?***********

The Visitor design pattern might be an answer. 

Simply put, we’ll have to do is to add a function which accepts the visitor class 
to each element of the structure. Consequently, we’ll make good use of the OPEN CLOSED principle as we won’t modify the code,
but we’ll still be able to extend the functionality by providing a new Visitor implementation.

Visitor pattern suggests defining the operation in a separate class referred to as a visitor class. 
This separates the operation from the object collection that it operates on. For every new operation to be defined, a
new visitor class is created.

In the given example: 
Let us define an order class hierarchy with an interface Order at the top of the hierarchy and three of its implementers 
— CaliforniaOrder, NonCaliforniaOrder and OverseasOrder — each representing a specific order type. 

The Order interface declares a method accept(OrderVisitor). Each of the Order implementers provides implementation for the
accept(OrderVisitor) method.

The VisitorInterface can be designed as a Java interface that declares a set of visit(OrderType) methods, one for each class
in the order class hierarchy. In other words, these methods are meant to process different types of
orders.

    public interface VisitorInterface 
    {
      public void visit(NonCaliforniaOrder nco);
      public void visit(CaliforniaOrder co);
      public void visit(OverseasOrder oo);
    }

A visitor OrderVisitor has been defined as an implementer of the VisitorInterface to calculate the sum of all order
totals.


DEFINING A NEW OPERATION ON THE ORDER OBJECT COLLECTION:

Defining a new operation on the order object collection requires the creation of a new visitor. The new visitor needs to 
implement the VisitorInterface interface providing implementation for different visit(OrderType) methods
to process different types of Order objects.

ADDING A NEW ORDER TYPE TO THE COLLECTION:

If a new type of object (a new class) is to be added to the object structure such as a DiscountOrder that implements 
the Order interface, then a corresponding visit(DiscountOrder) method needs to be added to the VisitorInterface
and needs to be implemented by the OrderVisitor class.

For Another simple example: https://www.baeldung.com/java-visitor-pattern
