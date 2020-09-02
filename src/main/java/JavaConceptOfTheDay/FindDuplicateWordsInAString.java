package JavaConceptOfTheDay;

//Java Program to find duplicate words in a String and there no of occurance

import java.util.HashMap;
import java.util.Map;

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
}


