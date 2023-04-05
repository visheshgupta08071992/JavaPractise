package JavaConceptOfTheDay;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class MapToPointsToReferanceOfMap1 {


	@Test
	public void maptoPointsToMap1(){
		Map<Character,String> map=new HashMap<Character,String>();
		map.put('a',"Hello");
		map.put('b',"Vishesh");

		Map<Character,String> map2= map;

		map2.put('b',"VisheshGupta");
		map2.put('c',"Hero");
		System.out.println(map);
	}

}
