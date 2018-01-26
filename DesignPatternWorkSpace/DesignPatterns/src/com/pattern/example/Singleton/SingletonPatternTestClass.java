package com.pattern.example.Singleton;

import Utility.Logger;

import com.pattern.example.factory.FileLogger;
import com.pattern.example.strategy.CodeBookCypher;
import com.pattern.example.strategy.EncryptLogger;
import com.pattern.example.strategy.EncryptionStrategy;
import com.pattern.example.strategy.SubstitutionCypher;

public class SingletonPatternTestClass 
{
	
		public static void main(String[] args) 
		{
			
			Logger logger = new FileLogger();  //first strategy
			logger.log("A message to be written in the file");
			
		}//End of class

}
