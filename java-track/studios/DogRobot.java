
public class DogRobot extends Robot {
	
	private boolean happy;

	public DogRobot(String name, int x, int y, int speed, String orientation, boolean happy)
	{
		super(name, x, y, speed, orientation);
		this.happy = happy;
	}
	
	public void emotion()
	{
		if(this.happy == true)
			{
			String action = "Wag, Wag, Wag!";
			}
		else // this.happy == false
			{
			String action = "Grrrrrrr!";
			}
	}
	
}
