package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class FindSecondLargestNumberInAnArray {

	@Test
	public void findSecondLargest(){
		int [] arr=new int[]{10,10,11,7,8,3,9,5,3,2,11,11};
		int largest;
		int secondLargest;
		if(arr[0] > arr[1]){
			largest=arr[0];
			secondLargest=arr[1];
		}
		else{
			largest=arr[1];
			secondLargest=arr[0];
		}
		for(int i=2;i<arr.length;i++){
			if(arr[i] >largest){
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i] < largest && arr[i] > secondLargest){      //Remember else if syntax
				secondLargest=arr[i];
			}
		}
		System.out.println("Second Largest No is : " +secondLargest);
	}
}
