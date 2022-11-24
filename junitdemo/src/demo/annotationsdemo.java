package demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class annotationsdemo 
{

	//execute before class (before all the test methods/ annotations)
	@BeforeClass
	public static void beforeCLass() {
		System.out.println("in before class");
	}
	
	//Execute after class
	@AfterClass
	public static void afterclass() {
		System.out.println("in After class");
	}
	
	//execute before (before each test method test method / text annotations)
	@Before
	public void before() {
		System.out.println("in before");
	}
	
	//execute after (after each test method test method / text annotations)
	@After
	public void after() {
		System.out.println("in after");
	}
	
	//test case
	@Test
	public void test() {
		System.out.println("in test");
	}
	@Test
	public void test1() {
		System.out.println("in test");
	}
	
}
