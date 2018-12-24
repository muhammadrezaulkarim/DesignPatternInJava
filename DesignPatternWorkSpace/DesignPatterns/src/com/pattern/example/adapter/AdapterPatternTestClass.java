package com.pattern.example.adapter;

public class AdapterPatternTestClass
{
  public static void main(String[] args) 
  {
    // Prepare an incompatible class object
    BugattiVeyron luxuryCar = new  BugattiVeyron();
    luxuryCar.setSpeed(270.0);
    
    // Prepare a compatible class object feeding the incompatible class object
    MovableAdapterImpl obj = new MovableAdapterImpl(luxuryCar);
    System.out.println(obj.getSpeed());
  }
}
