package SortHaspMap;

/*
* https://www.baeldung.com/java-hashmap-sort
* */

import org.testng.annotations.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*   TreeMap sorts HashMap based on Keys
*
* */
public class SortHashMapBasedOnKeysUsingTreeMap {

    @Test
    public void sortHashMapUsingTreeMap(){
        Map<String,Integer> map =new HashMap<>();
        map.put("Ashwini",100);
        map.put("chetan",15);
        map.put("babu",105);
        map.put("dog",101);
        System.out.println(map);

        //Sorting HashMap in ascending using key with the help of TreeMap
        Map<String,Integer> treeMap =new TreeMap<>(map);
        System.out.println(treeMap);

        //Sorting HashMap in Descending using key with the help of TreeMap
        Map<String,Integer> treeMap1 =new TreeMap<>(map).descendingMap();
        System.out.println(treeMap1);
    }
}

