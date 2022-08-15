package DSAPreparation.Grind75.Array;

/*
* LeetCode - https://leetcode.com/problems/rotate-array/submissions/
* Pepcoding - https://www.youtube.com/watch?v=8RErc0VXAo8
*
* Given an array, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*
* */

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayRotation {

    @Test
    public void bestSolutionFromRight(){
        int [] nums={1,2,3,4,5,6,7};
        int k=3;
        // Finding the mod of K with arr.length as after every arr.length rotation k=1 rotation occurs/
        // So moding the K reduces K,hence reduces no of rotation
        k=k%nums.length;

        // when K is negative, Then make it positive
        if(k<0){
            k = k + nums.length;
        }

        //Part 1 reverse 1st Part of Array from 0 to nums.length - k -1
        reverse(nums,0,nums.length - k -1);

        //Part 2 reverse 2nd Part of Array from nums.length - k to nums.length -1
        reverse(nums,nums.length - k,nums.length-1);

        //Part 3 reverse the entire array
        reverse(nums,0,nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    public void reverse(int [] nums,int i,int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    @Test
    public void bestSolutionFromLeft(){
        int [] nums={1,2,3,4,5,6,7};
        int k=3;
        // Finding the mod of K with arr.length as after every arr.length rotation k=1 rotation occurs/
        // So moding the K reduces K,hence reduces no of rotation
        k=k%nums.length;

        // when K is negative, Then make it positive
        if(k<0){
            k = k + nums.length;
        }

        //Part 1 reverse 1st Part of Array from 0 to k -1
        reverse(nums,0, k -1);

        //Part 2 reverse 2nd Part of Array from k to nums.length -1
        reverse(nums,k,nums.length-1);

        //Part 3 reverse the entire array
        reverse(nums,0,nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void timeTakingSolution(){
        int [] nums={1,2,3,4,5,6,7};
        int k=3;

        for(int i=1;i<=k;i++){
            int temp = nums[nums.length -1];
            for(int j=nums.length -1;j>0;j--){
                nums[j] = nums[j-1];
            }
            nums[0]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
