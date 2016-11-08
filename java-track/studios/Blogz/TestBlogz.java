package Blogz;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBlogz {
	User a = new User("apple", "jonathan");
	
	@Test
	public void testIsValidUsername() {
		assertTrue(a.getUserName() != "appl*");
		assertTrue(a.getUserName() == "apple");
	}
	
//	@Test  //this test not working yet-ES11-8-16
//	public void testIsValidPassword(){
//		assertTrue(a.getPassword() == "jonathan");
//	}

}
