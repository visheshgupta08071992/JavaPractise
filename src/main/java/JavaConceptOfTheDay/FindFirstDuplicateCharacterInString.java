package JavaConceptOfTheDay;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class FindFirstDuplicateCharacterInString {

    @Test
    public void findFirstDuplicateCharacterInAString(){
        String input="HOOH";
        String inputLower=input.toLowerCase();
        char [] inputLowerCharArray=inputLower.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
        for(char ch:inputLowerCharArray){
            if(map.containsKey(ch)){
                System.out.println("First Duplicate Character is " +ch);
                map.put(ch,map.get(ch) + 1);
                break;
            }
            else{
                map.put(ch,1);
            }
        }
//        for(Map.Entry<Character,Integer> entry : map.entrySet()){                  //Here Entry Method Starts with Capital E
//            if(entry.getValue()>1){
//                System.out.println(entry.getKey() +" is repeted " + entry.getValue() + " times" );
//            }
//        }


    }
}
