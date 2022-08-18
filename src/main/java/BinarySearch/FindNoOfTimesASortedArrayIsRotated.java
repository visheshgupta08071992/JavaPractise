package BinarySearch;


// Given a rotated sorted Array,We need to find how many times an array is rotated.

//For Example, we have an array [2,5,6,8,11,12]......if I rotate the given array 3 times in left I get [8,11,12,2,5,6]

//So here the input Array would be [8,11,12,2,5,6].....we need to find how many times the given array is rotated....
// .So the required output should be three

//All the questions are from Aditya Verma's youtube channel.

//Algorithmn:

/*if(array is LEFT rotated then no_of_rotations is equal to (length - index_of_min_element)%length)

	if(array is RIGHT rotated then no_of_rotations = index_of _min_element)

So 	we would be required to find the index of minimumn element. So condition to find the index of Minimum element is that it should be smaller than left element as well as the right element.

If the mid element is not the minimum element then we would be required to move to unsorted Array....to move to the unsorted array we would need to check
		if mid > start then the Array before mid is sorted and then we need to shift Start Index to Mid +1
		else end Index to Mid -1*/

import org.testng.annotations.Test;

public class FindNoOfTimesASortedArrayIsRotated {

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
	public void findNoOfTimesSortedArrayIsLeftRotated(){

		//int[] rotatedSortedArray = {6,8,11,12,2,5};
		int[] rotatedSortedArray = {5,6,1,2,3,4};
		int mid;
		int noOfRotations;
		mid =findtheIndexOfMinimumElement(rotatedSortedArray);
		if(mid==0){
			System.out.println("Array is not rotated");
		}
		else{
			System.out.println("Mid is " + mid);
			noOfRotations=(rotatedSortedArray.length - mid)%rotatedSortedArray.length;
			System.out.println("The Sorted Array is rotated " + noOfRotations + " times");
		}

	}

	@Test
	public void findNoOfTimesSortedArrayIsRightRotated(){

		//int[] rotatedSortedArray = {11,12,2, 5, 6,8};
		int[] rotatedSortedArray = {4,5,6,1,2,3};
		int mid;
		int noOfRotations;
		mid =findtheIndexOfMinimumElement(rotatedSortedArray);
		if(mid==0){
			System.out.println("Array is not rotated");
		}
		else{
			System.out.println("Mid is " + mid);
			noOfRotations=mid;
			System.out.println("The Sorted Array is rotated " + noOfRotations + " times");
		}

	}
}
