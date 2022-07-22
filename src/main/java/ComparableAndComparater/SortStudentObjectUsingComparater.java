package ComparableAndComparater;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudentObjectUsingComparater {

    @Test
    public void sortUsingComparater(){
        List<Student> list=new ArrayList<>();
        list.add(new Student(100,"Vishesh"));
        list.add(new Student(90,"Vishesh"));
        list.add(new Student(80,"Sandesh"));
        list.add(new Student(100,"Harshi"));

        //Sorted in Ascending order first on Name and if Names are equal then on marks
        Collections.sort(list,(s1,s2) -> {
            if(s1.name.compareTo(s2.name) == 0){
                return Integer.valueOf(s1.marks).compareTo(Integer.valueOf(s2.marks));
            }
            return s1.name.compareTo(s2.name);
        });

        list.stream().forEach(e -> System.out.println(e));

        System.out.println("----------------------------------------");

        //Sorted in Descending order first on Name and if Names are equal then on marks
        Collections.sort(list,(s1,s2) -> {
            if(s2.name.compareTo(s1.name) == 0){
                return Integer.valueOf(s2.marks).compareTo(Integer.valueOf(s1.marks));
            }
            return s2.name.compareTo(s1.name);
        });

        list.stream().forEach(e -> System.out.println(e));
    }
}
