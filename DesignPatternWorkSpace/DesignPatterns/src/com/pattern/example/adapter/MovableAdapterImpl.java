package com.pattern.example.adapter;

public class MovableAdapterImpl implements MovableAdapter 
{
    # original incompatible interface
    private Movable luxuryCar;
     
    // standard constructors
    public MovableAdapterImpl(Movable luxuryCar)
    {
       this.luxuryCar = luxuryCar;
    }
 
    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCar.getSpeed());
    }
     
    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
