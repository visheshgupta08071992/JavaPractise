package ArraysAndStrings;


import org.testng.annotations.Test;

import java.util.Arrays;

/*
* Question - https://nados.io/question/partition-array-into-disjoint-intervals
*
* Answer - https://www.youtube.com/watch?v=FRG2YlZdmPE&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=11
*
* Leetcode -> https://leetcode.com/problems/partition-array-into-disjoint-intervals/
*
* */
public class PartitionArrayIntoDisjointIntervals {

    @Test
    public void test(){
        int [] arr={5,0,3,8,6};
        //Expected - 3
        int [] rightMin= new int[arr.length + 1];
        int val=Integer.MAX_VALUE;
        rightMin[rightMin.length - 1]=val;
        for(int i=rightMin.length -2;i>=0;i--){
            rightMin[i]=Math.min(arr[i],rightMin[i+1]);
        }
        int leftMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            leftMax=Math.max(arr[i],leftMax);
            if(leftMax<=rightMin[i+1]){
                int leftPartitionLength=i+1;
                System.out.println("Length of left partition is : " + leftPartitionLength);
                break;
            }
        }
    }
}
