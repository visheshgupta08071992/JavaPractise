package JavaConceptOfTheDay;

//Java Program to find duplicate words in a String and there no of occurance

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class FindDuplicateWordsInAString {

    @Test
	public void duplicateWords(){

	String original="Bread butter and Bread";
	String [] originalArray=original.split(" ");
	Map<String,Integer> map=new HashMap<String,Integer>();
	for(String str:originalArray){
		if(map.containsKey(str)){
			map.put(str,map.get(str) + 1);
		}
		else{
			map.put(str,1);
		}
	}
	    for (Map.Entry<String,Integer> entry: map.entrySet()) {
	    	if(entry.getValue()>1){
			    System.out.println(entry.getKey() +" is repeated "+ entry.getValue() + " times" );
		    }

	    }
}

	@Test
	public void findDuplicateWordsUsingHashSet(){
		String original="Bread butter and Bread";
		String [] originalArray=original.split(" ");
		Set<String> set=new HashSet<String>();
		for(String str:originalArray){
           if(!set.add(str)){
	           System.out.println("Duplicate Word is : " + str);
           }
		}
	}

	@Test
	public void findDuplicateWordUsingTwoForLoops(){
		String original="Bread butter and Bread";
		String [] originalArray=original.split(" ");
		for(int i=0;i<originalArray.length;i++){
				for (int j = i + 1; j <originalArray.length; j++) {
					if (originalArray[i].equals(originalArray[j])) {
						System.out.println(originalArray[i]);
					}
				}
		}
	}

}


