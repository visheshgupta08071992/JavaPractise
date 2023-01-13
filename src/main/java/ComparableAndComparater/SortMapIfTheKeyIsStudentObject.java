package ComparableAndComparater;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapIfTheKeyIsStudentObject {

    /*
    *
    * Tree Map alone won't be able to sort based on keys if the key is class object,
    * we need to provide comparater to tree Map to make him aware on what basis do we
    * need to sort the Keys.
    *
    * TreeMap only compares based on Keys, It cannot compare based on values.
    *
    * Also for passing Comparater within constructor of Map we need to use Tree Map. we
    * cannot pass comparater to HashMap Constructer
    *
    * So remember map mai sorting related kuch bhi ho toh best is to use TreeMap.
    *
    *
    *
    * */

    @Test
    public void trySortingStudentObjectUsingTreeMapAndComparater(){

        /*
        * The given program sorts map based on Student Object Marks in descending order
        * If marks are equal then it would sort on names in Alphabateical order.
        *
        *
        * */

        Map<Student,Integer> map = new TreeMap<>((a,b) ->{
            if(a.getMarks() - b.getMarks()==0){
                return a.getName().compareTo(b.getName());
            }
            return Integer.valueOf(b.getMarks()).compareTo(a.getMarks());
        });
        map.put(new Student(100,"Vishesh"),1);
        map.put(new Student(90,"Vishesh"),2);
        map.put(new Student(80,"Sandesh"),3);
        map.put(new Student(100,"Harshi"),4);
        map.put(new Student(110,"Zarshi"),4);

        System.out.println(map);
    }
}
