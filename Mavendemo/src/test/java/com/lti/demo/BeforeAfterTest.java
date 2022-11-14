package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ltil.demo.Calculator;

class BeforeAfterTest {
	Calculator c = new Calculator();
	int sum;
	@BeforeAll
	public static void testDbConn() {
		System.out.println("db con is up");
	}
	
	@BeforeEach
	public void testStartup() {
		sum=500;
		System.out.println("Before Each");
	}
	@Test
	public void testsayHello() {
		Assertions.assertEquals("Hello",c.sayHello());
		
		sum=sum+1000;
		System.out.println(sum);
	}
	
	@Test
	public void testAdd() {
		Assertions.assertEquals(100,c.add(60,40),"check the code again");
		System.out.println(" testAdd");
		sum=sum+2000;
		System.out.println(sum);
	}
	
	@Test
	void testAssertFalse() {
		Assertions.assertTrue("meenal".length()==6);
		Assertions.assertFalse("meenal".length()==10);
		Assertions.assertNotEquals("Hello","hello");
	
			
	}
	@AfterAll
	public static void testDbClose(){
		System.out.println("once - db conn is closed");
	}
	
	@AfterEach
	public void testCleanUp() {
		sum=0;
		System.out.println("Clean up");
	}
}
