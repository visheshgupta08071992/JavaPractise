package DSAPreparation.Grind75.SlidingWindow;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* Leetcode - https://leetcode.com/problems/find-all-anagrams-in-a-string/
* Pepcoding - https://www.youtube.com/watch?v=slDyFUnGtoU
*
*Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
*
* */
public class findAllAnagramsInAString {
    //Sliding window concept is used here
    @Test
    public void findAllAnagram(){
        String s="cbaebabacd";
        String p="abc";

        /*String s = "baa"
        * String p="aa"
        *
        * String s = "ababababab"
          String p = "aab"

          String s = "aaaaaaaaaa"
          String p = "aaaaaaaaaaaaa"
        * */

        Map<Character,Integer> smap = new HashMap<>();
        Map<Character,Integer> pmap = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        if(p.length() > s.length()){
            System.out.println(list);
        }

        //Maintain the frequency of String p in pmap

        for(int i=0;i<p.length();i++){
            if(pmap.containsKey(p.charAt(i))){
                pmap.put(p.charAt(i),pmap.get(p.charAt(i)) + 1);
            }
            else{
                pmap.put(p.charAt(i),1);
            }
        }

        //Maintain the frequency of String s from 0 to the size of String p in pmap

        for(int i=0;i<p.length();i++){
            if(smap.containsKey(s.charAt(i))){
                smap.put(s.charAt(i),smap.get(s.charAt(i)) + 1);
            }
            else{
                smap.put(s.charAt(i),1);
            }
        }

        int i = p.length();
        // Iterate String S and slide it and check how many anagrams can be formed using the same
        while(i < s.length()){
            if(smap.equals(pmap)){
                list.add(i - p.length());
            }

            // Slide the window from end and add the character to
            char cAdd = s.charAt(i);
            if(smap.containsKey(cAdd)){
                smap.put(cAdd,smap.get(cAdd) + 1);
            }
            else{
                smap.put(cAdd,1);
            }

            // Sliding the window would also remove the element from start
            char cRemove = s.charAt(i - p.length());
            if(smap.get(cRemove) == 1){
                smap.remove(cRemove);
            }
            else{
                smap.put(cRemove,smap.get(cRemove) - 1);
            }
            i++;
        }
        if(smap.equals(pmap)){
            list.add(i - p.length());
        }
        System.out.println(list);
    }
}
