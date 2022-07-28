package DSAPreparation.Grind75.String;

/*
* Leetcode -https://leetcode.com/problems/longest-common-prefix/
* Explanation - https://www.youtube.com/watch?v=wtOQaovlvhY
*
*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*
* */

import org.testng.annotations.Test;

import java.util.Arrays;

public class LongestCommonPrefix {

    @Test
    public void findLongestCommonPrefix(){
//        String [] strs = {"flower","flow","flight"};
        String [] strs = {"dog","racecar","car"};

        //Sort the string
        Arrays.sort(strs);

        System.out.println(Arrays.toString(strs));

        StringBuilder result = new StringBuilder();

        char [] s1 = strs[0].toCharArray();
        char [] s2 = strs[strs.length -1].toCharArray();

        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                break;
            }
            result.append(s1[i]);
        }
        System.out.println(result.toString());
    }
}
