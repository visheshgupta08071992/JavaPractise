package NumberSystem;


import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

//Given a no find the digit frequency in it
public class DigitFrequency {

    @Test
    public void findDigitFrequency(){
        int no=9597939;
        int digit=9;
        int remainder;
        int count=0;
        while(no >0){
            remainder=no%10;
            if(remainder==digit){
                count++;
            }
            no=no/10;
        }
        System.out.println("Count of  " + digit + " is : " + count);
    }

    @Test
    public void findDigitFrequencyUsingHashMap(){
        int no=9597939;;
        String number= String.valueOf(no);
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<number.length();i++){
            if(map.containsKey(number.charAt(i))){
                map.put(number.charAt(i),map.get(number.charAt(i)) + 1);
            }
            else{
                map.put(number.charAt(i),1);
            }

        }
        System.out.println("Count of 9 "  + " is : " + map.get('9'));
    }


}
