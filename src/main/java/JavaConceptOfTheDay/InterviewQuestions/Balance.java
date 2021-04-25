package JavaConceptOfTheDay.InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class Balance {

//You are given a String Consisting of Digits.Find the Largest Two digit value in the given String.

	/*
	Examples:
	50552 => Output 55
	10101 => Output 10
	88 => Output 88
	* */

	@Test
	public void checkParanthesisBalance() {
		int [] arr={2,5,1,8,2,9,1};

		int maxSum=0;
		int windowSize=3;
		//Here subArrays of size are
		/*{2,5,1} =>8
		{5,1,8}=>14
		{1,8,2}=>11
		{8,2,9}=>19
		{2,9,1}=>12*/
		for(int i=0;i<arr.length-2;i++){
			int sum=0;
			for(int j=i;j<i+windowSize;j++){
				sum=sum+arr[j];
			}
			if(sum>maxSum){
				maxSum=sum;
			}
		}
		System.out.println(maxSum);
	}

	@Test
	public void checkParanthesisBalance1() {
		int [] arr={2,5,1,8,2,9,1};

		int maxSum=0;
		int windowSize=3;
		//Here subArrays of size are
		/*{2,5,1} =>8
		{5,1,8}=>14
		{1,8,2}=>11
		{8,2,9}=>19
		{2,9,1}=>12*/
		int i=0;
		int sum=0;
		for(int j=i;j<arr.length;j++){
			sum=sum + arr[j];
			if(j-i+1==windowSize){
				if(sum>maxSum){
					maxSum=sum;
				}
				sum=sum-arr[i];
				i++;
			}
		}
		System.out.println(maxSum);

	}

	@Test
	public void checkParanthesisBalance3(){
		int [] arr={12,-1,-7,8,-15,20,16,28};
		int windowSize=3;
		//int i=0;
		//Here first negative elements in each subarray of size 3 are:

		/*{12,-1,-7} =>-1
		{-1,-7,8}  =>-1
		{-7,8,-15} =>-7
		{8,-15,20} =>-15
		{-15,20,16}=>-15
		{20,16,28}=>Nothing	*/

		for(int i=0;i<arr.length-2;i++){
			for(int j=i;j< i+windowSize;j++){
				if(arr[j]<0){
					System.out.println(arr[j]);
					break;
				}
			}
		}

	}
	@Test
	public void checkParanthesisBalance4(){
		int [] arr={12,-1,-7,8,-15,20,16,28};
		int windowSize=3;
		int i=0;
		List<Integer> list=new ArrayList<>();
		//Here first negative elements in each subarray of size 3 are:

		/*{12,-1,-7} =>-1
		{-1,-7,8}  =>-1
		{-7,8,-15} =>-7
		{8,-15,20} =>-15
		{-15,20,16}=>-15
		{20,16,28}=>Nothing	*/
		for(int j=i;j<arr.length;j++){
			if(arr[j]<0){
				list.add(arr[j]);
			}
			if(j-i+1==windowSize) {

				if (list.size()<1) {
					System.out.println("No negative no between index " + i + " to " + j);

				} else {
					System.out.println("First negative no between index " + i + " to " + j + " is " + list.get(0));
					if (list.get(0).equals(arr[i])) {
						list.remove(0);
					}
					i++;
				}
			}
		}
	}

	@Test
	public void checkParanthesisBalance5(){
		String s="Harry is Harry";
		s=s.replaceAll("\\s","");
		System.out.println(s);
	}

	@Test
	public void checkParanthesisBalance6(){
		String s="Harry                  is                         Harry";
		char [] sArray=s.toCharArray();
	    String withoutSpace="";
	    for(int i=0;i<sArray.length;i++){
	    	if(sArray[i]!=' '){
	    		withoutSpace=withoutSpace + sArray[i];
		    }
	    }
		System.out.println(withoutSpace);
	}

	@Test
	public void checkParanthesisBalance7(){
		String s="Harry                  is                         Harry";
		String withoutSpace="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				withoutSpace=withoutSpace + s.charAt(i);
			}
		}
		System.out.println(withoutSpace);
	}

	@Test
	public void checkParanthesisBalance9(){
		String s="Harry10is22Harry68$";
		s=s.replaceAll("\\W","");
		System.out.println(s);
	}

	@Test
	public void separateZeros(){
		int[] arr1 ={1,0,5,0,4,0};
		int count=arr1.length-1;
		for(int i=arr1.length-1;i>=0;i--){
			if(arr1[i]!=0){
				arr1[count]=arr1[i];
				count--;
			}
		}
		while(count>=0){
			arr1[count]=0;
			count--;
		}
		System.out.println(Arrays.toString(arr1));
	}

	@Test
	public void separateZerosAtStary(){
		int[] arr1 ={1,0,5,0,4,0};
		int count=0;

		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=0){
				arr1[count]=arr1[i];
				count++;
			}
		}
		while(count<arr1.length){
			arr1[count]=0;
			count++;
		}
		System.out.println(Arrays.toString(arr1));
	}

	public boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

			return true;
		} else {
			return false;
		}
	}

	@Test
	public void separate(){
		String s="vishesh";
		int i=0;
		int j=s.length()-1;
		char [] sArray=s.toCharArray();
		while(i<j){
			if(isVowel(sArray[i])){
				i++;
			}
			if(!isVowel(sArray[j])){
				j--;
			}
			if(!isVowel(sArray[i]) && isVowel(sArray[j])){
				char temp;
				temp=sArray[i];
				sArray[i]=sArray[j];
				sArray[j]=temp;
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(sArray));
	}

	@Test
	public void reverseStringPreservingSpaces(){
		String input="I Am Not String";
		//“g ni rtS toNmAI”
		List<Integer> spaceAtIndex=new ArrayList<>();
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==' '){
				spaceAtIndex.add(i);
			}
		}
		String inputWithoutSpace=input.replaceAll(" ","");
		StringBuilder rverseWithProperSpace = new StringBuilder(inputWithoutSpace);
		rverseWithProperSpace.reverse();

		for(int space: spaceAtIndex){
			rverseWithProperSpace.insert(space," ");
		}
		System.out.println(rverseWithProperSpace);

	}

	@Test
	public void reverseStringPreservingSpaces1() {
		String input = "I Am Not String";
		char [] output=new char[input.length()];
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==' '){
				output[i]=' ';
			}
		}
		int j=input.length()-1;
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)!=' '){
				if(output[j]== ' '){
					j--;
				}

					output[j]=input.charAt(i);
					j--;

			}
		}
		System.out.println(String.valueOf(output));

	}

	@Test
	public void compareHashMap(){
		Map< String, String > sourceMap = new HashMap< String, String >();
		sourceMap.put("Key1", "Value1");
		sourceMap.put("Key2", "Value2");

		Map < String, String > dstMap = new HashMap < String, String > ();
		dstMap.put("Key1", "Value1");
		dstMap.put("Key2", "Value2");
		dstMap.put("Key3", "Value3");

		System.out.println(sourceMap.entrySet().stream().allMatch(e -> e.getValue().equals(dstMap.get(e.getKey()))));
	}

	@Test
	public void compareHashMapAndFindAdditionalkeyInMap1() {

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Akola", 1);
		map1.put("Pune", 2);
		map1.put("Nagpur", 3);
		map1.put("Mumbai", 4);

		Map<String, Integer> map2 = new HashMap<>();
		map2.put("Akola", 4);
		map2.put("Pune", 2);
		map2.put("Nagpur", 3);

		Set<String> set=map1.keySet();
		for(String s:set){
			if(!map2.keySet().contains(s)){
				System.out.println("Additional key is : " + s);
			}
		}
	}

	@Test
	public void compareHashMapAndFindAdditionalkeyInMap12() {

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Akola", 1);
		map1.put("Pune", 2);
		map1.put("Nagpur", 3);
		map1.put("Mumbai", 4);

		Map<String, Integer> map2 = new HashMap<>();
		map2.put("Akola", 4);
		map2.put("Pune", 2);
		map2.put("Nagpur", 3);

		Set<String> additionalKeyInMap1=map1.keySet();
		Set<String> additionalKey=map2.keySet();
		additionalKeyInMap1.removeAll(map2.keySet());
		System.out.println(additionalKeyInMap1);
	}

	@Test
	public void findLeaderInAnArray() {
		int[] arr = {14, 9, 11, 7, 8, 5, 3};
		int max=arr[arr.length-1];
		System.out.println(max);
		for(int i=arr.length-2;i>=0;i--){
			if(arr[i]>max){
				max=arr[i];
				System.out.println(max);
			}

		}
	}

	@Test
	public void findPairsUsingBruteForce() {
		int[] arr = {4, 5, 7, 11, 9, 13, 8, 12,10};
		int sum = 20;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] + arr[j]==sum){
					System.out.println(arr[i]+ "+" + arr[j] + " forms " + sum);
				}
			}
		}
	}

	@Test
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
	public void duplicateWords() {

		String original = "Bread butter and Bread";
		String [] orignalArray=original.split(" ");
		Set<String> set=new HashSet<>();
		for(String str : orignalArray){
			if(!set.add(str)){
				System.out.println("Duplicate String is : " + str);
			}
		}
	}

	@Test
	public void duplicateWords2() {

		String original = "Bread butter and Bread";
		String [] orignalArray=original.split(" ");
		for(int i=0;i<orignalArray.length;i++){
			for(int j=i+1;j<orignalArray.length;j++){
				if(orignalArray[i].equals(orignalArray[j])){
					System.out.println(orignalArray[i]);
				}

			}
		}
	}

	@Test
	public void duplicateWords3() {

		String s="Selenium";
		for(int i=s.length()-1;i>=0;i--){
			System.out.println(s);
			s=s.substring(0,s.length()-1);

		}
	}

	@Test
	public void duplicateWords4() {
		StringBuilder sb=new StringBuilder("Selenium");
		for(int i=sb.length()-1;i>=0;i--){
			System.out.println(sb);
			sb.deleteCharAt(i);
		}
	}

	@Test
	public void duplicateWords5() {
		StringBuilder sb=new StringBuilder("Selenium");
		for(int i=sb.length()-1;i>=0;i--){
			System.out.println(sb);
			sb.replace(0,sb.length(),sb.substring(0,sb.length()-1));
		}
	}

	@Test
	public void duplicateWords6() {
		StringBuilder sb=new StringBuilder("Selenium");
		StringBuilder reverse=new StringBuilder();
		for(int i=sb.length()-1;i>=0;i--){
			reverse.append(sb.charAt(i));
		}
		System.out.println(reverse);
	}

	@Test
	public void duplicateWords7() {

		String s="Selenium";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--){
			reverse=reverse + s.charAt(i);

		}
		System.out.println(reverse);
	}

	@Test
	public void checkAnagramApproach3() {
		String input1 = "Dormitory";
		String input2 = "Dirty Room";
		Boolean flag=true;
		input1=input1.toLowerCase().replaceAll("\\s","");
		char [] input2Array=input1.toLowerCase().replaceAll("\\s","").toCharArray();

		for(char c:input2Array){
			int index=input1.indexOf(c);
			if(index==-1){
				System.out.println("Strings are not anagram");
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("Strings are anagram");
		}

	}
}
