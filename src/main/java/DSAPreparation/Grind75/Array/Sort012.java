package DSAPreparation.Grind75.Array;

/*
* Solution - https://www.youtube.com/watch?v=t5hyPU0wnwc
* LeetCode - https://leetcode.com/problems/sort-colors/
*
* Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
*
* Example:
*
* Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
*
* */

import org.testng.annotations.Test;

import java.util.Arrays;

public class Sort012 {

    @Test
    //The given approach has complexity of O(2N)
    public void sort012UsingO2N(){

        int [] arr={2,0,0,1,2,0,1,1,0,2,1};
        int countZero=0;
        int countOne=0;
        int countTwo=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZero++;
            }
            else if(arr[i]==1){
                countOne++;
            }
            else if(arr[i]==2){
                countTwo++;
            }
        }
        int index=0;
        for(int i=1;i<=countZero;i++){
            arr[index]=0;
            index++;
        }
        for(int i=1;i<=countOne;i++){
            arr[index]=1;
            index++;
        }
        for(int i=1;i<=countTwo;i++){
            arr[index]=2;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    // Given approach has time complexity of o(N)
    public void sort012UsingON(){
        int [] arr={2,0,0,1,2,0,1,1,0,2,1};
        int low=0;
        int mid=0;
        int high=arr.length - 1;

        while(mid <=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }

            else if(arr[mid]==1){
                mid++;
            }

            else if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void swap(int [] arr,int index1,int index2){
        int temp;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
