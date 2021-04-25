package SlidingWindowAdityaVerma;


//Given an input string and a pattern, We need to find the count of all anagram pattern within the input String
//inputString=aabaabaa
//pattern=aaba
//Anagram means no of characters remains the same,so in pattern aaba we have 3 a's and 1 b. So all the anagram of the
// provided pattern would also have 3 a's and 1 b

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class ListNoOfAnagramOfGivenPatternWithinAString {

	@Test
	public void listNoOfAnagramOfGivenPatternWithinAString(){

		String inputString="aabaabaa";
		String pattern="aaba";
		int windowSize=pattern.length();
		char [] inputStringArray=inputString.toCharArray();
		char [] patternArray=pattern.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();

		//Inserting pattern values within the Map.
		for(char ch:patternArray){
			if(map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}
			else{
				map.put(ch,1);
			}
		}
		int countOfDistinctLettersInPattern=map.size();
		int i=0;
		for(int j=i;j<inputStringArray.length;j++){
		//	Map<Character,Integer> map2
			if(map.containsKey(inputStringArray[j])){
				map.put(inputStringArray[j],map.get(inputStringArray[j])-1);
			}


			if(j-i+1==windowSize){

			}

		}

	}

}
