import java.util.ArrayList;

public class CatRobot extends Robot {
	
	private String hissPurr;
	
	public CatRobot(String name, int x, int y, int speed, String orientation)
	{
		super(name, x, y, speed, orientation);
		hissPurr = "";
	}
	
	public void purr()
	{
		this.hissPurr = "Purr";
	}
	
	public void hiss()
	{
		this.hissPurr = "Hiss";
	}
	
	
public static void main(String args[])
{
	CatRobot a = new CatRobot("Fluffy", 1, 1, 5, "North");
	DogRobot b = new DogRobot("Buster", 1, 3, 4, "West");
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
