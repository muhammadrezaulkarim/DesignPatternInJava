package com.pattern.example.visitor;

public interface Order 
{
  public void accept(OrderVisitor v);
}
