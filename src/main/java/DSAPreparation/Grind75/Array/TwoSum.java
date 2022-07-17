package DSAPreparation.Grind75.Array;

//https://leetcode.com/problems/two-sum/


/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.



        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]


        Constraints:

        2 <= nums.length <= 104
        -109 <= nums[i] <= 109
        -109 <= target <= 109
        Only one valid answer exists.
*/

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    @Test
    public void twoSumIndices(){
        int [] arr={3,2,4};
        int target=6;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i] + arr[j]==target){
                    System.out.println("Indices forming target are : " + i + " and " + j);
                    break;
                }
            }
        }
    }

    @Test
    public void oNApproach() {
        int [] arr={3,2,3};
        int target=6;
        //Creating Hashmap for storing value of array and its index
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target - arr[i])){
                System.out.println("Indices forming target are : " + map.get(target - arr[i]) + " and " + i);
                break;
            }
            else{
                map.put(arr[i],i);
            }
        }
    }
}
