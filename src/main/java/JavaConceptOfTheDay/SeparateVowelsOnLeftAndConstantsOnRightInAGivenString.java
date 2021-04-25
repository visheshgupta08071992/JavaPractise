package JavaConceptOfTheDay;

//Write a Java Program to seperate Vowels on Left and Constatnts on Right in a given String

//Input:abcdeig
//Output:aeibcdg

import java.util.Arrays;

import org.testng.annotations.Test;

public class SeparateVowelsOnLeftAndConstantsOnRightInAGivenString {


	@Test
	public void SeparateVowelsOnLeftAndConstantsOnRightInAGivenString() {

		String input = "vishesh";
		char[] inputArray = input.toCharArray();
		char[] constantsArray = new char[inputArray.length];
		int count = 0;
		int countConstantArray = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == 'a' || inputArray[i] == 'e' || inputArray[i] == 'i' || inputArray[i] == 'o' || inputArray[i] == 'u') {
				inputArray[count] = inputArray[i];
				count++;
			} else {
				constantsArray[countConstantArray] = inputArray[i];
				countConstantArray++;
			}
		}
		for (int i = 0; count < inputArray.length; i++) {
			inputArray[count] = constantsArray[i];
			count++;
		}
		System.out.println(Arrays.toString(inputArray));
	}

	@Test
	public void SeparateVowelsOnLeftAndConstantsOnRightInAGivenStringWithoutUsingExtraStringVariable() {
		String input = "vishesh";
		char[] inputArray = input.toCharArray();
		int startingIndex = 0;
		int endingIndex = inputArray.length - 1;
		while (startingIndex < endingIndex) {
			if (isVowel(inputArray[startingIndex])) {
				startingIndex++;
			}
			if (!isVowel(inputArray[endingIndex])) {

				endingIndex--;
			}
			if (!isVowel(inputArray[startingIndex]) && isVowel(inputArray[endingIndex])) {
				char temp;
				temp = inputArray[startingIndex];
				inputArray[startingIndex] = inputArray[endingIndex];
				inputArray[endingIndex] = temp;
				startingIndex++;
				endingIndex--;
			}
		}
		System.out.println(Arrays.toString(inputArray));
	}

	public boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

			return true;
		} else {
			return false;
		}
	}

	@Test
	public void test() {
		String s = "vishesh";
		char [] sArray=s.toCharArray();
		int startIndex=0;
		int endIndex=s.length()-1;
		while(startIndex<endIndex){
			if(!isVowel(s.charAt(startIndex)) && isVowel(s.charAt(endIndex))){
				char temp=s.charAt(startIndex);
				sArray[startIndex]=sArray[endIndex];
				sArray[endIndex]=temp;
				startIndex++;
				endIndex--;
			}
			if (isVowel(s.charAt(startIndex))) {
				startIndex++;
			}
			if (!isVowel(s.charAt(endIndex))) {

				endIndex--;
			}
		}
		System.out.println(Arrays.toString(sArray));
	}

	@Test
	public void test2(){
		String s = "vishesh";
		char [] sArray=s.toCharArray();
		String vowel="";
		String consonant="";
		for(int i=0;i<=sArray.length-1;i++){
			if(isVowel(sArray[i])){
				vowel=vowel+sArray[i];
			}
			else{
				consonant=consonant+sArray[i];
			}
		}
		System.out.println(vowel+consonant);

	}
}

