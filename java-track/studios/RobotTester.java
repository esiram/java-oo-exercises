


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

}
