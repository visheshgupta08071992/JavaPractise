package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class ReverseStringUsingRecurrsion {

	@Test
	public void reverseStringUsingRecurssion(){
		String s="Hello";
		s=reverseString(s);
		System.out.println("The reverse string is : " + s);

	}

	public String reverseString(String input){

		if(input.equals(null) || input.length()<=1){
			return input;
		}
		return reverseString(input.substring(1)) + input.charAt(0);
	}
}
