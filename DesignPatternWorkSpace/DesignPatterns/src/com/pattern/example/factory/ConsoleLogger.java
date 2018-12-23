package com.pattern.example.factory;

public class ConsoleLogger implements MessageLogger 
{
	public void log(String msg) 
	{
		System.out.println(msg);
	}
}
