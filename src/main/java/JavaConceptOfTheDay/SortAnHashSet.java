package JavaConceptOfTheDay;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortAnHashSet {

    @Test
    public void testSortSetUsingList(){
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(9);
        set.add(4);
        set.add(15);
        set.add(19);
        set.add(91);
        set.add(3);

        System.out.println(set);
      //  Collections.sort(set);
        /*Collections.sort does not work with set. To sort a set either convert into
        list and then sort or Convert the set into tree
        *
        * */

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
