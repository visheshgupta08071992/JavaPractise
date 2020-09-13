package JavaConceptOfTheDay;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaProgramToCompareTwoJsonAndStoreTheUnCommonDataInThirdJSON {

	@Test
	public void compareTwoJsonAndStoreUncommonResultinThirdJson() throws IOException {

		ObjectMapper objectMapper = new ObjectMapper();
		Map<String,Object> mapJson1=objectMapper.readValue(new File(System.getProperty("user.dir") + "/src/main/java" +
				"/JavaConceptOfTheDay/json1.json"),Map.class);
		Map<String,Object> mapJson2=objectMapper.readValue(new File(System.getProperty("user.dir") + "/src/main/java" +
				"/JavaConceptOfTheDay/json2.json"),Map.class);
		Map<String,Object> mapJson3=new HashMap<>();
		System.out.println(mapJson1);
		System.out.println(mapJson2);
		for(String key:mapJson1.keySet()){
			if(!mapJson2.containsKey(key)){
				mapJson3.put(key,mapJson1.get(key));
			}
		}
		for(String key:mapJson2.keySet()){
			if(!mapJson1.containsKey(key)){
				mapJson3.put(key,mapJson2.get(key));
			}
		}
		System.out.println(mapJson3);
		objectMapper.writeValue(new File(System.getProperty("user.dir") + "/src/main/java" +
				"/JavaConceptOfTheDay/json3.json"),mapJson3);
	}
}
