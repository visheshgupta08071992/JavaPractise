package BinarySearch;

/*A nearly sorted array is an array in which element is changes only by one position....i.e the element can be present at i,i-1 or i+1 location

For example {1,2,4,3,
		5} is a nearly sorted array here 4 could be present at i+1 location while 3 could be present at i-1 location for a perfectly sorted array*/

import org.testng.annotations.Test;

public class SearchAnElementInNearlySortedArray {

	@Test
	public void searchAnElementInNearlySortedArray(){
		int [] arr = {1,2,4,3,5};
		int requiredNumber=2;
		int startIndex=0;
		int endIndex=arr.length - 1;
		boolean flag=false;
		while(startIndex<=endIndex){

			int mid = (startIndex + endIndex)/2;

			if(arr[mid]==requiredNumber){
				System.out.println(requiredNumber + " is found at index " + mid);
				break;
			}
			if(arr[mid-1]>=startIndex && arr[mid-1]==requiredNumber){
				int searchedIndex=mid-1;
				System.out.println(requiredNumber + " is found at index " + searchedIndex);
				break;
			}
			if(arr[mid+1]<=endIndex && arr[mid+1]==requiredNumber){
				int searchedIndex=mid+1;
				System.out.println(requiredNumber + " is found at index " + searchedIndex);
				break;
			}
			else if(arr[mid] > requiredNumber){
				endIndex=mid - 2;
			}
			else{
				startIndex=mid +2;
			}
		}
		if(flag){
			System.out.println(requiredNumber + " is not found");
		}

	}
}

