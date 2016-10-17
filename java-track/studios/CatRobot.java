import java.util.ArrayList;

public class CatRobot extends Robot {
	
	private boolean scared;
	
	public CatRobot(String name, int x, int y, int speed, String orientation, boolean scared)
	{
		super(name, x, y, speed, orientation);
		this.scared = scared;
	}
	
	public String getCatEmotion()
	{
		String reaction = "";
		if(this.scared == true)
		{
			reaction = "Hisssssss!";
		}
		else // this.scared == false
		{
			reaction = "Purr, purr, purr!";
		}
		return reaction;
	}
	
public static void main(String args[])
{
	CatRobot a = new CatRobot("Fluffy", 1, 1, 5, "North", true);
	DogRobot b = new DogRobot("Buster", 1, 3, 4, "West", false);
	Robot c = new Robot("Clingy", 5, 5, 3, "East");
	
	System.out.println(a.toString());
	System.out.println(b.toString());
	System.out.println(c.toString());
	
	a.moveRobot(4);
	b.moveRobot(5);
	c.moveRobot(1);
	
	System.out.println(a.toString());
	System.out.println(b.toString());
	System.out.println(c.toString());
	
	ArrayList<Robot> robots = new ArrayList<Robot>(); //Polymorphism in action
	robots.add(a);
	robots.add(b);
	robots.add(c);
	}
	
}
