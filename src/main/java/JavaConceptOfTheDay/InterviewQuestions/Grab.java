package JavaConceptOfTheDay.InterviewQuestions;

/*Write a function solution that given a String S of length N,return any palindrome which can be obtained by
replacing all of the question marks in S by lowercase letters('a'-'z').If no palindrome can be obtained,the function
should return the String "NO"

Examples:
Given S="?ab??a",the function should return "aabbbaa"
Given S="bab??a",the function should return "NO"
Given S="?a?",the function may return "aaa".It may also return "zaz" among other possible answers.

*/


import org.testng.annotations.Test;

public class Grab {

	@Test
	public void testPalindrome(){

		//Hint: For a string to be palindrome,first index should be same as last index,2nd index should be same as
		// second last index and so on.
		String input="?aa";
		String outPut=checkPalindrome(input);
		System.out.println(outPut);

	}

	public String checkPalindrome(String input){

		char [] inputArray=input.toCharArray();
		int i=0;
		int j=inputArray.length - 1;
		while(i<j){

			if(inputArray[i]==inputArray[j]){

				if(inputArray[i]=='?' && inputArray[j]=='?'){
					//If both starting and ending index are ?, we need to add same value at both index and then increment and decrement the indexes
					inputArray[i]='a';
					inputArray[j]='a';
					i++;
					j--;
				}
				else{
					//If both starting and ending index are same and not ? we just need to increment and decrement the
					// indexes
					i++;
					j--;
				}
			}
			else if(inputArray[i]=='?' && inputArray[j]!='?'){
				inputArray[i]=inputArray[j];
				i++;
				j--;
			}
			else if(inputArray[i]!='?' && inputArray[j]=='?'){
				inputArray[j]=inputArray[i];
				i++;
				j--;
			}
			else {
				//Strings are not palindrome if the first index and correspondinf last index is not same,
				// Correspondingly 2nd index should should match 2nd last index and So on.
				return "NO";
			}

		}
		return String.valueOf(inputArray);
	}
}
