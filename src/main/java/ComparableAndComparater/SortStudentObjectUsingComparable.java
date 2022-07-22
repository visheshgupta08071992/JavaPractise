package ComparableAndComparater;

import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudentObjectUsingComparable {

    @Test
    public void sort(){
        List<Student> list=new ArrayList<>();
        list.add(new Student(100,"Vishesh"));
        list.add(new Student(90,"Vishesh"));
        list.add(new Student(80,"Sandesh"));
        list.add(new Student(100,"Harshi"));

        //Sorted in Ascending order first on Marks and if Marks are equal then on name
        Collections.sort(list);
        list.stream().forEach(e -> System.out.println(e));

        System.out.println("------------------------------");

        //Sorted in Descending order first on Marks and if Marks are equal then on name
        Collections.sort(list,Collections.reverseOrder());
        list.stream().forEach(e -> System.out.println(e));
    }
}
