package JavaConceptOfTheDay;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class ProgramToCheckWhetherStringIsAnagram {

//    Two strings are said to be anagram if they contain same set of characters but in different order.
//    For example, “Mother In Law” and “Hitler Woman” are anagrams.

    @Test
    public void checkAnagram() {
        String input1="abc";
        String input2="Dirty Room";
        Boolean flag=true;
        input1=input1.toLowerCase().replaceAll("\\s","");
        input2=input2.toLowerCase().replaceAll("\\s","");
        if(input1.length()==input2.length()){
            char [] inputArray1=input1.toCharArray();
            char [] inputArray2=input2.toCharArray();
            Map<Character,Integer> map=new HashMap<Character,Integer>();
            for(char ch :inputArray1){
              if(map.containsKey(ch)){
                  map.put(ch,map.get(ch) + 1);
                  }
              else{
                  map.put(ch,1);
              }
            }
            for(char ch :inputArray2){
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch) -1);
                }
                else{
                    map.put(ch,1);
                }
            }
            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                if(entry.getValue()!=0){
                    System.out.println("Both the Strings are not anagram");
                    flag=false;
                    break;
                }
            }
        }
        else{
            System.out.println("Both the Strings are not anagram");
            flag=false;
        }
        if(flag){
            System.out.println("Both the Strings are anagram");
        }

    }

    @Test
    public void checkAnagramApproach2(){
        String input1="Dormitory";
        String input2="Dirty Room";
        char [] input1Array=input1.toLowerCase().replaceAll("\\s","").toCharArray();
        char [] input2Array=input2.toLowerCase().replaceAll("\\s","").toCharArray();
        if(input1Array.length!=input2Array.length){
            System.out.println("The given Strings are not Anagram");
        }
        else{
            Arrays.sort(input1Array);
            Arrays.sort(input2Array);
            if(Arrays.equals(input1Array,input1Array)){
                System.out.println("The given Strings are Anagram");
            }
            else{
                System.out.println("The given Strings are not Anagram");
            }
        }
    }

    @Test
    public void checkAnagramApproach3(){
        String input1="Dormitorye";
        String input2="Dirty Room";
        String inputWithoutSpaceAndLowerCase=input2.toLowerCase().replaceAll("\\s","");
        char [] input1Array=input1.toLowerCase().replaceAll("\\s","").toCharArray();
        Boolean flag=true;
        for(char c:input1Array){
            int index=inputWithoutSpaceAndLowerCase.indexOf(c);
            if(index==-1){
                flag=false;
                System.out.println("The given Strings are not Anagram");
                break;
            }
        }
        if(flag){
            System.out.println("The given Strings are Anagram");
        }
    }
}
