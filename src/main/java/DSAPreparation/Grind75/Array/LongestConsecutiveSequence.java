package DSAPreparation.Grind75.Array;

/*
* LeetCode - https://leetcode.com/problems/longest-consecutive-sequence/
* Pepcoding - https://www.youtube.com/watch?v=YWXbu5uyGXs
*
* Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.



Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
*
* */

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {

    @Test
    public void findLongestConsecutiveIndex(){
    //    int [] arr={10,5,9,1,11,8,6,5,3,12,2};
        int [] arr={9,1,4,7,3,-1,0,5,8,-1,6};
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
        int maxStartPoint=0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i]) == true){
                int count=1;
                int j=1;
                while(map.containsKey(arr[i] + j)){
                    count++;
                    j++;
                }
                if(count > max){
                    maxStartPoint=arr[i];
                    max = count;
                }
            }
        }
        //Printing the length of largest consecutive sequency
        System.out.println("Size of Max Seqence is : "+ max);
        System.out.println("Max Consecutive  Seqence is : ");
        //Printing the largets consecutive index
        for(int i=0;i<max;i++){
            System.out.println(maxStartPoint);
            maxStartPoint++;
        }
    }
}
