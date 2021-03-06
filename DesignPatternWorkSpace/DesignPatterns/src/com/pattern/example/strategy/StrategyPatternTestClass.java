package com.pattern.example.strategy;

import com.pattern.example.factory.FileLogger;

public class StrategyPatternTestClass 
{
	public static void main(String[] args) 
	{
		
		FileLogger logger = new FileLogger();  //first strategy
		EncryptLogger eLogger = new EncryptLogger(logger);
		eLogger.log("this message is to be encrypted and logged");
		
		EncryptionStrategy strategy = new SubstitutionCypher(); //second strategy
		eLogger.setEncryptionStrategy(strategy);
		eLogger.log("this message is to be encrypted and logged");
		
		strategy = new CodeBookCypher(); // third strategy
		eLogger.setEncryptionStrategy(strategy);
		eLogger.log("This is a true statement");
		
	}//End of class

}
