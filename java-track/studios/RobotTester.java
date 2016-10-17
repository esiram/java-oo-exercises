


import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTester {
	Robot t = new Robot("MrT", 1, 1, 3, "East");
	
	@Test
	public void testRotateRobot() 
	{
		assertTrue(t.getOrientation() == "East");
		t.rotateRobot();
		assertTrue(t.getOrientation() == "South");
	}
	@Test
	public void testMoveRobot()
	{
	    t.moveRobot(10);
	    assertTrue(t.getX() == 31);
	}
	@Test
	public void testRobotDistance()
	{
	Robot u = new Robot("Ms Piggy", 2, 2, 1, "North");
	t.robotDistance(u);
	//assertTrue()
	}
	
	@Test
	public void testGetDogEmotion()
	{
		DogRobot bb = new DogRobot("Blueberry", 3, 3, 3, "East", true);
		assertTrue(bb.getDogEmotion() == "Wag, Wag, Wag!");

		DogRobot cc = new DogRobot("Jimmy", 2, 2, 2, "West", false);
		assertTrue(cc.getDogEmotion() == "Grrrrrrr!");
	}
	@Test
	public void testGetCatEmotion()
	{
		CatRobot aa = new CatRobot("Mathilda", 3, 4, 5, "South", true);
		assertTrue(aa.getCatEmotion() == "Hisssssss!");
		
		CatRobot dd = new CatRobot("Slinky", 1, 1, 6, "West", false);
		assertTrue(dd.getCatEmotion() == "Purr, purr, purr!");
	}

}
