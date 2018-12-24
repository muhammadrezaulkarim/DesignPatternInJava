package com.pattern.example.adapter;

public class AdapterPatternTestClass
{
  public static void main(String[] args) 
  {
    BugattiVeyron luxuryCar = new  BugattiVeyron();
    luxuryCar.setSpeed(270.0);
    
    MovableAdapterImpl obj = new MovableAdapterImpl(luxuryCar);
    System.out.println(obj.getSpeed());
  }
}
