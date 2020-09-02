package JavaConceptOfTheDay;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class FindDuplicateCharactersInString {

    @Test
    public void findDuplicateCharactersInAString(){
        String input="Happy Birthday Vishesh";
        String inputLower=input.toLowerCase();
        char [] inputLowerCharArray=inputLower.toCharArray();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(char ch:inputLowerCharArray){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch) + 1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){                  //Here Entry Method Starts with Capital E
            if(entry.getValue()>1){
                System.out.println(entry.getKey() +" is repeted " + entry.getValue() + " times" );
            }
        }


    }
}
