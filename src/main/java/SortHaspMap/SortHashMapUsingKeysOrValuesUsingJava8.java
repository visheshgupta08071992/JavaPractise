package SortHaspMap;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
/*
* https://www.java67.com/2017/07/how-to-sort-map-by-values-in-java-8.html
* */
public class SortHashMapUsingKeysOrValuesUsingJava8 {

    @Test
    public void sortMapBasedOnValues(){
        Map<String,Integer> map =new HashMap<>();
        map.put("Ashwini",100);
        map.put("chetan",15);
        map.put("babu",105);
        map.put("dog",101);
        System.out.println(map);

        Map<String,Integer> mapSortedWithValue=map.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(mapSortedWithValue);
    }

    @Test
    public void sortMapBasedOnValuesInReverseOrder(){
        Map<String,Integer> map =new HashMap<>();
        map.put("Ashwini",100);
        map.put("chetan",15);
        map.put("babu",105);
        map.put("dog",101);
        System.out.println(map);

        Map<String,Integer> mapSortedWithValue=map.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(mapSortedWithValue);
    }

    @Test
    public void sortMapBasedOnKeys(){
        Map<String,Integer> map =new HashMap<>();
        map.put("Ashwini",100);
        map.put("chetan",15);
        map.put("babu",105);
        map.put("dog",101);
        System.out.println(map);

        Map<String,Integer> mapSortedWithKey=map.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(mapSortedWithKey);
    }

    @Test
    public void sortMapBasedOnKeysInReverseOrder(){
        Map<String,Integer> map =new HashMap<>();
        map.put("Ashwini",100);
        map.put("chetan",15);
        map.put("babu",105);
        map.put("dog",101);
        System.out.println(map);

        Map<String,Integer> mapSortedWithKey=map.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByKey().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(mapSortedWithKey);
    }
}
