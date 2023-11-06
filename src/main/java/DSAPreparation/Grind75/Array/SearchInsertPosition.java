package DSAPreparation.Grind75.Array;

/*
* https://leetcode.com/problems/search-insert-position/description/
*
* */

import org.testng.annotations.Test;

public class SearchInsertPosition {

    @Test
    public void searchInsert(){
        int [] nums = {1,3,5,6};
        int target=2;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) {
                System.out.println(mid);
                return;
            }
            else if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(low);
    }

    }

