package JavaConceptOfTheDay;

/*You have given an integer array and a number. You need to find the continuous sub array of the given array whose sum is equal to given number. For example, If {12, 5, 31, 9, 21, 8} is the given array and 45 is the given number, then you have to find continuous sub array in this array such that whose elements add up to 45. In this case, {5, 31, 9} is such sub array whose elements add up to 45.*/
/*
*
* https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
*
* */
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ContinuousSubArray {

	@Test
	public void subArry(){
		int [] arr={12, 5, 31, 9, 21, 8};
		int inputNumber=45;
		List<Integer> list = new ArrayList<>();
		int sum=0;
		for(int i=0;i<arr.length;i++){
             sum = sum + arr[i];
			 list.add(arr[i]);
			 if(sum==inputNumber){
				 System.out.println(list);
				 return;
			 }
			 if(sum>inputNumber){
				 sum = sum -list.get(0);
				 list.remove(0);

			 }
		}
	}


	@Test
	public void continuousSubArray(){
		int [] arr={12, 5, 31, 9, 21, 8};
		int inputNumber=45;
		int start=0;
		int sum=arr[0];
		for(int i=1;i<arr.length;i++){
			sum=sum + arr[i];
			while(sum>inputNumber && start<i){
				sum=sum-arr[start];
				start++;
			}
			if(sum==inputNumber){
				for(int j=start;j<=i;j++){
					System.out.println(arr[j] + " ");
				}
			}
		}
	}
}
