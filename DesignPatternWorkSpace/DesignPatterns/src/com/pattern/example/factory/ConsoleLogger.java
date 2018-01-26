package com.pattern.example.factory;

import Utility.FileUtil;
import Utility.Logger;

public class ConsoleLogger implements Logger 
{
	public void log(String msg) 
	{
		System.out.println(msg);
	}
}
