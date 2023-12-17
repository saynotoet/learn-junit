package com.example.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParametrizedTest {

	StringHelper stringHelper=new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	public StringHelperParametrizedTest(String input,String expectedOutput) {
		this.input=input;
		this.expectedOutput=expectedOutput;
	}
	
	
	@Parameters
	public static Collection<String[]> testParametrizedConditions(){
		String expectedOutput[][]= {{"BB","AABB"},{"BAB","ABAB"},{"A","AAA"}};
	
		
		return Arrays.asList(expectedOutput);
	}
	
	@Test
	public void testRemoveFirstTwoA() {
		assertEquals("HelloWorld",stringHelper.sayHelloWorld());
		 
	
	}
 	
	 
	 
}
