package JavaConceptOfTheDay;

/*Given an integer array, you have to find all the leader elements in this array. An element is said to be leader if all the elements on it’s right side are smaller than it. Rightmost element is always a leader. For example, if {14, 9, 11, 7, 8, 5, 3} is the given array then {14, 11, 8, 5, 3} are the leaders in this array.*/

import org.testng.annotations.Test;

public class FindAllLeadersInAnArray {

	@Test
	public void findLeaderInAnArray(){
		int [] arr={14, 9, 11, 7, 8, 5, 3};
		//Last Element is always leader....so printing it
		System.out.println(arr[arr.length-1]);
		//Considering Last element as maximum
		int max=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--){
			if(arr[i]>max){
				System.out.println(arr[i]);
				max=arr[i];
			}
		}
	}
}
