package JavaConceptOfTheDay;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class FindDuplicateElementsInAnArrayUsingHashSet {

	@Test
	public void findDuplicate(){
		int [] arr={1,2,1,4,2,6,4,7,0,8,6};
		Set<Integer> set=new HashSet<Integer>();
		for(int i:arr){
			if(!set.add(i)){
				System.out.println("Duplicate No is " + i);
			}
		}
	}
}
