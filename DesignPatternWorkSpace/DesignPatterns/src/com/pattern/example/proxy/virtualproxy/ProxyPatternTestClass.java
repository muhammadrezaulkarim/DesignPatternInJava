package com.pattern.example.proxy.virtualproxy;

public class ProxyPatternTestClass 
{
    public static void main(String [] args[])
    {

      ExpensiveObject object = new ExpensiveObjectProxy();
      object.process();
      object.process();
    }
}
