package DSAPreparation.Grind75.Array;

/*
*Leetcode - https://leetcode.com/problems/squares-of-a-sorted-array/
*
* Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
*
*
* */

import org.testng.annotations.Test;

import java.util.Arrays;

public class SquaresOfSortedArray {

    @Test
    public void Squares(){
        //The complexity of given program is nlogn. As we are sorting the Array and even
        //the best sort takes nlogn time to sort
        int [] nums = {-4,-1,0,3,10};
        int [] result = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));;
    }

    @Test
    public void bestSolution(){
        //The complexity of given program is o(n)
        int [] nums = {-4,-1,0,3,10};
        int i=0;
        int j=nums.length -1;
        int [] result = new int[nums.length];

        int index=nums.length -1;
        while(i<=j){
            int num1=nums[i] * nums[i];
            int num2=nums[j] * nums[j];

            if(num1 > num2){
                result[index] = num1;
                index--;
                i++;
            }
            else {
                result[index] = num2;
                index--;
                j--;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
