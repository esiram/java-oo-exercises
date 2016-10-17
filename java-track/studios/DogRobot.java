
public class DogRobot extends Robot {
	
	private boolean happy;

	public DogRobot(String name, int x, int y, int speed, String orientation, boolean happy)
	{
		super(name, x, y, speed, orientation);
		this.happy = happy;
	}
	
	public String getDogEmotion()
	{
		String reaction = "";
		if(this.happy == true)
			{
			reaction = "Wag, Wag, Wag!";
			}
		else // this.happy == false
			{
			reaction = "Grrrrrrr!";
			}
		return reaction;
	}
	
}
