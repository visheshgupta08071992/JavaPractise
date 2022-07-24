package DSAPreparation.Grind75.Array;

/*
* LeetCode - https://leetcode.com/problems/longest-consecutive-sequence/
* Pepcoding - https://www.youtube.com/watch?v=YWXbu5uyGXs
*
* */

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

    @Test
    public void findLongestConsecutiveIndex(){
        int [] arr={10,5,9,1,11,8,6,5,3,12,2};
        Map<Integer,Boolean> map = new HashMap<>();

        //Add all the element of array into Map and map it to True
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],true);
        }

        //Mark all the element to False who does not start the sequence

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i] -1)){
                map.put(arr[i],false);
            }
        }
   //     System.out.println(map);

        //Sequence starts with element which are mapped to true
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i]) == true){
                int count=1;
                int j=1;
                while(map.containsKey(arr[i] + j)){
                    count++;
                    j++;
                }
                if(count > max){
                    max = count;
                }
            }
        }
        System.out.println(max);
    }
}
