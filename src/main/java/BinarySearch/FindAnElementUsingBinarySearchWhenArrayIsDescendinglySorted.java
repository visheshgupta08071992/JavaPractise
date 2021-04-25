package BinarySearch;

import org.testng.annotations.Test;

public class FindAnElementUsingBinarySearchWhenArrayIsDescendinglySorted {

	@Test
	public void findElementUsingBinarySearch(){

		int [] arr={103,98,88,78,68,58,48,38,28,18};
		//Find whether 78 is present in the Array. If present then return the index.
		int requiredNumber=78;
		int startIndex=0;
		int endIndex=arr.length - 1;
		boolean flag=false;
		while(startIndex<=endIndex){

			int mid = (startIndex + endIndex)/2;

			if(arr[mid]==requiredNumber){
				System.out.println(requiredNumber + " is found at index " + mid);
				break;
			}
			else if(requiredNumber>arr[mid]){
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


	@Test
	public void binarySearchDescending(){
		int [] arr={103,98,88,78,68,58,48,38,28,18};
		int requiredNumber=18;
		int startIndex=0;
		int endIndex=arr.length - 1;
		Boolean flag=true;
		while(startIndex<=endIndex){
           int mid=(startIndex+endIndex)/2;
           if(arr[mid]==requiredNumber){
	           System.out.println(requiredNumber + " is found at index : " + mid);
	           flag=false;
	           break;
           }
           else if(arr[mid]>requiredNumber){
           	startIndex=mid +1;
           }
           else{
           	endIndex=mid-1;
           }
		}

		if(flag){
			System.out.println(requiredNumber + " is not found");
		}
	}
}
