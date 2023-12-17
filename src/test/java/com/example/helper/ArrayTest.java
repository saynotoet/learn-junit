package com.example.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void testSortedArrayIfEquals_RandomArray() {
		int [] numbers = {12,4,5,3};
		int [] expected = {3,4,5,12};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(expected, numbers);
	}
	
	@Test
	public void testArray_NullArrayWithException() {
		int []numbers= null;
		try {
			Arrays.sort(numbers);

		}catch(NullPointerException e) {
			
		}
	}


	@Test
	public void testArray_NullArrayWithOutException() {
		int []numbers= {1,2,3};
		try {
			Arrays.sort(numbers);

		}catch(NullPointerException e) {
			
		}
	}

	
	@Test(expected = NullPointerException.class)
	public void testArray_NullArrayWithExpectedAttributeWithException() {
		int []numbers= null;
 		Arrays.sort(numbers);
	}
	
	@Test(expected = NullPointerException.class)
	public void testArray_NullArrayWithExpectedAttributeWithOutException() {
		int []numbers= {1,2,3};
 		Arrays.sort(numbers);
 
	}
	
	@Test(timeout = 10)//miliseconds
	public void testArray_performance() {
		int []numbers= {1,2,3};
		
		for(int i=0;i<100000;++i) {
			numbers[0]=i;
			Arrays.sort(numbers);
		}
 		
 
	}
	
}
