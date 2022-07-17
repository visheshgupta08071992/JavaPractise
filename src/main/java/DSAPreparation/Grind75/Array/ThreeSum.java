package DSAPreparation.Grind75.Array;

/*
* LeetCode - https://leetcode.com/problems/3sum/
* Pepcoding - https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/arrays-and-strings/3-sum-target-sum-unique-triplet/ojquestion
* Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

  Notice that the solution set must not contain duplicate triplets.
  Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[1] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
*
* */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    @Test
    public void threeSum(){
        int [] arr={-1,0,1,2,-1,-4};
        int target=0;
        List<List<Integer>> result = new ArrayList<>();

        //If length of array is less then 3 then no triplet is formed
        if(arr.length < 3){
            System.out.println(result);
        }
        Arrays.sort(arr);
        //iteration uptil nums.length -3 because from nums.length-2 no triplet can be formed
        for(int i=0;i<arr.length - 3;i++){

            if(i!=0 && arr[i]==arr[i-1]){
                continue;
            }
            int val1=arr[i];
            int newTarget = target - val1;
            List<List<Integer>> subResult = twoSum(arr,i+1,arr.length,newTarget);
            for(List<Integer> list:subResult){
                list.add(val1);
                result.add(list);
            }
        }
        System.out.println(result);
    }

    private List<List<Integer>> twoSum(int[] arr, int i, int length, int newTarget) {
        int left=i;
        int right=length-1;
        List<List<Integer>> result1 = new ArrayList<>();
        while(left < right){

            if(left!=i && arr[left]==arr[left-1]){
                left++;
                continue;
            }

            if(arr[left] +arr[right] == newTarget){
                List<Integer> subResult1= new ArrayList<>();
                subResult1.add(arr[left]);
                subResult1.add(arr[right]);
                result1.add(subResult1);
                left++;
                right--;
            }
            else if(arr[left] +arr[right] > newTarget){
                right--;
            }
            else if(arr[left] +arr[right] < newTarget){
                left++;
            }
        }
        return  result1;
    }
}
