package JavaConceptOfTheDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class ConvertArrayListToArray {

	@Test
	public void convertIntegerArrayListToArray(){

		List<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		//toArray Method returns an Object array
		Object [] objectArray=arrayList.toArray();
		System.out.println(Arrays.toString(objectArray));
		for(int i=0;i<objectArray.length;i++){
			System.out.println(objectArray[i]);
		}
	}

	@Test
	public void convertIntegerArrayListToArrayUsingStreams(){

		List<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		//toArray Method returns an Object array
		int [] intArray=arrayList.stream().mapToInt(e -> e).toArray();
		System.out.println(Arrays.toString(intArray));
		for(int i=0;i<intArray.length;i++){
			System.out.println(intArray[i]);
		}
	}

	@Test
	public void convertStringArrayListToArray(){

		List<String> arrayList=new ArrayList<>(Arrays.asList("Vishesh","Sandesh"));
		//toArray Method returns an Object array
		Object [] objectArray=arrayList.toArray();
		System.out.println(Arrays.toString(objectArray));
		for(int i=0;i<objectArray.length;i++){
			String name= (String) objectArray[i];
			if(name.equalsIgnoreCase("vishesh")){
				System.out.println(name);
			}
		}
	}
}
