package DSAPreparation.Grind75.BinarySearch;

/*
* Leetcode - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
*
* Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.



Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
Example 2:

Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
Example 3:

Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times.
*
*First two approaches can only be used if all elements are unique, If array contains duplicate elements use approach three
* */

import org.testng.annotations.Test;

public class FindMinimumInRotatedSortedArray {

    @Test
    public void findMinimum(){


        int [] nums={4,5,6,7,0,1,2};

        /*
        * nums = [2,1]
        * */
        int start = 0;
        int end = nums.length - 1;
        int mid;
        int prev;
        int next;

        // If array is not rotated
        if(nums[0] <= nums[nums.length -1]){
            System.out.println(nums[0]);
            return;
        }

        while(start<=end){
            mid = (start + end)/2;
            prev = (mid - 1 + nums.length)%nums.length;
            next = (mid + 1)%nums.length;

            //Minimum element is smalller then its previous element as well as its next element
            if(nums[mid] < nums[prev] && nums[mid] < nums[next]){
                System.out.println(nums[mid]);
                return;
            }

            //Check if we are in sorted array, If we are in sorted Array move to unsorted array as answer always lies in unsorted array
            if(nums[mid] >= nums[0]){
                start = mid + 1;
            }
            //Check if we are in unsorted array, stay in unsorted Array  as answer always lies in unsorted array
            else{
                end = mid -1;
            }

        }
        System.out.println("-1");;
    }

    @Test
    public void approach2(){
        int [] nums={4,5,6,7,0,1,2};
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.println(nums[left]);
    }

    @Test
    public void approach3WorkWithDuplicates(){
        int [] nums={4,5,5,1,1,2,3,3};
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if(nums[mid] < nums[right]) {
                right = mid;
            }
            else{
                right--;
            }
        }
        System.out.println(nums[left]);
    }

}
