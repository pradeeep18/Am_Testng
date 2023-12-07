package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng {
	
	@BeforeClass
	public void test1() {
		System.out.println("before class");
	}
	@BeforeMethod
	public void test2() {
		System.out.println("before method ");
	}
	@Test 
	public void test6() {
		System.out.println("test 3");
	}
	@Test 
	public void test7() {
		System.out.println("test 3");
	}
	@Test 
	public void test3() {
		System.out.println("test 3");
	}
	@AfterMethod
	public void test4() {
		System.out.println("after method");
	}
	@AfterClass
	public void test5() {
		System.out.println("after class");
	}
}
