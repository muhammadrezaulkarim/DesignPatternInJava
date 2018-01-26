package com.pattern.example.observer;

public class CurrentMeasurementDisplay implements Observer
{
	private double temparature, humidity,pressure;
	private Observable weatherData;
	
	public CurrentMeasurementDisplay(Observable weatherData) throws Exception
	{
		this.weatherData=weatherData;
		this.weatherData.register(this);;
	}
	
	public void refreshMeasurementData(double temparature, double humidity,double pressure)
	{
		this.temparature=temparature;
		this.humidity=humidity;
		this.pressure=pressure;
		displayNewMeasurements();
	}
	
	public void displayNewMeasurements()
	{
		System.out.println("Current temparature:"+this.temparature + "Current humidity:"+this.humidity + "Current pressure:"+this.pressure);
	}
}
