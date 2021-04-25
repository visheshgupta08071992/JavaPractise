package JavaConceptOfTheDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ReverseStringWithPreservingSpaces {

/*	Write a java program to reverse a string with preserving the position of spaces. For example, if “I Am Not String” is the given string then the reverse of this string with preserving the position of spaces is “g ni rtS toNmAI”. Notice that the position of spaces in the original string are maintained in the reversed string also. That means, if the given string has a space at index 3, then there should be also a space in the reversed string at index 3.*/


	@Test
	public void reverseStringWithPreservingSpace(){
		String input="I Am Not String";
		char [] inputArray=input.toCharArray();
		int countNoOfSpaces=0;
		List<Integer> spaceAtGivenIndex=new ArrayList<>();

		//Finding total No of spaces and index at which space is present
		for(int i=0;i<inputArray.length;i++){

			if(inputArray[i]==' '){
				countNoOfSpaces++;
				spaceAtGivenIndex.add(i);
			}
		}
		System.out.println(countNoOfSpaces);
		System.out.println(spaceAtGivenIndex);

        //Removing space from the String and reversing it
		String inputWithoutSpaces=input.replaceAll("\\s","");
		StringBuffer reverseWithoutSpaces=new StringBuffer();
		for(int i=inputWithoutSpaces.length()-1;i>=0;i--){
			reverseWithoutSpaces.append(inputWithoutSpaces.charAt(i));
		}

		System.out.println(reverseWithoutSpaces);

		//Adding Spaces in the reversed String at index of original String
		for(int i:spaceAtGivenIndex) {
			reverseWithoutSpaces.insert(i, " ");
		}
		System.out.println(reverseWithoutSpaces);
	}

	@Test
	public void reverseStringWithPreservingSpaceAnotherApproach(){
		String inputString="I Am Not String";
		//Converting inputString to char array 'inputStringArray'
		char[] inputStringArray = inputString.toCharArray();

		//Defining a new char array 'resultArray' with same size as inputStringArray

		char[] resultArray = new char[inputStringArray.length];

		//First for loop :
		//For every space in the 'inputStringArray',
		//we insert spaces in the 'resultArray' at the corresponding positions

		for (int i = 0; i < inputStringArray.length; i++)
		{
			if (inputStringArray[i] == ' ')
			{
				resultArray[i] = ' ';
			}
		}

		//Initializing 'j' with length of resultArray

		int j = resultArray.length-1;

		//Second for loop :
		//we copy every non-space character of inputStringArray
		//from first to last at 'j' position of resultArray

		for (int i = 0; i < inputStringArray.length; i++)
		{
			if (inputStringArray[i] != ' ')
			{
				//If resultArray already has space at index j then decrementing 'j'

				if(resultArray[j] == ' ')
				{
					j--;
				}

				resultArray[j] = inputStringArray[i];

				j--;
			}
		}

		System.out.println(inputString+" ---> "+String.valueOf(resultArray));
		System.out.println(Arrays.toString(resultArray));
	}
}
