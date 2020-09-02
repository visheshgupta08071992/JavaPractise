package JavaConceptOfTheDay;

/*For example, if {12, 9, 21, 17, 33, 7} is the input array, then your program should return {7, 33, 17, 21, 9, 12} as output.*/

import java.util.Arrays;

import org.testng.annotations.Test;

public class ReverseAnArray {

	@Test
	public void reverseAnArray(){
		int [] arr={12, 9, 21, 17, 33, 7};
		int i=0;
		int j=arr.length-1;
		int temp;
		while(i<j){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
