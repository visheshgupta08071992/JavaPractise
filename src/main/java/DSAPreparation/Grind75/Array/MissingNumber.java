package DSAPreparation.Grind75.Array;

/*
* Leetcode - https://leetcode.com/problems/missing-number/
*
* Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
*
*
* */

import org.testng.annotations.Test;

import java.util.Arrays;

public class MissingNumber {

    @Test
    //The complexity of given approach is n(logn) as we are using sorting
    public void usingSorting(){
        int [] nums = {9,6,4,2,3,5,7,0,1};

        //Sort the Array so that all the elements are placed correctly
        Arrays.sort(nums);

        //Now iterate array and check whether index equals the array value

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                //If 0 is not present then program would get the result in the very first attept
                System.out.println(i);
                return;
            }
        }
        //If all the elements are equal then no with length of array is missing
        System.out.println(nums.length);
    }

    @Test
    public void withoutSorting(){
        int [] nums = {9,6,4,2,3,5,7,0,1};

        //The Time complexifty of given approach is o(n)
        int n=nums.length;

        //Sum of n elements n(n+1)/2

        int expectedSum = n*(n+1)/2;
        int actualSum=0;

        for(int i=0;i<nums.length;i++){
            actualSum = actualSum + nums[i];
        }
        System.out.println(expectedSum - actualSum);
    }
}
