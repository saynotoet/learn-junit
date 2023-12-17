package com.example.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper stringHelper=new StringHelper();
	
	@Test
	public void testRemoveFirstTwoA() {
		assertEquals("HelloWorld",stringHelper.sayHelloWorld());
		
		
	
	}

	//ABCD => false, ABAB => true , AB => true , A=> false

	@Test
	public void testAreFistAndLastTwoCharactersTheSame_basicNegativeTest() {
		assertFalse(stringHelper.areFistAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFistAndLastTwoCharactersTheSame_basicPositiveTest() {
		assertTrue(stringHelper.areFistAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFistAndLastTwoCharactersTheSame_twoCharacterInputTest() {
		assertTrue(stringHelper.areFistAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	public void testAreFistAndLastTwoCharactersTheSame_oneCharacterInputTest() {
		assertFalse(stringHelper.areFistAndLastTwoCharactersTheSame("A"));
	}
}
