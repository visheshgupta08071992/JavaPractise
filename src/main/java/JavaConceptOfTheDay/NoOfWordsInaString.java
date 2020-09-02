package JavaConceptOfTheDay;

//Java Program to find no of words in a String

import org.testng.annotations.Test;

public class NoOfWordsInaString {

	@Test
	public void noOfWordsInAString(){
		String input="My name is vishesh";
		String [] inputArray=input.split(" ");
		System.out.println("No of word in " +input+ " is " + inputArray.length);
	}
}
