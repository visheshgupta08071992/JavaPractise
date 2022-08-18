package DSAPreparation.Grind75.BinarySearch;

/*
* Leetcode - https://leetcode.com/problems/binary-search/
*
* Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
*
*
* */

import org.testng.annotations.Test;

public class BinarySearch {

    @Test
    public void BinarySearch(){
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;
        int i=0;
        int j=nums.length -1;
        int mid;
        while(i<=j){
            mid = i - (i-j)/2;

            if(nums[mid] == target){
                System.out.println(mid);
                return;
            }

            else if(target > nums[mid]){
                i=mid + 1;
            }
            else if(target < nums[mid]){
                j=mid -1;
            }
        }
        System.out.println("-1");
    }
}
