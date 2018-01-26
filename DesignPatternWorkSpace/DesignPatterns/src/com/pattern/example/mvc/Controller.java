package com.pattern.example.mvc;

public class Controller implements java.awt.event.ActionListener 
{

	private Model model;
	private View view;

	public Controller() 
	{	
		System.out.println ("Controller()");
	} 

	//this method is invoked when a button is pressed
	public void actionPerformed(java.awt.event.ActionEvent e)
	{

		System.out.println("Controller: acting on Model");
		model.incrementValue();
	} 


	public void addModel(Model m)
	{
		System.out.println("Controller: adding model");
		this.model = m;
	}

	public void addView(View v)
	{
		System.out.println("Controller: adding view");
		this.view = v;
	} 

} 
