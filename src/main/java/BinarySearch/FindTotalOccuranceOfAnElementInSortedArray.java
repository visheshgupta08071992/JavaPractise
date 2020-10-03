package BinarySearch;

//Given a Sorted Array....We need to find total occurance of an element within the sorted array

import org.testng.annotations.Test;

public class FindTotalOccuranceOfAnElementInSortedArray {

	@Test
	public void findTotalOccuranceOfAnElementWithinSortedArray(){
		int [] arr = {3,4,5,7,14};
		//we need to find Total Occurance of element 10......i.e 0
		int requiredNo=10;
		int totalOccurance;
		int firstOccurance= findFirstOccuranceOfRequiredElement(arr,requiredNo);
		int lastOccurance=findLastOccuranceOfRequiredElement(arr,requiredNo);
		if(firstOccurance==-1 && lastOccurance==-1){
			totalOccurance=0;
		}
		else{
			totalOccurance=lastOccurance - firstOccurance + 1;
		}
		System.out.println("Last Occu " + lastOccurance);
		System.out.println("First Occu " + firstOccurance);
		System.out.println("Total occurance of " + requiredNo + " is " + totalOccurance);

	}

	public int findFirstOccuranceOfRequiredElement(int [] arr,int requiredNo){
		//We need to find the first occurance of element 10
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
		return result;
	}

	public int findLastOccuranceOfRequiredElement(int [] arr,int requiredNo){
		//We need to find the last occurance of element 10
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
		return result;
	}
}
