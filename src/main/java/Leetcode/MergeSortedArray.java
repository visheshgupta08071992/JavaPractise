package Leetcode;

/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

		Note:

		The number of elements initialized in nums1 and nums2 are m and n respectively.
		You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.

		Example:

		Input:
		nums1 = [1,2,3,0,0,0], m = 3
		nums2 = [2,5,6],       n = 3

		Output: [1,2,2,3,5,6]
*/


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class MergeSortedArray {

	@Test
	public void mergeSortedArray(){
		int [] nums1={1,2,3,0,0,0};
		int [] nums2={2,5,6};
		List num1List= Arrays.asList(nums1);
		//System.out.println(Arrays.toString(num1List));
		List num2List= Arrays.asList(nums2);
		System.out.println(num2List.get(0));
	//	num1List.addAll(num2List);
		Collections.sort(num1List);
		System.out.println(num1List);

	}
}
