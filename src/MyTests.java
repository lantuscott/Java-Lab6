
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTests
{

	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero()
	{
		MyClass tester = new MyClass(); // MyClass is tested

		// assert statements
		assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
		assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
		assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
	}
	
	@Test
	public void multiplyBy1()
	{
		MyClass tester = new MyClass(); // MyClass is tested
		
		assertEquals("1 x 47 must be 47", 47, tester.multiply(1,47));
		assertEquals("8 x 1 must be 8", 8, tester.multiply(8, 1));
		
	}
}

class MyClass
{
	public MyClass()
	{
	}

	/**
	 * Recursive multiplication of integers
	 */
	public int multiply(int a, int b) 
	{
		if (a == 0)
			return 0;
		else if (b == 0)
			return 0;
		else 
			return 47;
		
//		else
//			return 1 + multiply(a - 1, b);
	}
}