

import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu {
	
	private ArrayList<Robot> robots; // creating an array list to hold robot objects - but you added this to Cat earlier... may need to move this.
	private Scanner s;
	
	public static void main(String[] args)
	{
		int x = 0;
		RobotMenu rm = new RobotMenu();    // sentinal structure that does stuff until we get a value that doesn't qualify and then it exits.
		do {
			x = rm.startMenu();
			rm.processInput(x);
		} while (x != 6); //x is the number in the video put number limit for options.  this option is exit
	}
	
	//constructor (to make sure the instance variables have values)
	public RobotMenu()
	{
		s = new Scanner(System.in);  //initializes the scanner and takes in a "print stream" (the "System.in" - the input to the console as our stream)
		robots = new ArrayList<Robot>(); // initialize the array list -- this creates an empty array list.
	}
	
	public int startMenu()
	{
		System.out.println("Welcome to the robot menu!");
		System.out.println("1. Create a robot.");
		System.out.println("2. Display available robots.");
		System.out.println("3. Move a robot.");
		System.out.println("4. Rotate a robot.");
		System.out.println("5. Compute distance between two robots.");
		System.out.println("6. Exit program.")
		
		
		
	}

}
