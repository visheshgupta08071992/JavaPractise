package JavaConceptOfTheDay;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class FindAllPairsOfElementWhoseSumIsEqualToGivenNumber {
	/*if {4, 5, 7, 11, 9, 13, 8, 12} is an array and 20 is the given number, then you have to find all pairs of elements in this array whose sum must be 20. In this example, (9, 11), (7, 13) and (8, 12) are such pairs whose sum is 20*/

	@Test
	public void findPairsUsingBruteForce(){
		int [] arr={4, 5, 7, 11, 9, 13, 8, 12};
		int sum=20;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==sum){
					System.out.println("Pairs which form sum are " + arr[i] +" "+arr[j]);
				}
			}
		}
	}

	@Test
	public void findPairsUsingHashMap(){
		int [] arr={4, 5, 7, 11, 9, 13, 8, 12};
		int sum=20;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i:arr){
			if(map.containsKey(i)){
				map.put(i,map.get(i) + 1);
			}
			else{
				map.put(i,1);
			}
		}
		System.out.println(map);
		for(int i=0;i<arr.length;i++){
			int pairNo=sum-arr[i];
			if(map.containsKey(pairNo)){
				System.out.println("Pairs which form sum are " + arr[i] +" "+ pairNo);
			}
		}

		}
	}
