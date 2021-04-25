package SlidingWindowAdityaVerma;


//Aditya Verma Sliding window problem
//Given an array,return the maximum sum of subarray. Note:Subarray should be of size 3

import org.testng.annotations.Test;

public class MaximumOfAllSubArrayOFGivenSize {

	@Test
	public void findmMaximumSumOfSubarray(){

		int [] arr={2,5,1,8,2,9,1};
		int sum=0;
		int maxSum=0;
		int windowSize=3;
		//Here subArrays of size are
		/*{2,5,1} =>8
		{5,1,8}=>14
		{1,8,2}=>11
		{8,2,9}=>19
		{2,9,1}=>12*/
		int i=0;
			for(int j=i;j<arr.length;j++){
				sum=sum+arr[j];
				if((j-i+1)==windowSize){
					if(sum>maxSum){
						maxSum=sum;
					}
					sum=sum-arr[i];
					i++;
				}
			}
		System.out.println(maxSum);
	}

	//Using Brute force approach
	@Test
	public void findmMaximumSumOfSubarrayUsingBruteForce(){
		int [] arr={2,5,1,8,2,9,1};
		//int sum=0;
		int maxSum=0;
		int windowSize=3;
		//Here subArrays of size are
		/*{2,5,1} =>8
		{5,1,8}=>14
		{1,8,2}=>11
		{8,2,9}=>19
		{2,9,1}=>12*/
		for(int i=0;i<arr.length-2;i++){
			int sum=0;
			for(int j=i;j<i+windowSize;j++){
				sum=sum+arr[j];
			}
			if(sum>maxSum){
				maxSum=sum;
			}
		}
		System.out.println(maxSum);

	}
}
