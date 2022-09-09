package DSAPreparation.Grind75.BinarySearch;


import org.testng.annotations.Test;

/*
* Leetcode - https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
*
*
* */
public class SearchInRotatedSortedArray2 {

    @Test
    public void search(){
        //The given approach works for both if array has duplicate elements or if array has distinct elements
        //So the given code works for both SearchInRotatedSortedArray1 and SearchInRotatedSortedArray2
        int [] nums={2,5,6,0,0,1,2,2,2,2,2};
        int target=0;

        int end = nums.length -1;
        int start=0;
        int mid;

        while(start<=end){

            mid = (start + end)/2;

            if(nums[mid] == target){
                System.out.println("true");
                return;
            }

            //Means left array is sorted and binary search only works on sorted array
            if(nums[mid] > nums[start]){

                if(target < nums[mid] && target >= nums[start]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            //Means right array is sorted and binary search only works on sorted array
            else if(nums[start] > nums[mid]){

                if(target > nums[mid] && target <=nums[end]){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }

            }
            // else both mid and start element are duplicate and start element is not target so we do start++
            else{
                start++;
            }
        }
        System.out.println(false);
    }
}
