package DSAPreparation.Grind75.String;

/*Write a java program to reverse each word of a given string? For example, If “Java Concept Of The Day” is input string then output should be “avaJ tpecnoC fO ehT yaD”.*/

/*
* LeetCode - https://leetcode.com/problems/reverse-words-in-a-string-iii/
*
* */

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

	@Test
	public void reverseEachWordOfStringUsingStringBuilder(){
		String s="Java Concept Of The Day";
		String [] str = s.split(" ");
		StringBuilder result = new StringBuilder();

		for(int i=0;i<str.length;i++){
			String original = str[i];
			StringBuilder reverse = new StringBuilder();

			for(int j=original.length()-1;j>=0;j--){
				reverse.append(original.charAt(j));
			}
			result.append(reverse);
			result.append(" ");
		}
		System.out.println(result.toString().trim());
	}
}
