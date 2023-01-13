package ComparableAndComparater;


import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

/*
* We cannot sort HashSet using Collections.sort() as sort method takes only list of elements
* so to sort an HashSet we have two approaches
*
* 1. Use TreeSet
* TreeSet by default stores objects in Ascendign order, If we need to ensure that TreeSet
* store object in Descending order then we need to use descendingSet methode while creating
* object of TreeSet
*
* 2.Convert HashSet into List and sort the list using collections.sort()
* */

public class SortingHashSet {

    @Test
    public void sortHashSetUsingTreeSet(){
        Set<Integer> set=new HashSet<>();
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(10);
        set.add(69);
        set.add(1);
        set.stream().forEach(e -> System.out.println(e));

        //Sorted in Ascending order using TreeSet
        Set<Integer> treeSet = new TreeSet<>(set);
        System.out.println("-----Ascending Sorted-------");
        treeSet.stream().forEach(e -> System.out.println(e));

        //Descending Sorted
        //To sort in descending we need to use descendingSet method
        Set<Integer> treeSet1 = new TreeSet<>(set).descendingSet();
        System.out.println("-----Descending Sorted-------");
        treeSet1.stream().forEach(e -> System.out.println(e));
    }

    @Test
    public void sortHashSetUsingList(){
        Set<Integer> set=new HashSet<>();
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(10);
        set.add(69);
        set.add(1);
        set.stream().forEach(e -> System.out.println(e));

        //Sorted in Ascending order using TreeSet
        List<Integer> list1 = new ArrayList<>(set);
        System.out.println("-----Ascending Sorted-------");
        Collections.sort(list1);
        list1.stream().forEach(e -> System.out.println(e));

        //Descending Sorted
        System.out.println("-----Descending Sorted-------");
        Collections.sort(list1,Collections.reverseOrder());
        list1.stream().forEach(e -> System.out.println(e));
    }
}
