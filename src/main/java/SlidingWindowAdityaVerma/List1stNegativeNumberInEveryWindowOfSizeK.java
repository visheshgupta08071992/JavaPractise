package SlidingWindowAdityaVerma;

//Aditya Verma Sliding window problem
//Given an array,return the first negative no in every subarray of size 3


import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class List1stNegativeNumberInEveryWindowOfSizeK {

	//Here Value of K i.e WindowSize is 3
	@Test
	public void firststNegativeNoInEverySubArrayOfSizeKBruteForceApproach(){

		int [] arr={12,-1,-7,8,-15,20,16,28};
		int windowSize=3;
		int i=0;
		//Here first negative elements in each subarray of size 3 are:

		/*{12,-1,-7} =>-1
		{-1,-7,8}  =>-1
		{-7,8,-15} =>-7
		{8,-15,20} =>-15
		{-15,20,16}=>-15
		{20,16,28}=>Nothing	*/

		for(int j=i;j<arr.length;j++){
			if(j-i+1==windowSize){
				int temp=i;
				while(temp<=j){
					//It is a brute force approach as here we are again checking whether the elements are negative
					// which was checked in previous iteration of subarray
					if(arr[temp]<0){
						System.out.println("First Negative No in Window of "+arr[i] + " to " + arr[j] + " is " + arr[temp]);
						break;
					}
					temp++;
				}
				i++;
			}
		}
	}

	@Test
	public void firststNegativeNoInEverySubArrayOfSizeKBestApproach(){

		int [] arr={12,-1,-7,8,-15,20,16,28};
		int windowSize=3;
		List<Integer> negativeNumberList=new ArrayList<Integer>();
		int i=0;
		for(int j=i;j<arr.length;j++){
			if(arr[j]<0){
				negativeNumberList.add(arr[j]);
			}
			if(j-i+1==windowSize) {
				if (negativeNumberList.size() < 1) {
					System.out.println("No Negative No in Window of " + arr[i] + " to " + arr[j]);

				} else {
					System.out.println("First Negative No in Window of " + arr[i] + " to " + arr[j] + " is " + negativeNumberList.get(0));
					if (negativeNumberList.get(0).equals(arr[i])) {
						negativeNumberList.remove(0);
					}
					i++;
				}
			}
		}

	}
}
