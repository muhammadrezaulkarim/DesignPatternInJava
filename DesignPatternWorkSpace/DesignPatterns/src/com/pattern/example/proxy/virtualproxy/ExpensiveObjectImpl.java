package com.pattern.example.proxy.virtualproxy;

public class ExpensiveObjectImpl implements ExpensiveObject {
 
    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }
     
    @Override
    public void process() {
        System.out.println("processing complete.");
    }
     
    private void heavyInitialConfiguration() {
        System.out.println("Loading initial configuration...");
    }
     
}
