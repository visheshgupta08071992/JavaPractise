package ArraysAndStrings;

import org.testng.annotations.Test;

import java.util.Arrays;

/*
*Peepcoding -> https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/arrays-and-strings/squares-of-a-sorted-array/ojquestion
*
*LeetCode -> https://leetcode.com/problems/squares-of-a-sorted-array/
*
* */
public class SquaresOfSortedArray {

    @Test
    public void oOfNApproach(){
        // Complexity of Given Code is o(n)
        int [] nums= {-4,-1,0,3,10};
        int [] result= new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int index=nums.length-1;
        while(i<=j){
            int val1=nums[i] * nums[i];
            int val2=nums[j] * nums[j];
            if(val1>val2){
                result[index]=val1;
                i++;
                index--;
            }
            else{
                result[index]=val2;
                j--;
                index--;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(result));
    }


    @Test
   /* //Complexity of this is o(nlogn) beacuse
            //o(n) for squaring
            o(nlog n) for Sorting
            Total Complexity o(nlogn)
    */
    public void squaresOfSortedArray(){
        int [] nums= {-4,-1,0,3,10};
        int [] numsSquare= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            numsSquare[i] = nums[i] * nums[i];
        }
        Arrays.sort(numsSquare);
        System.out.println(Arrays.toString(numsSquare));
    }
}
