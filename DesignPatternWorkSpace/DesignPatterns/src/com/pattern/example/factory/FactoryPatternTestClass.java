package com.pattern.example.factory;

import Utility.Logger;

public class FactoryPatternTestClass 
{
	public static void main(String [] args[])
	{
		 LoggerFactory factory=new LoggerFactory();
		 Logger logger=factory.getLogger();
		 logger.log("A message to log.");
	}
}
