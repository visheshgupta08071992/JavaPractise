package BinarySearch;

// Given a sorted Array....Find the first Occurance of required element

import org.testng.annotations.Test;

public class FindTheFirstAndLastOccuranceOfAnElementInASortedArray {

	@Test
	public void findFirstOccuranceOfRequiredElement(){
		int arr[]= {3,4,5,7,10,10,10,14};
		//We need to find the first occurance of element 10 i.e 4th index
		int requiredNo=10;
		int startIndex=0;
		int endIndex=arr.length - 1;
		int result = -1;
		while(startIndex <= endIndex){
			int mid = (startIndex + endIndex)/2;
			if(arr[mid]==requiredNo){
				result=mid;
				endIndex=mid -1;
			}
			else if(requiredNo > arr[mid]){
				startIndex=mid + 1;
			}
			else{
				endIndex = mid - 1;
			}
		}
		if(result > 0){
			System.out.println("First Occurance of " + requiredNo+ " is at index " + result);
		}
		else {
			System.out.println(requiredNo + " is not present");
		}
	}

	@Test
	public void findLastOccuranceOfRequiredElement(){
		int arr[]= {3,4,5,7,10,10,10,14};
		//We need to find the last occurance of element 10 i.e 6th index
		int requiredNo=10;
		int startIndex=0;
		int endIndex=arr.length - 1;
		int result = -1;
		while(startIndex <= endIndex){
			int mid = (startIndex + endIndex)/2;
			if(arr[mid]==requiredNo){
				result=mid;
				startIndex=mid + 1;
			}
			else if(requiredNo > arr[mid]){
				startIndex=mid + 1;
			}
			else{
				endIndex = mid - 1;
			}
		}
		if(result > 0){
			System.out.println("Last Occurance of " + requiredNo+ " is at index " + result);
		}
		else {
			System.out.println(requiredNo + " is not present");
		}
	}
}
