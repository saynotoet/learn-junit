package com.example.helper;

public class StringHelper {

	public String sayHelloWorld() {
       
        return "HelloWorld";
    }
	
	//ABCD => false, ABAB => true , AB => true , A=> false
	public boolean areFistAndLastTwoCharactersTheSame(String input) {
		if(input.length()==1)
			return false;
		if(input.length()==2)
			return true;
		
		String firstTwoChars=input.substring(0,2);
		String lastTwoChars=input.substring(input.length()-2);
	
		return firstTwoChars.equalsIgnoreCase(lastTwoChars);
	}
	
	public String removeFirstTwoA(String input) {
		 if (input == null) {
	            return null; // or throw an exception based on your requirements
	        }

	        StringBuilder result = new StringBuilder(input);
	        
	        int count = 0;
	        for (int i = 0; i < result.length(); i++) {
	            if (result.charAt(i) == 'A') {
	                result.deleteCharAt(i);
	                count++;

	                if (count == 2) {
	                    break;
	                }
	            }
	        }

	        return result.toString();
	    }
	
}
