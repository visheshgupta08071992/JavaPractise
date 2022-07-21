package DSAPreparation.Grind75.String;

/*
* LeetCode - https://leetcode.com/problems/permutation-in-string/
*
* This program is similar to program findAllAnagramsInAString Leetcode - https://leetcode.com/problems/find-all-anagrams-in-a-string/
 * Pepcoding - https://www.youtube.com/watch?v=slDyFUnGtoU
 *
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.



Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
*
* */

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class permutationInString {

    @Test
    public void findPermutation(){
        String s1="ab";
        String s2="eidbaooo";

        if(s2.length() < s1.length()){
            System.out.println("false");
            return;
        }

        Map<Character,Integer> s2Map = new HashMap<>();
        Map<Character,Integer> s1Map = new HashMap<>();


        //Create the frequency count of String S1 in s1Map
        for(int i=0;i<s1.length();i++){
            if(s1Map.containsKey(s1.charAt(i))){
                s1Map.put(s1.charAt(i),s1Map.get(s1.charAt(i)) + 1);
            }
            else{
                s1Map.put(s1.charAt(i),1);
            }
        }

        //Create the frequency count of String S2 uptill the length of s1 in s2Map
        for(int i=0;i<s1.length();i++){
            if(s2Map.containsKey(s2.charAt(i))){
                s2Map.put(s2.charAt(i),s2Map.get(s2.charAt(i)) + 1);
            }
            else{
                s2Map.put(s2.charAt(i),1);
            }
        }

        int i=s1.length();

        //Iterate S2 and check how many permutations of S1 can be formed in S2
        while(i < s2.length()){

            if(s2Map.equals(s1Map)){
                System.out.println("true");
                return;
            }

            // If map is not equal slide the window by adding one element and removing 1 element

            // Adding the element in end

            if(s2Map.containsKey(s2.charAt(i))){
                s2Map.put(s2.charAt(i),s2Map.get(s2.charAt(i)) + 1);
            }
            else{
                s2Map.put(s2.charAt(i),1);
            }

            // Remove the element in start

            char cRemove = s2.charAt(i - s1.length());

            if(s2Map.get(cRemove) == 1){
                s2Map.remove(cRemove);
            }
            else{
                s2Map.put(cRemove,s2Map.get(cRemove) - 1);
            }
            i++;
        }
        if(s2Map.equals(s1Map)){
            System.out.println("true");
            return;
        }
        System.out.println("false");


    }
}
