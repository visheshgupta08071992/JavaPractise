package JavaConceptOfTheDay.InterviewQuestions;

import org.testng.annotations.Test;

public class Grab2 {

	//You are given a String Consisting of Digits.Find the Largest Two digit value in the given String.

	/*
	Examples:
	50552 => Output 55
	10101 => Output 10
	88 => Output 88
	* */

	@Test
	public void findLargestTwoDigitNoInAString(){
		String input="50552";
		int max=0;
		for(int i=0;i<input.length()-1;i++){
			//Concatination Operator of String works only with string,hence converting each character into string and
			// Conncatinating, if we use concatination operator with Character then it would sum the ascii values of
			// character
			String twoDigitNoString=String.valueOf(input.charAt(i))+String.valueOf(input.charAt(i+1));
			//Converting Two Digit String into Two Digit No
			int twoDigitNo = Integer.parseInt(twoDigitNoString);
			if(twoDigitNo>max){
				max=twoDigitNo;
			}
		}
		System.out.println("Largest Two Digit No in a given String is : " + max );
	}

	@Test
	public void findLargestTwoDigitNoInAStringWithoutUsingStringFunctions(){
		String input="56552";
		int max=0;
		for(int i=0;i<input.length()-1;i++){

			//We need to use Character.getNumeric value,if we directly assign character value to int,it would assign
			// ascci value of character to int
			int twoDigitNo=
					(Character.getNumericValue(input.charAt(i)))*10 + Character.getNumericValue(input.charAt(i+1));
			if(twoDigitNo>max){
				max=twoDigitNo;
			}
		}
		System.out.println("Largest Two Digit No in a given String is : " + max );
	}
}
