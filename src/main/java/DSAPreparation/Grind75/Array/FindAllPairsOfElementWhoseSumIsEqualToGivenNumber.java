package DSAPreparation.Grind75.Array;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

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
		int [] arr={4, 5, 7, 11, 9,10,13, 8, 12};
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

	@Test
	// This Test ensures that while using HashMap,Pair is formed with other nos not with the same no
	public void findPairsUsingBruteForce1() {
		int[] arr = {4, 5, 7, 11, 9, 13, 8, 12,10,10};
		int sum = 20;
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
			int requiredNoToFormPair=sum-arr[i];
			if(map.containsKey(requiredNoToFormPair)){
				if(requiredNoToFormPair==arr[i]){
					if(map.get(requiredNoToFormPair) > 1){
						System.out.println(arr[i] + "+" + requiredNoToFormPair + " forms " + sum);
					}
				}
				else {
					System.out.println(arr[i] + "+" + requiredNoToFormPair + " forms " + sum);
				}
			}
		}
	}

	@Test
	public void bestApproach(){
		int[] arr = {4, 5, 7, 11, 9, 13, 8, 12,10,10};
		int sum = 20;
		Map<Integer,Integer> map=new HashMap<>();

		for(int i:arr){
			if(map.containsKey(sum -i)){
				System.out.println(map.get(sum-i) + "+" + i + " forms " + sum);
			}
			else{
				map.put(i,i);
			}

		}
	}
	}
