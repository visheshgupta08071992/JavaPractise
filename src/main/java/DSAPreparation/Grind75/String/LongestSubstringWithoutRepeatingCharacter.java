package DSAPreparation.Grind75.String;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

/*
* Leetcode - https://leetcode.com/problems/longest-substring-without-repeating-characters/
* Pepcoding -https://www.youtube.com/watch?v=9Kc0eZBGL1U
*
*
*
* */
public class LongestSubstringWithoutRepeatingCharacter {

    @Test
    public void findLongestSubstringWithoutRepeatingChar(){
       // String s = "abcabcbb";
        /*
        * String s = ""
        * String s=" "
        *
        * */
       // String s="pwwkew";
        String s ="abcdadcaebedabcdfeb";
        Set<Character> set = new HashSet<>();
        int j = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            //Try to Remove the duplicate element found at index i from left until J is less then or equal to i
            while(set.contains(s.charAt(i)) && j <= i) {
                set.remove(s.charAt(j));
                j++;
            }
            //Add the element to set window
            set.add(s.charAt(i));
            // Check the size of window and if greater then max then update max
            max = Math.max(max, set.size());
        }
        System.out.println(max);
    }
}
