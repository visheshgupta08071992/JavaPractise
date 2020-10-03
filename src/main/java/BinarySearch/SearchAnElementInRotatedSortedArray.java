package BinarySearch;



import org.testng.annotations.Test;

public class SearchAnElementInRotatedSortedArray {

	public int findtheIndexOfMinimumElement(int [] rotatedSortedArray) {
		int startIndex = 0;
		int endIndex = rotatedSortedArray.length - 1;
		int arrayLength = rotatedSortedArray.length;
		int mid;
		if (rotatedSortedArray[startIndex] < rotatedSortedArray[endIndex]) {
			System.out.println("Array is not rotated");
			return 0;
		} else {
			while (startIndex <= endIndex) {
				mid = (startIndex + startIndex) / 2;

				// To find previous we are mid + arrayLength -1 instead of mid -1 because mid - 1 won't work at index 0
				int previous = (mid + arrayLength - 1) % arrayLength;
				//We are modying with arrayLength if mid is at LastIndex then modying with ArrayLength would give the
				// first Index
				int next = (mid + 1) % arrayLength;
				if (rotatedSortedArray[mid] < rotatedSortedArray[next] && rotatedSortedArray[mid] < rotatedSortedArray[previous]) {
					return mid;

				} else if (rotatedSortedArray[mid] >= rotatedSortedArray[startIndex]) {
					startIndex = mid + 1;
				} else {
					endIndex = mid - 1;
				}
			}
			return -1;
		}
	}

	@Test
	public void searchAnElementInRotatedSortedArray(){
		int[] rotatedSortedArray = {6,8,11,12,2,5};
		int elementToBeSearched=12;
		int startIndex=0;
		int endIndex=rotatedSortedArray.length-1;
		int indexOfMinimumElement=findtheIndexOfMinimumElement(rotatedSortedArray);
		int findElementInLeftArray=binarySearch(rotatedSortedArray,elementToBeSearched,startIndex,
				indexOfMinimumElement-1);
		int findElementInRightArray=binarySearch(rotatedSortedArray,elementToBeSearched,indexOfMinimumElement,endIndex);

		if(findElementInLeftArray==-1 && findElementInRightArray==-1){
			System.out.println(elementToBeSearched + " is not found in the array");
		}
		if(findElementInLeftArray!=-1){
			System.out.println(elementToBeSearched + " is  found in the array at index " + findElementInLeftArray);
		}
		if(findElementInRightArray!=-1) {
			System.out.println(elementToBeSearched + " is  found in the array at index " + findElementInRightArray);
		}
	}

	public int binarySearch(int [] rotatedSortedArray,int elementToBeSearched,int startIndex,int endIndex){
		while(startIndex<=endIndex){

			int mid = (startIndex + endIndex)/2;

			if(rotatedSortedArray[mid]==elementToBeSearched){
				return mid;

			}
			else if(rotatedSortedArray[mid] > elementToBeSearched){
				endIndex=mid - 1;
			}
			else{
				startIndex=mid +1;
			}
		}
		return -1;
	}
}
