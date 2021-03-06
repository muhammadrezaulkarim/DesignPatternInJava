package com.pattern.example.Singleton;

import Utility.FileUtil;
import Utility.Logger;

//Singleton pattern is helpful when there is only
//one physical instance of what the object represents.

//we may need a single database connection object in an application. The Singleton pattern
//is useful in such cases because it ensures that there exists one and only one
//instance of a particular object ever.

//In an application, when different client objects try to log messages to the file, there could potentially be
//multiple instances of the FileLogger class in use by each of the client objects.
//This could lead to different issues due to the concurrent access to the same file
//by different objects. So, only one instance of the object will allowed to be created


public class FileLogger implements Logger {

	private static FileLogger logger;  // private static instance of the same class

	private static FileLogger getFileLogger()
	{
		if (logger == null) 
		{
			logger = new FileLogger();
		}
		return logger;
	}
//This could lead to different issues due to the concurrent access to the same file
//	by different objects.
	public synchronized void log(String msg) 
	{
		FileUtil futil = new FileUtil();
		futil.writeToFile("log.txt", msg, true, true);
	}

}
