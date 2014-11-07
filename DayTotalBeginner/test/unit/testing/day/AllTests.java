package unit.testing.day;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.totalbeginner.tutorial");
		// $JUnit-BEGIN$
		suite.addTestSuite(BookTest.class);
		suite.addTestSuite(PersonTest.class);
		// $JUnit-END$
		return suite;
	}
}
