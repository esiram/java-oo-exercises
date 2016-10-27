package javagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavagramTest {

	@Test
	public void testBlackWhiteFilter() {
		Picture p = new Picture("mentorcenter.jpg");
		// filter and display image
		Picture processed = BlackWhiteFilter.process(p);
		processed.show();
		fail("Not yet implemented");
	}

}
