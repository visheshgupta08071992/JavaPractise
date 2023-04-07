package DSAPreparation.Grind75.String;

/*
* Leetcode - https://leetcode.com/problems/valid-palindrome-ii/
* Pepcoding - https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/arrays-and-strings/valid-palindrome-2/ojquestion
* Youtube - https://www.youtube.com/watch?v=nMjhRtYg2_A&list=TLGGpY9FTOTrtS4yNTExMjAyMg
* Given a string s, return true if the s can be palindrome after deleting at most one character from it.



Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false
*
*
* */

import org.testng.annotations.Test;

public class validPalindrome2 {

    @Test
    public void checkValidPalindromeAfterRemovingAtMostOneChar(){
       // String s="abcca";
        //String s="tebbem"
        //String s="cbbcc"
        String s="abc";
        int i=0;
        int j=s.length() -1;

        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                //skip from left or skip from right - Delete atmost one character
                boolean flag=isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
                System.out.println(flag);
                return;
            }
        }
        System.out.println("true");
    }

    public Boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
