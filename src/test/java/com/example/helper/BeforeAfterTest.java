package com.example.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAfterTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@Before
	public void setup() {
		System.out.println("Before Test");
	}
	@Test
	public void test1() {
		System.out.println("Test1 executed.");
	}
	@Test
	public void test2() {
		System.out.println("Test2 executed.");		
	}
	@After
	public void tearDown() {
		System.out.println("After Test");		
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
}