package JavaConceptOfTheDay;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class MapDoesNotReturn {


	@Test
	public void mapReturnTest(){

		Map<String,Integer> map= new HashMap<String,Integer>();
		map.put("abc",1);

		System.out.println(map.remove("abc"));
	}
}
