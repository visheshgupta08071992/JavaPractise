package JavaConceptOfTheDay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class CompareHashMapExample2 {

	//Compare hashmap for the Key and Value pair
	@Test
	public void compareHashMapBasedOnKeyAndValuePair(){

		Map<String,Integer> map1=new HashMap<>();
		map1.put("Akola",1);
		map1.put("Pune",2);
		map1.put("Nagpur",3);

		Map<String,Integer> map2=new HashMap<>();
		map2.put("Akola",4);
		map2.put("Pune",2);
		map2.put("Nagpur",3);

		Map<String,Integer> map3=new HashMap<>();
		map3.put("Akola",1);
		map3.put("Pune",2);
		map3.put("Nagpur",3);
		map3.put("Amravati",4);

		Map<String,Integer> map4=new HashMap<>();
		map4.put("Pune",2);
		map4.put("Nagpur",3);
		map4.put("Akola",1);

		Map<String,Integer> map5=new HashMap<>();
		map5.put("Puneri",2);
		map5.put("Nagpur",3);
		map5.put("Akola",1);

		System.out.println("It is " + map1.equals(map2)+ " that map1 and map2 are equal");
		System.out.println("It is " + map1.equals(map3)+ " that map1 and map3 are equal");
		System.out.println("It is " + map1.equals(map4)+ " that map1 and map4 are equal");
		System.out.println("It is " + map1.equals(map5)+ " that map1 and map5 are equal");
	}

	//Compare hashmap for the same keys
	@Test
	public void compareHashMapBasedOnKeys(){

		Map<String,Integer> map1=new HashMap<>();
		map1.put("Akola",1);
		map1.put("Pune",2);
		map1.put("Nagpur",3);

		Map<String,Integer> map2=new HashMap<>();
		map2.put("Akola",4);
		map2.put("Pune",2);
		map2.put("Nagpur",3);

		Map<String,Integer> map3=new HashMap<>();
		map3.put("Akola",1);
		map3.put("Pune",2);
		map3.put("Nagpur",3);
		map3.put("Amravati",4);

		Map<String,Integer> map4=new HashMap<>();
		map4.put("Pune",2);
		map4.put("Nagpur",3);
		map4.put("Akola",1);

		Map<String,Integer> map5=new HashMap<>();
		map5.put("Puneri",2);
		map5.put("Nagpur",3);
		map5.put("Akola",1);

		System.out.println("It is " + map1.keySet().equals(map2.keySet())+ " that map1 and map2 have same keys");
		System.out.println("It is " + map1.keySet().equals(map3.keySet())+ " that map1 and map3 have same keys");
		System.out.println("It is " + map1.keySet().equals(map4.keySet())+ " that map1 and map4 have same keys");
		System.out.println("It is " + map1.keySet().equals(map5.keySet())+ " that map1 and map5 have same keys");
	}

	//Compare hashmap for the same values
	@Test
	public void compareHashMapBasedOnValues(){

		Map<String,Integer> map1=new HashMap<>();
		map1.put("Akola",1);
		map1.put("Pune",2);
		map1.put("Nagpur",3);

		Map<String,Integer> map2=new HashMap<>();
		map2.put("Akola",4);
		map2.put("Pune",2);
		map2.put("Nagpur",3);

		Map<String,Integer> map3=new HashMap<>();
		map3.put("Akola",1);
		map3.put("Pune",2);
		map3.put("Nagpur",3);
		map3.put("Amravati",4);

		Map<String,Integer> map4=new HashMap<>();
		map4.put("Pune",2);
		map4.put("Nagpur",3);
		map4.put("Akola",1);

		Map<String,Integer> map5=new HashMap<>();
		map5.put("Puneri",3);
		map5.put("Nagpur",2);
		map5.put("Akola",1);


		//We have stored in ArrayList and compared hashmap based on Values as map.values returns collection<Integer>
		// which is an interface and does not implement equals method.

		System.out.println("It is " + new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())) + " that " +
				"map1 and map2 have same Values");

		System.out.println("It is " + new ArrayList<>(map1.values()).equals(new ArrayList<>(map3.values())) + " that " +
				" map1 and map3 have same Values");

		System.out.println("It is " + new ArrayList<>(map1.values()).equals(new ArrayList<>(map4.values())) + " that " +
				" map1 and map4 have same Values");

		System.out.println("It is " + new ArrayList<>(map1.values()).equals(new ArrayList<>(map5.values())) + " that " +
				" map1 and map5 have same Values");
	}

	//Compare two maps and find the additional key in Map1
	@Test
	public void compareHashMapAndFindAdditionalkeyInMap1() {

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Akola", 1);
		map1.put("Pune", 2);
		map1.put("Nagpur", 3);
		map1.put("Mumbai",4);

		Map<String, Integer> map2 = new HashMap<>();
		map2.put("Akola", 4);
		map2.put("Pune", 2);
		map2.put("Nagpur", 3);

		//Set<String> combineKeys=new HashSet<>(map1.keySet());
		Set<String> combineKeys=map1.keySet();
		combineKeys.removeAll(map2.keySet());
		System.out.println("Additional key in Map1 is : " + combineKeys);

	}

	//Compare two maps and find the additional key in Map1 without using Hashset
	@Test
	public void compareHashMapAndFindAdditionalkeyInMap1WithoutUsingHashSet() {

		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Akola", 1);
		map1.put("Pune", 2);
		map1.put("Nagpur", 3);
		map1.put("Mumbai",4);

		Map<String, Integer> map2 = new HashMap<>();
		map2.put("Akola", 4);
		map2.put("Pune", 2);
		map2.put("Nagpur", 3);

		for(String key:map1.keySet()){
			if(!map2.containsKey(key)){
				System.out.println("Additional key in Map1 is : " + key);
			}
		}
	}

	//Compare two hashmaps using key and value without using inbuilt equals method
	@Test
	public void compareHashMapBasedOnKeyAndValuePairWithoutUsingInBuiltEqualsMethod(){

		Map<String,Integer> map1=new HashMap<>();
		map1.put("Akola",1);
		map1.put("Pune",2);
		map1.put("Nagpur",3);

		Map<String,Integer> map2=new HashMap<>();
		map2.put("Akola",4);
		map2.put("Pune",2);
		map2.put("Nagpur",3);

		Map<String,Integer> map3=new HashMap<>();
		map3.put("Akola",1);
		map3.put("Pune",2);
		map3.put("Nagpur",3);
		map3.put("Amravati",4);

		Map<String,Integer> map4=new HashMap<>();
		map4.put("Pune",2);
		map4.put("Nagpur",3);
		map4.put("Akola",1);

		Map<String,Integer> map5=new HashMap<>();
		map5.put("Puneri",2);
		map5.put("Nagpur",3);
		map5.put("Akola",1);

		System.out.println("It is " + utilityEqualMethod(map1,map2)+ " that map1 and map2 are equal");
		System.out.println("It is " + utilityEqualMethod(map1,map3)+ " that map1 and map3 are equal");
		System.out.println("It is " + utilityEqualMethod(map1,map4)+ " that map1 and map4 are equal");
		System.out.println("It is " + utilityEqualMethod(map1,map5)+ " that map1 and map5 are equal");
	}

	public boolean utilityEqualMethod(Map<String,Integer> map1,Map<String,Integer> map2){
		if(map1.size()!=map2.size()){
			return false;
		}
		return map1.entrySet().stream().allMatch(e -> e.getValue().equals(map2.get(e.getKey())));
	}

	//Iterate HashMap using Entry
	@Test
	public void iterateHashMapUsingEntry(){
		Map<String,Integer> map1=new HashMap<>();
		map1.put("Akola",1);
		map1.put("Pune",2);
		map1.put("Nagpur",3);

		for(Map.Entry<String,Integer> entry : map1.entrySet()){
			System.out.println("Key is : " + entry.getKey() + " while value is : " + entry.getValue());
		}
	}

	//Iterate HashMap using Keys
	@Test
	public void iterateHashMapUsingKeys(){
		Map<String,Integer> map1=new HashMap<>();
		map1.put("Akola",1);
		map1.put("Pune",2);
		map1.put("Nagpur",3);

		for(String key : map1.keySet()){
			System.out.println("Key is : " + key + " while value is : " + map1.get(key));
		}
	}

	//Iterate HashMap using Java8
	@Test
	public void iterateHashMapUsingJava8(){
		Map<String,Integer> map1=new HashMap<>();
		map1.put("Akola",1);
		map1.put("Pune",2);
		map1.put("Nagpur",3);

		map1.forEach((k,v) -> System.out.println("Key is : " + k + " while value is : " + v));
	}

}
