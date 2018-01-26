package com.pattern.example.mvc;

import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.WindowEvent;	
import java.awt.event.WindowAdapter;	
import java.lang.Integer;		
import java.util.Observable;		
import java.awt.event.ActionListener;	


public class View implements java.util.Observer {

	//attributes as must be visible within class
	private TextField myTextField;
	private Button button; 

	
	View() {
		System.out.println("View()");	
		
		//frame in constructor and not an attribute as doesn't need to be visible to whole class
		Frame frame 		= new Frame("MVC Pattern");
		frame.add("North", new Label("counter"));

		myTextField 		= new TextField();
		myTextField.setText("" + 0);
		myTextField.setSize(20, 10);
		myTextField.setBackground(Color.LIGHT_GRAY);
		frame.add("Center", myTextField);

		//panel in constructor and not an attribute as doesn't need to be visible to whole class
		Panel panel 		= new Panel();
		button	 		= new Button("PressMe");
		panel.add(button);
		frame.add("South", panel);		

		frame.addWindowListener(new CloseListener());	
		frame.setSize(400,200);
		frame.setLocation(100,100);
		frame.setVisible(true);

	} //View()

	
	// Called from the Model. (This is the  method called from observable) 
  	public void update(Observable obs, Object obj) {

		myTextField.setText("" + ((Integer)obj).intValue());	//obj is an Object, need to cast to an Integer

  	}

  	// link the controller with the button to handle events
	public void addController(ActionListener controller)
	{
		System.out.println("View      : adding controller");
		button.addActionListener(controller);	
	} 

	// this code is invoked when the user clicks the close window icon
	public static class CloseListener extends WindowAdapter 
	{
		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			System.exit(0);
		} 
	} 

} 
