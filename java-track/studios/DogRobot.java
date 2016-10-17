
public class DogRobot extends Robot {
	
	private String wagGrowl;

	public DogRobot(String name, int x, int y, int speed, String orientation)
	{
		super(name, x, y, speed, orientation);
		wagGrowl = "";
	}
	
	public void wag()
	{
		this.wagGrowl = "wag, wag, wag";
	}
	
	public void growl()
	{
		this.wagGrowl = "Grrrrrrr";
	}
	
}
