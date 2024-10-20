package DSAPreparation.Grind75.Array;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
* Leetcode - https://leetcode.com/problems/contains-duplicate/
*
* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*
* Input: nums = [1,2,3,1]
Output: true
*
*
* Input: nums = [1,2,3,4]
Output: false
*
* */

public class conatinsDuplicate {

    @Test
    public void test(){
        int [] nums={1,4,5,7,8,4};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                System.out.println("true");
                return;
            }
            else{
                map.put(nums[i],1);
            }
        }
        System.out.println("FALSE");
    }

    @Test
    public void testUsingSet(){
        int [] nums={1,4,5,7,8,4};
        Set<Integer> set = new HashSet<>();

        for(int i :nums){
            //If element is not getting addded in set the it is duplicate element and return true
            if(!set.add(i)){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");;
    }
    }
