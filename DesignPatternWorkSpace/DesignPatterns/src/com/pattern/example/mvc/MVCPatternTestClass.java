package com.pattern.example.mvc;

/*The Model-View-Controller architectural pattern (MVC) divides an
interactive application into three components. The model contains
the core functionality and data. Views display information to the user.
Controllers handle user input. Views and controllers together
comprise the user interface. A change-propagation mechanism
ensures consistency between the user interface and the model. */

/*Model: The model component contains the functional core of the application.
It encapsulates the appropriate data, and exports procedures that
perform application-specific processing. Controllers call these procedures
on behalf of the user. The model also provides functions to
access its data that are used by view components to acquire the data
to be displayed.*/

/*View components present information to the user. Different views
present the information of the model in different ways. Each view
defines an update procedure that is activated by the changepropagation
mechanism. When the update procedure is called, a view
retrieves the current data values to be displayed from the model, and
puts them on the screen. */


public class MVCPatternTestClass {


	private int start_value = 0;	

	public void TestMVC() 
	{
		//create Model and View
		Model myModel 	= new Model();
		View myView 	= new View();

		//registers relevant views with the Model
		myModel.addObserver(myView);

		//create Controller. Link the controller with the associated Model and View
		Controller myController = new Controller();
		myController.addModel(myModel);
		myController.addView(myView);

		//link the controller with the view
		myView.addController(myController);
	} 
	

	public static void main(String[] args)
	{

		MVCPatternTestClass ob = new MVCPatternTestClass();
		ob.TestMVC();

	} 
} 
