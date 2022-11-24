package junitdemo;
import static org.junit.Assert.assertEquals;

import org.junit.*;
public class testcase 
{
	
	@Test
public void testfind()
{
	assertEquals(10,junitlogic.logicdemo.find(8));
	assertEquals(10,junitlogic.logicdemo.find(10));
}

	@Test 
public void testfindmax()
{
	assertEquals(4,junitlogic.logicdemo.findMax(new int[] {1,3,4,2}));
	assertEquals(-1,junitlogic.logicdemo.findMax(new int[] {-1,-3,-4,-2}));
	
}


	
}
