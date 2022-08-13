package DSAPreparation.Grind75.String;

/*
* Leetcode - https://leetcode.com/problems/backspace-string-compare/
* Explanation - https://www.youtube.com/watch?v=MGOjHoeMlsM
*
* Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.



Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
*
*
* */

import org.testng.annotations.Test;

public class BackSpaceStringCompare {

    @Test
    public void test(){
        String s="ab##";
        String t="c#d#";
        System.out.println(actualString(s).equals(actualString(t)));
    }

    public String actualString(String s){
        //Created StringBuilder Object for Storing the result
        StringBuilder sb = new StringBuilder();

        int hashCount=0;

        //Iterating the String from Last
        for(int i=s.length()-1;i>=0;i--){
            //If character is #,Increase the HashCount and contniue with next character
            if(s.charAt(i) == '#'){
                hashCount++;
            }
            else{
                if(hashCount==0){
                    sb.insert(0,s.charAt(i));
                }
                else{
                    hashCount--;
                }
            }
        }
        return sb.toString();
    }
}
