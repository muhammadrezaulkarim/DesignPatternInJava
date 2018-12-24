package com.pattern.example.adapter;

public class BugattiVeyron implements Movable 
{
    private double speed = 0.0;
    
    // set speed in MPH
    public double setSpeed(double speed) 
    {
        this.speed = speed;
    }
    
    // get speed in MPH
    @Override
    public double getSpeed() 
    {
        return speed;
    }
}
