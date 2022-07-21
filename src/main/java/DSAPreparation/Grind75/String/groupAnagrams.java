package DSAPreparation.Grind75.String;

import org.testng.annotations.Test;

import java.util.*;

/*
* leetcode - https://leetcode.com/problems/group-anagrams/
* pepcoding code - https://www.youtube.com/watch?v=NNBQik4phMI
*
* Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
* */

public class groupAnagrams {


    @Test
    public void groupAnagramBestApproachUsingSorting(){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat","eat"};
      //  String[] strs = {"",""};
        Map<String,List<String>> map=new HashMap<>();

        for(String str:strs){
            char [] ch = str.toCharArray();
            Arrays.sort(ch);
            String str1=String.valueOf(ch);
            if(map.containsKey(str1)){
              List<String> list=map.get(str1);
              list.add(str);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(str1,list);
            }
        }
        System.out.println(map.values());
    }

    @Test
    public void groupAnagramBestApproach(){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        //String[] strs = {"",""};
        Map<Map<Character,Integer>,ArrayList<String>> bigMap=new HashMap<>();

        for(String s:strs){
            Map<Character,Integer> map=new HashMap<>();
            for(int i=0;i<s.length();i++){
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
                }
                else{
                    map.put(s.charAt(i),1);
                }
            }
            if(bigMap.containsKey(map)){
                ArrayList<String> list=bigMap.get(map);
                list.add(s);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                bigMap.put(map,list);
            }
        }
        System.out.println(bigMap.values());
    }


    @Test
    /*This approach uses o(n2) complexity and does not work for
    * Input -> ["",""]
    * Expected -> [["",""]]
    * Actual which we are getting with below program is [[""]]
    * */
    public void groupAnagram() {
       // String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs = {"",""};
//         Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        List<List<String>> result = new ArrayList<>();
        Set<String> resultSet = new HashSet<>();

        for (int i = 0; i < strs.length; i++) {
            if(resultSet.contains(strs[i])){
                continue;
            }
            List<String> subResult = new ArrayList<>();
            String s1 = strs[i];
            subResult.add(s1);
            resultSet.add(s1);
            char[] s1Arr = s1.toCharArray();
            for (int j = i + 1; j < strs.length - 1; j++) {
                char[] s2Arr = strs[j].toCharArray();
                Boolean isAnagram = checkAnagram(s1Arr, s2Arr);
                if(isAnagram){
                    subResult.add(strs[j]);
                    resultSet.add(strs[j]);
                }
            }
            Boolean isAnagram = checkAnagram(s1Arr, strs[strs.length-1].toCharArray());
            if(isAnagram){
                if(!resultSet.contains(strs[strs.length-1])){
                    subResult.add(strs[strs.length-1]);
                    resultSet.add(strs[strs.length-1]);
                }
            }
            result.add(subResult);
        }
        System.out.println(result);
    }

    public Boolean checkAnagram(char[] s1Arr, char[] s2Arr) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1Arr) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c1 : s2Arr) {
            if (map.containsKey(c1)) {
                map.put(c1, map.get(c1) - 1);
            } else {
                map.put(c1, 1);
            }
        }
        for(char c : map.keySet()){
            if(map.get(c) > 0){
                return false;
            }
        }
        return true;
    }

}
