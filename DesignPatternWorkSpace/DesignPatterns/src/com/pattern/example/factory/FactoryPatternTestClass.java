package com.pattern.example.factory;

public class FactoryPatternTestClass 
{
	public static void main(String [] args[])
	{
		 
		 LoggerFactory factory=new LoggerFactory();
		 
		 // Returns a object based on current configuration
		 MessageLogger logger=factory.getLogger();
		 logger.log("A message to log.");
	}
}
