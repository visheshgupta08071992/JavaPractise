package DSAPreparation.Grind75.String;

/*
* Leetcode - https://leetcode.com/problems/rotate-string/
*
* Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.


Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false

Input: s = "aa", goal = "a"
Output: false

* */


import org.testng.annotations.Test;

public class RotateString {

    @Test
    public void checkRotation(){
        String s="abcde";
        String goal="cdeab";

        if(s.length() > goal.length()){
            System.out.println("false");
            return;
        }

        //Concatinate s with s
        s = s+s;

        // If concatinated  s contains goal then after few shift g, goal can be formed

        if(s.contains(goal)){
            System.out.println("true");
            return;
        }
        else{
            System.out.println("false");
            return;
        }

    }
}
