import junit.framework.*;

public class MyFixtureTest extends TestCase{
	protected int value1, value2;
	
	protected void setUp() {
		value1 = 2;
		value2 = 3;
	}
	public void testAdd() {
		int result = value1 + value2;
		assertTrue(result == 5);
	}
	
}
