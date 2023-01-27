package DSAPreparation.BossCoder.Array;

import org.testng.annotations.Test;

/*
* Leetcode - https://leetcode.com/problems/maximum-subarray/
*
* Explanation - https://www.youtube.com/watch?v=HCL4_bOd3-4
*
*
* */

public class KadanesAlgorithmMaxSumSubArrayQ3 {

    @Test
    public void maxSumSubArrayWorstApproach(){
        //The complexity of given program is o(n2)
        int [] arr = {-5,4,6,-3,4,-1};
        //Max sum would be 11.
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum = sum + arr[j];
                if(sum > max){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }

    @Test
    public void maxSumSubArrayBestApproachKanadeAlgorithmn(){
        //The complexity of given program is o(n2)
        int [] nums = {-5,4,6,-3,4,-1};
        //Max sum would be 11.
        int maxSum = Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<nums.length;i++){
            currSum = currSum + nums[i];

            if(currSum > maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println(maxSum);
    }
}
