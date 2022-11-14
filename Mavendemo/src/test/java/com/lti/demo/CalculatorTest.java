package com.lti.demo;

import com.ltil.demo.Calculator;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator c = new Calculator();
	@Disabled
	@Test
	public void testsayHello() {
		Assertions.assertEquals("Hello",c.sayHello());
		
	}
	
	@Test
	public void testAdd() {
		Assertions.assertEquals(100,c.add(60,40),"check the code again");
	}
	
	@Test
	void testAssertFalse() {
		Assertions.assertTrue("meenal".length()==6);
		Assertions.assertFalse("meenal".length()==10);
		Assertions.assertNotEquals("Hello","hello");
			
	}
	
	@Test
	void testAssertNull() {
		String str1=null;
		String str2="abcd";
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
		
	}
	
	@Test
	public void TestEmptyArrayList() {
		ArrayList<Integer> myList= new ArrayList<Integer>();
		Assertions.assertEquals(0,myList.size());
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2,myList.size());
		
	}
}
