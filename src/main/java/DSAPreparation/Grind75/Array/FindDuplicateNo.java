package DSAPreparation.Grind75.Array;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

/*
* Leetcode - https://leetcode.com/problems/find-the-duplicate-number/
*
*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.



Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
*
*
* */
public class FindDuplicateNo {

    @Test
    public void findDuplicateNo(){
        int [] nums ={1,3,4,2,2};
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(!set.add(i)){
                System.out.println(i);
                return;
            }
        }
    }
}
