package JavaConceptOfTheDay;

import java.util.HashMap;
import java.util.Map;

public class CompareHashMapExample {
	public static void main(String[] args) {
		Map< String, String > sourceMap = new HashMap< String, String >();
		sourceMap.put("Key1", "Value1");
		sourceMap.put("Key2", "Value2");

		Map < String, String > dstMap = new HashMap < String, String > ();
		dstMap.put("Key1", "Value1");
		dstMap.put("Key2", "Value2");
		dstMap.put("Key3", "Value3");

		CompareHashMapExample hashMapExample = new CompareHashMapExample();

		// call areEqual method
		System.out.println("Are two HashMap equals :: " + hashMapExample.areEqual(sourceMap, dstMap));
	}

	/**
	 * Compare HashMaps using the Java 8 Stream API
	 * @param first
	 * @param second
	 * @return
	 */
	public boolean areEqual(Map < String, String > first, Map < String, String > second) {
		if (first.size() != second.size()) {
			return false;
		}

		return first.entrySet()
				.stream()
				.allMatch(e -> e.getValue().equals(second.get(e.getKey())));
	}
}
