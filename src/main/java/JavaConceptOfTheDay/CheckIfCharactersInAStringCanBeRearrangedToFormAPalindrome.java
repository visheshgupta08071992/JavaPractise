package JavaConceptOfTheDay;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CheckIfCharactersInAStringCanBeRearrangedToFormAPalindrome {

	//Given a String....Check if characters of a given string can be rearranged to form a palindrome. Return true if yes else false.

	/*
	* Example dda can be rearranged to form dad which is a palindrome
	* llvee can be rearranged to level which is a palindrom*
	The program is nicely explained here : https://www.youtube.com/watch?v=kCCv5fuyTIo
	 */

	@Test
	public void checkWhetherPalindromeIsFormed() {

		/*For a String to form a palindrome atmost one character should have odd frequence,rest all the characters
		should have even frequency*/

		String input="ababcdc"; // Palindrome can be formes abcdcba
		int count=0;
		Boolean flag=true;

		char [] inputArray=input.toCharArray();
		Map<Character,Integer> map=new HashMap<>();

		for(char c:inputArray){
			if(map.containsKey(c)){
				map.put(c,map.get(c) + 1);
			}
			else{
				map.put(c,1);
			}
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()){
			if(entry.getValue()%2!=0){
				count++;
				if(count>1){
					System.out.println("We cannot form a palindrome with given String");
					flag=false;
					break;
				}
			}
		}
		if(flag){
			System.out.println("We can form a palindrome with given String");
		}
	}
}
