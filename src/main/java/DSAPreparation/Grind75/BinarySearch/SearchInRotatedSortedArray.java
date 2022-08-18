package DSAPreparation.Grind75.BinarySearch;

/*
* Leetcode - https://leetcode.com/problems/search-in-rotated-sorted-array/
*
* Explanation - https://www.youtube.com/watch?v=Le8bc8aHgBA
*
* Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
*
*
* */

import org.testng.annotations.Test;

public class SearchInRotatedSortedArray {

    @Test
    public void search(){
        int [] nums={3,1};
        int target=1;

        /*
        * int [] nums={5,6,1,2,3,4};
        int target=4;
        *
        * */

        int start = 0;
        int end = nums.length -1;
        int mid;

        while(start<=end){
            mid = (start+end)/2;

            if(target == nums[mid]){
                System.out.println(mid);
                return;
            }

            //Left Array is sorted, >= conditions is used as even if the element is equal it would be sorted
            else if(nums[mid] >= nums[start]){

                if(target < nums[mid] && target >= nums[start]){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }

            //Right Array is sorted
            else{
                if(target > nums[mid] && target <= nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }
        }
        System.out.println("-1");
    }
}
