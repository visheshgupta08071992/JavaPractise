package JavaConceptOfTheDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class ConvertArrayofIntToArrayList {

	/*There is no shortcut for converting from int[] to List<Integer> as Arrays.asList does not deal with boxing and will just create a List<int[]> which is not what you want. You have to make a utility method.*/

	@Test
	public void convertArrayofIntToArrayList(){
		int[] ints = {1, 2, 3};
		List<Integer> intList = new ArrayList<Integer>(ints.length);
		for (int i : ints)
		{
			intList.add(i);
		}
		System.out.println(intList);
	}

	@Test
	public void convertArrayofIntToArrayListUsingJava8(){
		int[] ints = {1, 2, 3};
		List<Integer> intList = Arrays.stream(ints).boxed().collect(Collectors.toList());
		System.out.println(intList);
	}
}
