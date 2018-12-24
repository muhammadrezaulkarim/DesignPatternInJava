package com.pattern.example.visitor;

public class ProcessOrders
{
    private ArrayList<Order> orderList = new ArrayList<Order>();

    public addOrder(Order e) 
    {
      orderList.add(e)
    }
    
    public void accept(VisitorInterface v) 
    {
        for (Order e : this.orderList) 
        {
              e.accept(v);
        }
    }
}
