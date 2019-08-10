package com.derivates.duplicateWord;

class CountCharacterInEachWords { 
	
    static void count(String givenString) 
    { 
        // Creating  a char array of given String 
        char[] characterArray = givenString.toCharArray(); 
        for (int index = 0; index < characterArray.length; index++) { 
  
            // Declare an String with empty initialization 
            String randomString = ""; 
  
            // When the character is not space 
            while (index < characterArray.length && characterArray[index] != ' ') { 
  
                // concat with the declared String 
            	randomString = randomString + characterArray[index]; 
            	index++; 
            } 
  
            if (randomString.length() > 0)  
                System.out.println(randomString + "-->" + randomString.length());             
        } 
    } 
    public static void main(String[] args) 
    { 
        String givenString = "I am a developer"; 
        count(givenString); 
    } 
} 
