package BinarySearch;

// The Program is used to find an element in an Array Using Binary Search if the Array is Ascendingly sorted

import org.testng.annotations.Test;

public class FindAnElementUsingBinarySearchWhenArrayIsAscendinglySorted {


	@Test
	public void findElementUsingBinarySearch(){

		int [] arr={5,6,7,10,11,23,42,45,65,98,101,107};
		//Find whether 101 is present in the Array. If present then return the index.
		int requiredNumber=107;
		int startIndex=0;
		int endIndex=arr.length - 1;
		boolean flag=true;
		while(startIndex<=endIndex){

			int mid = (startIndex + endIndex)/2;

			if(arr[mid]==requiredNumber){
				System.out.println(requiredNumber + " is found at index " + mid);
				flag=false;
				break;
			}
			else if(arr[mid] > requiredNumber){
				endIndex=mid - 1;
			}
			else{
				startIndex=mid +1;
			}
		}
		if(flag){
			System.out.println(requiredNumber + " is not found");
		}

	}
}
