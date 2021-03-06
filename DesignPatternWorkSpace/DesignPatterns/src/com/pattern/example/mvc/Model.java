package com.pattern.example.mvc;

public class Model extends java.util.Observable {	
	
	private int counter=0;	

	public Model()
	{

		System.out.println("Model()");
	} 


	public void setValue(int value) 
	{

		this.counter = value;
		System.out.println("Model init: counter = " + counter);
		setChanged();
		notifyObservers(counter);  // notify the registered views regarding the change in the value

	} 
	
	public void incrementValue() {

		++counter;
		System.out.println("Model     : counter = " + counter);
		setChanged();
		notifyObservers(counter); // notify the registered views regarding the change in the value


	} 
	
} 
