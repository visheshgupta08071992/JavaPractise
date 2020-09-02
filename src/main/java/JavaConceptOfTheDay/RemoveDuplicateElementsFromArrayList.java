package JavaConceptOfTheDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class RemoveDuplicateElementsFromArrayList {

	@Test
	public void removeDuplicateElementsFromArrayList(){
		String [] array={"vishesh","sandesh","vishesh","sandesh","harshi"};
		ArrayList<String> arrayList=new ArrayList<String>(Arrays.asList(array));
		Set<String> set=new LinkedHashSet<String>(arrayList);
		System.out.println(set);
	}
}
