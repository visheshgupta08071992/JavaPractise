package DSAPreparation.Grind75.Array;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class FindAllPairsOfElementWhoseMultiplicationIsEqualToGivenNO {
	/*if {2, 4, 6, 8, 9, 5, 3, 12} is an array and 24 is the given number, then you have to find all pairs of
	elements in this array whose multiplication must be 24. In this example, (2, 12), (4, 6) and (8, 3) are such
	pairs whose sum is 24*/

	@Test
	public void bruteForce(){
		int [] arr = {2, 4, 6, 8, 9, 5, 3, 12};
		int multiply=24;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]*arr[j]==multiply){
					System.out.println(arr[i] + "*" + arr[j] + " forms " + multiply);
				}
			}
		}
	}

	@Test
	public void usingHashMap() {
		int[] arr = {2, 4, 6, 8, 9, 5, 3, 12};
		int multiply = 24;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i : arr){
			if(map.containsKey(i)){
				map.put(i,map.get(i) + 1);

			}
			else{
				map.put(i,1);
			}
		}
		for(int i=0;i<arr.length;i++){
			if(multiply%arr[i]==0){
				int requiredNo=multiply/arr[i];
				if(map.containsKey(requiredNo)){
					System.out.println(arr[i] + "*" + requiredNo + " forms " + multiply);
				}
			}
		}
	}

	@Test
	public void bestSolution() {
		int[] arr = {2, 4, 6, 8, 9, 5, 3, 12};
		int multiply = 24;
		Map<Integer,Integer> map=new HashMap<>();
	    for(int i:arr){
			if(multiply%i==0 && map.containsKey(multiply/i)){
				System.out.println(i + " " + multiply/i);
			}
			else{
				map.put(i,i);
			}
		}
	}
}
