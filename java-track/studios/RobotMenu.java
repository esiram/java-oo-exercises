

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
		System.out.println("6. Exit program.");
		int selection = s.nextInt(); //calling scanner to use the next integer method; if user puts in a non integer higher than x (6 here), this will fail :(
		while(selection < 0 || selection >6)
		{
			System.out.println("Invalid selction, please try agains:");
			selection =  s.nextInt();
		}
		return selection;
	}
	
	public void processInput(int selection) // keep process separate from verification of user input (see startMenu() function).
	{
		if (selection == 1)
		{
			createRobot();
		}
		else if(selection == 2)
		{
			displayRobots();
		}
		else if(selection == 3)
		{
			moveRobots();
		}
		else if(selection == 4)
		{
			rotateRobots();
		}
		else if(selection == 5)
		{
			determineDistanceRobots();
		}
		
	}
	
	private void displayRobots()
	{
		for(int i = 0; i < robots.size(); i++)
		{
			System.out.println((i+1) + ".)" + robots.get(i));  // where i is the index of robots ( similar to robots[i], but calling a method this time)
		}
	}
	
//	private Robot moveRobots() 
//	{
//		System.out.println("How long should the robot move?");	
//	}
	
	private void createRobot()
	{
		System.out.println("Please provide the robot's name.");
		String name = s.next();   //is this the robot's to string method or is it a different method that's called by the scanner function?
		
		System.out.println("Please enter the robot's x coordinate.");
		int x = s.nextInt();
		
		System.out.println("Please enter the robot's y coordinate.");
		int y = s.nextInt();
		
		System.out.println("Please enter the robot's speed.");
		int speed = s.nextInt();
		

		System.out.println("Please enter the robot's orientation (i.e. North, East, South, West).");
		String orientation = s.next();
		
		robots.add(new Robot(name, x, y, speed, orientation));
	}
	

}
