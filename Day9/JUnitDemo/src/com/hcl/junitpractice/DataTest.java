package com.hcl.junitpractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {

	@Test
	public void testsayHello() {
		Data objdata = new Data();
		assertEquals("Welcome to JUnit", objdata.sayHello());
	}
	
	@Test
	public void testsum() {
		Data obj = new Data();
		assertEquals(4,obj.sum(2, 2));
		assertEquals(4,obj.sum(1, 3));
	}
	
	@Test
	public void testmax3() {
		Data obj = new Data();
		assertEquals(5,obj.max3(5, 1, 3));
		assertEquals(5,obj.max3(1, 5, 3));
		assertEquals(5,obj.max3(1, 3, 5));
	}
	
	@Test
	public void testminArray() {
		Data obj = new Data();
		int[] x = {1,5,6,7,2,8};
		int[] x1 = {5,6,7,2,8,1};
		assertEquals(1,obj.minArray(x));
		assertEquals(1,obj.minArray(x1));
	}
	
	@Test
	public void testeven() {
		Data obj = new Data();
		assertTrue(obj.even(8));
		assertFalse(obj.even(11));
	}
	
	@Test
	public void testgetPropertyTest() {
		Data obj = new Data();
		assertNotNull(obj.getPropertyTest("Bhargav"));
		assertNull(obj.getPropertyTest("Tushar"));
	}
	
	@Test
	public void testdiv() {
		Data obj = new Data();
		assertEquals(2,obj.div(5,2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testdivEx() {
		Data obj = new Data();
		obj.div(5,0);
	}
	@Test(expected = NullPointerException.class)
	public void testNullEx() {
		Data obj = null;
		assertEquals(5,obj.sum(2, 3));
	}
}
