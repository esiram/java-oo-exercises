package Blogz;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBlogz {
	User a = new User("apple", "jonathan");
	
	@Test
	public void testIsValidUsername() {
		assertTrue(a.getUserName() == "apple");
	}

}
