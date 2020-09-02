package JavaConceptOfTheDay;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

//Union returns the elements from both the Arrays
public class JavaProgramToFindUnionOfTwoArrays {
	@Test
	public void findInterSectionOfArray(){
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

		String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

		Set<String > set=new LinkedHashSet<String>(Arrays.asList(s1));
		set.addAll(Arrays.asList(s2));
		System.out.println("Intersection of Two Arrays is");
		System.out.println(set);
	}


	@Test
	public void findInterSectionOfArrayUsingIteration(){
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

		String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

		Set<String > set=new LinkedHashSet<String>();
		for(String s:s1){
			set.add(s);
		}
		for(String s:s2){
			set.add(s);
		}
		System.out.println("Intersection of Two Arrays is");
		System.out.println(set);
	}
}
