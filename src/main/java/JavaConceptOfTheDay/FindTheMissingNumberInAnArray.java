package JavaConceptOfTheDay;


/*
* Given an Array,Find the missing no in an array from 1 to 10 in the array
*
* */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class FindTheMissingNumberInAnArray {

	@Test
	public void findMissingNo(){
		int [] array={2,5,4,7};
		// So Missing No's are 1,3,6,8,9,10

		List<Integer> list= Arrays.stream(array).boxed().collect(Collectors.toList());

		for(int i=1;i<=10;i++){
			if(!list.contains(i)){
				System.out.println("Missing No is : " + i);
			}
		}
	}
}
