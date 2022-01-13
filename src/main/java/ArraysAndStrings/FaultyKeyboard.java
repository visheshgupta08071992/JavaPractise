package ArraysAndStrings;

import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
*
*PeepCoding -> https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/arrays-and-strings/faulty_keyboard/ojquestion
* LeetCode -> https://leetcode.com/problems/long-pressed-name/submissions/
*
*
*
* */

public class FaultyKeyboard {


    @Test
    public void FaultyKeyBoardWithArray(){
        String name="pyplrz";
        String typed = "ppyypllr";
        int i=0;
        int j=0;
        while(i < name.length() && j<typed.length()){
            if(name.charAt(i) == typed.charAt(j) ){
                i++;
                j++;
            }
            else if(i>0 && typed.charAt(j)==name.charAt(i-1)){
                j++;
            }
            else{
                System.out.println("Typed name cannot make original name");
                return;
            }
        }
        while(j < typed.length()){
            if(typed.charAt(j) != name.charAt(i-1)){
                System.out.println("Typed name cannot make original name");
                return;
            }
            else{
                j++;
            }
        }
        if(i<name.length()){
            System.out.println("Typed name cannot make original name");
            return;
        }
        else{
            System.out.println("Typed name can make original name");
            return;
        }
    }

    @Test
    public void FaultyKeyBoardWithHashMap(){

        /*//Hashmap we are not able to solve scenario where
        * name is alex and typed is aaleexa. Rest all the cases are passing with below code */
        String name="pyplrz";
        String typed = "ppyypllr";
        Boolean flag=true;
        Map<Character,Integer> nameMap=new LinkedHashMap<>();
        Map<Character,Integer> typedMap=new LinkedHashMap<>();
        for(int i=0;i<name.length();i++){
            char c= name.charAt(i);
            if(nameMap.containsKey(c)){
                nameMap.put(c,nameMap.get(c) + 1);
            }
            else{
                nameMap.put(c,1);
            }
        }

        for(int i=0;i<typed.length();i++){
            char c = typed.charAt(i);
            if(typedMap.containsKey(c)){
                typedMap.put(c,typedMap.get(c) + 1);
            }
            else{
                typedMap.put(c,1);
            }
        }
        System.out.println(nameMap);
        System.out.println(typedMap);

        if(nameMap.size()!=typedMap.size()){
            System.out.println("Typed name cannot make original name");
            return;
        }

        List<Character> nameMapSet=nameMap.keySet().stream().collect(Collectors.toList());
        List<Character> typeMapSet=typedMap.keySet().stream().collect(Collectors.toList());
        for(int i=0;i < nameMapSet.size();i++){
            if(nameMapSet.get(i) != typeMapSet.get(i)){
                System.out.println("Typed name cannot make original name");
                flag=false;
                break;
            }
        }

        for(char c : nameMap.keySet()){
            if(typedMap.get(c) == null){
                System.out.println("Typed name cannot make original name");
                flag=false;
                break;
            }
            if(typedMap.get(c) < nameMap.get(c)){
                System.out.println("Typed name cannot make original name");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Typed name can make original name");
        }
    }

}
