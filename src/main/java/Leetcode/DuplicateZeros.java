/*Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

		Note that elements beyond the length of the original array are not written.

		Do the above modifications to the input array in place, do not return anything from your function.



		Example 1:

		Input: [1,0,2,3,0,4,5,0]
		Output: null
		Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]*/

package Leetcode;
import java.util.Arrays;

import org.testng.annotations.Test;

public class DuplicateZeros {

	@Test
	public static void duplicateZeroes(){
		int [] arrWithoutZeroDuplicates = {1,0,0,0,5,4};
		//System.out.println(Arrays.toString(arr));
		for (int i=0;i<arrWithoutZeroDuplicates.length;i++){
			if(arrWithoutZeroDuplicates[i]==0){
				arrWithoutZeroDuplicates=shift(arrWithoutZeroDuplicates,i+1,arrWithoutZeroDuplicates.length-1);
					if(i<arrWithoutZeroDuplicates.length-1) {
					arrWithoutZeroDuplicates[i + 1] = 0;
					i++;
				}

				}
		}
		System.out.println(Arrays.toString(arrWithoutZeroDuplicates));
	}

	public static int [] shift(int[] arr, int i, int j){

		while(j>i){
			arr[j]=arr[j-1];
			j--;
		}
		return arr;
	}

}
