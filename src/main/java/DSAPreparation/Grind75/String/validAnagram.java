package DSAPreparation.Grind75.String;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class validAnagram {

    @Test
    // Using HashMap, The Time and space complexity is o(n).
    public void usingHashMap(){

        String s="anagram";
        String t="nagaram";

        if(s.length() !=t.length()){
            System.out.println("Strings are not anagram");
            return;
        }

        char [] s1= s.toCharArray();
        char [] t1= t.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        for(char c : s1){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }
            else{
                map.put(c,1);
            }
        }

        for(char c1 : t1){
            if(map.containsKey(c1)){
                map.put(c1,map.get(c1) - 1);
            }
            else{
                map.put(c1,1);
            }
        }

        for(char c : map.keySet()){
            if(map.get(c) > 0){
                System.out.println("Strings are not anagram");
                return;
            }
        }
        System.out.println("Strings are  anagram");
    }

    @Test
    public void usingSort(){
        //The Given approach checks Anagram using Sortting and comapring array.  Since we are sorting time complexity is o(nlogn)
        String s="anagram";
        String t="nagaram";

        if(s.length() !=t.length()){
            System.out.println("Strings are not anagram");
            return;
        }

        char [] s1= s.toCharArray();
        char [] t1= t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(t1));

        for(int i=0;i<s1.length;i++){
                if(s1[i] !=t1[i]){
                    System.out.println("Strings are not anagram");
                    return;
                }
        }
        System.out.println("Strings are anagram");
    }
    }

