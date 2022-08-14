package JavaConceptOfTheDay;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test345 {

    @Test
    public void test(){
        String input="50552";
        int max=0;

        for(int i=0;i<input.length()-1;i++){
            if(Integer.valueOf(String.valueOf(input.charAt(i)) + String.valueOf(input.charAt(i+1))) >max){
                max=Integer.valueOf(String.valueOf(input.charAt(i)) + String.valueOf(input.charAt(i+1)));
            }
        }
        System.out.println(max);
    }
    /*Input : abc abcd\b abc \n ababab abc
    Output : abc abc abc
            ababab*/
    @Test
    public void test2(){
        String input="abc abcd\\b abc \\n ababab abc";
        StringBuilder result = new StringBuilder();

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='\\'){
               if(input.charAt(i+1)=='b'){
                   result.deleteCharAt(result.length() -1);
               }
               else if(input.charAt(i+1)=='n'){
                   result.append('\n');
               }
               i++;
            }
            else{
                result.append(input.charAt(i));
            }
        }
        System.out.println(result);
    }

    @Test
    public void findDuplicateCharacters(){
        String s="Better Butter";
        char [] chArr=s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(char c: chArr){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }
            else{
                map.put(c,1);
            }
        }
        for(char key:map.keySet()){
            if(map.get(key)>1){
                System.out.println(key + "  ->   " + map.get(key));
            }
        }

        System.out.println("-------------------");
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + "  ->   " + entry.getValue());
            }
        }
    }

    @Test
    public void test5(){
        int no=153;
        int no1=no;
        int length = String.valueOf(no).length();
        int sum=0;

        while(no>0){
            int n1=no%10;
            int product=1;
            for(int i=1;i<=length;i++){
                product = product*n1;
            }
            sum=sum+product;
            no=no/10;
        }
        if(sum==no1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
