package com.pattern.example.factory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class FileLogger implements Logger
{
	
	public void log(String msg) 
	{
	        PrintWriter printer=null;
		File output=null ;
		
		try 
		{
		    output = new File("log.txt");
		    printer = new PrintWriter(output);
		}
		catch (FileNotFoundException e1) 
		{
		   e1.printStackTrace();
		}
		
	        try 
                {
                   printer.write(msg + System.getProperty("line.separator"));
		} 
                catch (Exception e) 
		{
		   e.printStackTrace();
		}
	        
		printer.flush();
		 
	}

}
