package SeleniumPractise.HandlingDropDowns;

import org.testng.annotations.Test;

public class ClariInterview2 {

	@Test
	public void revesreString(){
		String input="Today is Wednesday";
		String reverse="";
		String [] inputArray=input.split(" ");
		for(int i=0;i<=inputArray.length-1;i++){
			String word=inputArray[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--){
				reverseWord=reverseWord + word.charAt(j);
			}
			reverse = reverse + reverseWord + " ";
		}
		System.out.println("Reverse is  "+ reverse);
	}
}
