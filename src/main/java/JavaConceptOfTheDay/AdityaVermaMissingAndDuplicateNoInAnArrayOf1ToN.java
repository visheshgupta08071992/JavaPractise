package JavaConceptOfTheDay;

// Check Aditya Verma's Youtube video

//https://leetcode.com/problems/find-missing-and-repeated-values/

//Find the missing and duplicate no in an Array of 1 to N
// Array 1 to N means that array would contain only elements from 1 to N. N is the size of an array.

//Example: {1,2,3,4,5,6,7,8}

//Given Input Array : {7,2,1,1,4,6,7,3} ........So from this Array we need to find the Missing Number that is 5 and
// 8.While the duplicate Nos would be  1,7

//Algorithmn
//First we would rearrange the array such ith index stores arr[i+1]

// Indexing : 0 1 2 3 4 5 6 7
// Elements : 1 2 3 4 1 6 7 7

import java.util.Arrays;

import org.testng.annotations.Test;

public class AdityaVermaMissingAndDuplicateNoInAnArrayOf1ToN {

	@Test
	public void findMissingAndDuplicateNos(){
		int input [] = {7,2,1,1,4,6,7,3};
		int i=0;
		while(i<=input.length-1){
			if(input[i]!=input[input[i]-1]){
				int temp;
				int swapindex=input[i]-1;
				temp=input[i];    //1
				input[i]=input[swapindex];  //7
				input[swapindex]=temp; //1
			}
			else{
				i++;
			}
		}
		System.out.println(Arrays.toString(input));

		for(int j=0;j<input.length;j++){
			if((j+1)!=input[j]){
				int missingNo=j+1;
				System.out.println("Missing no is  " + missingNo + " while the duplicate No is  " + input[j]);
			}
		}
	}

	@Test
	public void findMissingAndDuplicateNosUsingListAndSet() {
		int input[] = {7, 2, 1, 1, 4, 6, 7, 3};
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		List<Integer> missingNo = new ArrayList<>();
		Set<Integer> duplicateNo = new HashSet<>();


		for(int i:input){
			list.add(i);

		}

		for(int i=0;i<input.length;i++){
			if(!list.contains(i+1)){
				missingNo.add(i+1);
			}
			if(!set.add(input[i])){
				duplicateNo.add(input[i]);
			}

		}
		System.out.println("Misisng Nos are " + missingNo);
		System.out.println("Duplicate Nos are " + duplicateNo);
	}
}
