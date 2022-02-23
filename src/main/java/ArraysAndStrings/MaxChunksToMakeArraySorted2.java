package ArraysAndStrings;

/*
* Question - https://nados.io/question/max-chunks-to-make-array-sorted-2
* Answer - https://www.youtube.com/watch?v=GxTo3agdnjs&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=14
*
*
* */

import org.testng.annotations.Test;

import java.util.Arrays;

public class MaxChunksToMakeArraySorted2 {

    @Test
    public void maxChunksToMakeArraySorted(){
        //int [] arr={2,1,3,4,4};
        int [] arr={1,0,1,3,2};
        //Expected -> 3
        int [] rightMin= new int[arr.length + 1];
        int minVal=Integer.MAX_VALUE;
        rightMin[rightMin.length - 1] = minVal;
        for(int i=rightMin.length-2;i>=0;i--){
            rightMin[i]=Math.min(arr[i],rightMin[i+1]);
        }
        int leftMax=Integer.MIN_VALUE;
        int chunkCount=0;
        for(int i=0;i<arr.length;i++){
            leftMax=Math.max(arr[i],leftMax);
            if(leftMax <=rightMin[i+1]){
                chunkCount++;
            }
        }
        System.out.println("Max chunks are : " + chunkCount);


    }

    @Test
    public void test(){
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}


