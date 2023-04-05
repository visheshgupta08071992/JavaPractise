package JavaConceptOfTheDay;

import java.util.Arrays;

import org.testng.annotations.Test;

/*Given an integer array, you have to separate all zero elements from non-zero elements. You have to move zeros either to end of the
 array or bring them to beginning of the array. For example, if {14, 0, 5, 2, 0, 3, 0} is the given array, then
 moving zeros to end of the array will result {14, 5, 2, 3, 0, 0, 0} and bringing zeros to front will result {0, 0, 0, 14, 5, 2, 3}.*/

public class SeparateZerosFromNonZerosInAnArray {

	@Test
	public void seprateZerosAtLast(){
		int [] arr={14, 0, 5, 2, 0, 3, 0};
		int counter=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr[counter]=arr[i];
				counter++;
			}
		}
		while(counter<arr.length){
			arr[counter]=0;
			counter++;
		}
		System.out.println(Arrays.toString(arr));
	}

	@Test
	public void seprateZerosAtLastUsingTwoPointerStrategy() {
		int[] arr = {14, 0, 5, 2, 0, 3, 0};

		int i=0;
		int j=arr.length -1;
		while(i<j){
			if(arr[i]==0 && arr[j]!=0){
				int temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			else if(arr[i]!=0 && arr[j]==0){
				i++;
				j--;
			}
			else if(arr[i]!=0 && arr[j]!=0){
				i++;
			}
			else{
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	@Test
	public void seprateZerosAtFirst(){
		int [] arr={14, 0, 5, 2, 0, 3, 0};
		int counter=arr.length-1;
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]!=0){
				arr[counter]=arr[i];
				counter--;
			}
		}
		while(counter>=0){
			arr[counter]=0;
			counter--;
		}

		System.out.println(Arrays.toString(arr));
	}

	@Test
	public void seprateZerosAtFirstUsingTwoPointer() {
		int[] arr = {14, 0, 5, 2, 0, 3, 0};

		int i=0;
		int j=arr.length -1;
		while(i<j){
			if(arr[i]!=0 && arr[j]==0){
				int temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			else if(arr[i]==0 && arr[j]!=0){
				i++;
				j--;
			}
			else if(arr[i]==0 && arr[j]!=0){
				i++;
			}
			else{
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
