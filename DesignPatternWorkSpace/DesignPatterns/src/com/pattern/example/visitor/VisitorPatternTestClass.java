package com.pattern.example.visitor;

public class VisitorPatternTestClass 
{
	public static void main(String [] args[])
	{
		 
		 ProcessOrders placedOrders = new ProcessOrders();
     
     CaliforniaOrder order1 = new  CaliforniaOrder(100.0, 10.0);
     NonCaliforniaOrder order2 = new NonCaliforniaOrder(200.0);
     OverseasOrder order3 = new OverseasOrder(500.0,50.0)
     
     placedOrders.addOrder(order1);
     placedOrders.addOrder(order2);
     placedOrders.addOrder(order3);
     
     VisitorInterface v = new OrderVisitor();
     
     placedOrders.accept(v);
     
     
	}
}
