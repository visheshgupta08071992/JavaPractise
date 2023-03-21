package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class FindSecondLargestNumberInAnArray {
/*
* https://practice.geeksforgeeks.org/problems/second-largest3735/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
* */

	@Test
	//If second highest is not present then print -1
	public void findSecondLargest(){
		//int [] arr=new int[]{12,12,11,7,14,3,9,5,15,2,11,11};
		int [] array=new int[]{10,10,5};
		//int [] array=new int[]{10,10,10};

		// Initialize these to the smallest value possible
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		// Loop over the array
		for (int i = 0; i < array.length; i++) {
			// If current element is greater than highest
			if (array[i] > highest) {

				// assign second highest element to highest element
				secondHighest = highest;

				// highest element to current element
				highest = array[i];
			} else if (array[i] > secondHighest && array[i]!=highest)
				// Just replace the second highest
				secondHighest = array[i];
		}

		// After exiting the loop, secondHighest now represents the second
		// largest value in the array
		if(secondHighest==Integer.MIN_VALUE){
			System.out.println(-1);
		}
		else{
			System.out.println(secondHighest);
		}


	}
}
