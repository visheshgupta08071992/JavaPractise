package DSAPreparation.Grind75.String;

import org.testng.annotations.Test;

import java.util.*;

public class groupAnagrams {

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
