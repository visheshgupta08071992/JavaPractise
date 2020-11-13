package JavaConceptOfTheDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class ArrayListPrograms {

	//Remove Duplicate elements from ArrayList
	@Test
	public void removeDuplicateValuesFromArrayList(){

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,2,3,2,4,4,3));
		 // we can remove duplicate elements by using LinkedHashset,it would not only remove the duplicate elements
		// but also preserve the insertion order

		Set<Integer> set= new LinkedHashSet<>(list);
		System.out.println(set);
	}

	//Remove Duplicate elements from ArrayList using Java 8
	@Test
	public void removeDuplicateValuesFromArrayListUsingJava8(){
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1,2,3,2,4,4,3));
		List<Integer> listWithoutDuplicated=list.stream().distinct().collect(Collectors.toList());
		System.out.println(listWithoutDuplicated);
	}

	//Compare two Array List
	@Test
	public void compareTwoArrayList(){
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(2,1,5,4,3));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(2,1,5,6,3));
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(1,2,4,5,3));

		//Equals method compares with 1-1 indexing hence we need to sort the list.

		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);

		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(list3));
	}

	//Compare two list and find the additional element of List1 which is not present in List
	@Test
	public void compareTwoArrayListAndFindAdditionalElementOfList1(){
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,7,8,9));

		//Find elements present in List1 which are not present in list2
		list1.removeAll(list2);
		System.out.println(list1);
	}

	//Compare two list and find the common elements between them
	@Test
	public void compareTwoArrayListAndFindAdditionalElementOfList11(){
		int [] array1={1,2,3,4,5,7};
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,7,8,9));

		list1.retainAll(list2);
		System.out.println(list1);
	}
}
