package JavaConceptOfTheDay;

/*Write a java program to reverse each word of a given string? For example, If “Java Concept Of The Day” is input string then output should be “avaJ tpecnoC fO ehT yaD”.*/

import org.testng.annotations.Test;

public class ReverseEachWordOfString {

	@Test
	public void reverseEachWordOfString(){
		String s="Java Concept Of The Day";
		String [] sArray=s.split(" ");
		String reverseString="";

		for(int i=0;i<sArray.length;i++){
			String input=sArray[i];
			String reverseWord="";
			for(int j=sArray[i].length()-1;j>=0;j--){
				reverseWord=reverseWord + sArray[i].charAt(j);
			}
			reverseString=reverseString + reverseWord + " ";
		}
		System.out.println(reverseString);
	}
}
