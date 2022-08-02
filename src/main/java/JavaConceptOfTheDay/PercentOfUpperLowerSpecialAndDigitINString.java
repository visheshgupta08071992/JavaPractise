package JavaConceptOfTheDay;

/*Write a java program to find the percentage of uppercase letters, lowercase letters, digits and special characters in a given string?*/

import org.testng.annotations.Test;

public class PercentOfUpperLowerSpecialAndDigitINString {

	@Test
	public void findpercentage(){
		String input="HiVishesh123$5@";
		char [] inputArray=input.toCharArray();
		int noOfdigits=0;
		int noOfUppercaseLetters=0;
		int noOfLowerCaseLetters=0;
		int noOfSpecialCharacters=0;

	    for(char c:inputArray){
	    	if(Character.isDigit(c)){
			    noOfdigits++;
		    }
	    	else if(Character.isLowerCase(c)){
			    noOfLowerCaseLetters++;
		    }
		    else if(Character.isUpperCase(c)){
			    noOfUppercaseLetters++;
		    }
		    else{
			    noOfSpecialCharacters++;
		    }
	    }
		System.out.println("No of Digits are " +noOfdigits);
		System.out.println("No of LowerCase letter are " +noOfLowerCaseLetters);
		System.out.println("No of UpperCase are " +noOfUppercaseLetters);
		System.out.println("No of SpecialCharacters are " +noOfSpecialCharacters);

	}
}
