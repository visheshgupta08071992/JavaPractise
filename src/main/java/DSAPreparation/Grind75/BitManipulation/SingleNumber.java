package DSAPreparation.Grind75.BitManipulation;

/*
* Leetcode - https://leetcode.com/problems/single-number/
* Explanation - https://www.youtube.com/watch?v=Ch1Mq58f3yQ&list=PL-Jc9J83PIiFJRioti3ZV7QabwoJK6eKe&index=8
*
* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
*
*
*
* */

/*
* 0 xor 0 -> 0
* 0 xor 1 -> 1
* 1 xor 0 -> 1
* 1 xor 1 -> 0
* DecimalNo xor DecimalNo -> 0
* DecimalNo xor 0 -> DecimalNo
* */

import org.testng.annotations.Test;

public class SingleNumber {

    @Test
    public void findSingleNumber(){
        int [] nums ={4,1,2,1,2};
        //Initializing result with 0 as xoring any no with 0 would give that no
        int result=0;

        for(int i=0;i<nums.length;i++){
            result = result ^ nums[i];
        }
        System.out.println(result);
    }
}
