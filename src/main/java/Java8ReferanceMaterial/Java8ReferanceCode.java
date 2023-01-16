package Java8ReferanceMaterial;

import ComparableAndComparater.Student;
import org.testng.annotations.Test;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Java8ReferanceCode {

    @Test
    public void understandingforEach(){
        List<Integer> list = Arrays.asList(1,2,3,4);

        //Using forEach without using Stream
        list.forEach(e-> System.out.println(e));

        System.out.println("------------------------");

        //Using forEach with Stream
        list.stream().forEach(e-> System.out.println(e));

        Map<String,Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);

        //Using forEach without using Stream
        map.forEach((key,value) -> System.out.println( key + "-" + value ));

        System.out.println("------------------------");

        //Using forEach with Stream

        map.entrySet().stream().forEach(e -> System.out.println(e));
    }

    @Test
    public void understandingFilter(){

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        //Filtering values which are greater then a particular value
        list.stream().filter(e -> e>3).forEach(e -> System.out.println(e));

        System.out.println("---------------------------------------------");

        List<String> list1 = Arrays.asList("Akshay","Aashu","Chandan","anurag");

        //Filtering names which starts with A
        list1.stream().filter(e -> e.startsWith("A")).forEach(e -> System.out.println(e));

        System.out.println("---------------------------------------------");

        Map<String,Integer> map = new HashMap<>();

        map.put("Akshay",100);
        map.put("Chandan",150);
        map.put("Nihal",200);

        //Filtering Map whose Key starts with A
        map.entrySet().stream()
                .filter(e -> e.getKey().startsWith("A"))
                .forEach(e -> System.out.println(e));

        System.out.println("---------------------------------------------");

        //Filtering Map whose value is greater then 100
        map.entrySet().stream()
                .filter(e -> e.getValue() > 100)
                .forEach(e -> System.out.println(e));

    }

    @Test
    public void understandingSort(){

        List<Integer> list = Arrays.asList(4,5,3,1,2);

        //Old approach to sort list in Ascending order
        Collections.sort(list);

        System.out.println(list);

        System.out.println("----------------------------------");

        //Sort in Reverse Order

        Collections.sort(list,Collections.reverseOrder());

        System.out.println(list);

        System.out.println("----------------------------------");

        List<Integer> list1 = Arrays.asList(4,5,3,1,2);

        //Sort list in Ascending using Stream

        list1.stream().sorted().forEach(e-> System.out.println(e));

        System.out.println("----------------------------------");

        //Sort list in Descending using Stream

        list1.stream().sorted(Collections.reverseOrder()).forEach(e-> System.out.println(e));

        System.out.println("----------------------------------");

      //Sort Student list using comparater

        List<ComparableAndComparater.Student> list5=new ArrayList<>();
        list5.add(new ComparableAndComparater.Student(100,"Vishesh"));
        list5.add(new ComparableAndComparater.Student(90,"Vishesh"));
        list5.add(new ComparableAndComparater.Student(80,"Sandesh"));
        list5.add(new Student(100,"Harshi"));

        //Sort based on highest Marks to Lowest Marks. And if Marks are equal then sort based
        //on names in alphabetical order

        System.out.println("Before Sorting Student List");

        System.out.println(list5);

        System.out.println("----------------------------------");


        Collections.sort(list5,(a,b) ->{
            if(Integer.valueOf(a.getMarks()) - Integer.valueOf(b.getMarks())==0){
                return a.getName().compareTo(b.getName());
            }
            return Integer.valueOf(b.getMarks()).compareTo(Integer.valueOf(a.getMarks()));
        });

        System.out.println("After sorting Student List");

        System.out.println(list5);

        System.out.println("----------------------------------");

        //Sort Student list using Streams

        List<ComparableAndComparater.Student> student=new ArrayList<>();
        student.add(new ComparableAndComparater.Student(100,"Vishesh"));
        student.add(new ComparableAndComparater.Student(90,"Vishesh"));
        student.add(new ComparableAndComparater.Student(80,"Sandesh"));
        student.add(new Student(100,"Harshi"));

        //Sort based on highest Marks to Lowest Marks. And if Marks are equal then sort based
        //on names in alphabetical order

        student.stream().sorted((a,b) ->{
            if(Integer.valueOf(a.getMarks()) - Integer.valueOf(b.getMarks())==0){
                return a.getName().compareTo(b.getName());
            }
            return Integer.valueOf(b.getMarks()).compareTo(Integer.valueOf(a.getMarks()));
        }).forEach(e -> System.out.println(e));

        //Sort Map
        Map<String,Integer> map = new HashMap<>();

        map.put("Akshay",100);
        map.put("Chandan",150);
        map.put("Nihal",200);

        //Sort Map based on names(keys) in reverse order

       map.entrySet().stream().sorted((a,b) ->{
           return b.getKey().compareTo(a.getKey());
       }).forEach(e -> System.out.println(e));
    }

    @Test
    public void understandingMapAndFlatMap(){
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("Vishal","Sahil"));
        list.add(Arrays.asList("Akshat","Akhil"));
        list.add(Arrays.asList("Neha","Nikita"));

        List<String> listWithMap = list.stream()
                                             //Flatenning the List<List<String>> to List<String>
                                              .flatMap(e -> e.stream())
                                            //Now Transforming the List<String>
                                              .map(e -> e.toUpperCase(Locale.ROOT))
                                              .collect(Collectors.toList());

        System.out.println(listWithMap);

    }

    @Test
    public void understandingReduceMethod(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        //Find sum of all elements using sum method
        int sum=list.stream().mapToInt(e -> e).sum();
        System.out.println(sum);

        //Find sum of all elements using reduce method.
        //The first parameter of reduce method is the initial value while the second
        //parameter is the operation
        int sumUsingReduce =list.stream().reduce(0,(a,b) -> a+b);
        System.out.println(sumUsingReduce);

        //Find product of all elements using reduce method.
        //The first parameter of reduce method is the initial value while the second
        //parameter is the operation
        int productUsingReduce =list.stream().reduce(1,(a,b) -> a*b);
        System.out.println(productUsingReduce);

        //Find Max element from the list using reduce

        int max1 = list.stream().reduce(0,(a, b) -> a>b?a:b);

        System.out.println(max1);

        List<String> words = Arrays.asList("Java","Hi","Aurangabad");

        //Find the longest string from the Array List

        String longestString = words.stream()
                .reduce((word1,word2) -> word1.length() > word2.length()?word1:word2).get();
        System.out.println(longestString);
    }

    @Test
    public void understandingOptionalClass() {
        //Declare a variable of Type String and create an Optional out of it.

        String str = "SDET";

        Optional<String> stringOptional = Optional.ofNullable(str);

        System.out.println(stringOptional.get());
    }

    @Test
    public void understandingOptionalClass1() {
        /*Declare a variable of Type String which has null and create an Optional out of it.
         Ensure that there is no NullPointer Exception.Return a default value if
         the value is null*/

        String str = null;

        Optional<String> stringOptional = Optional.ofNullable(str);

        /*
        * isPresents checks whether there are values in Optional
        * */

        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get());
        }
        else{
            /*
            * orElse checks whether the value is present else it returns the default value
            * */

            String value= stringOptional.orElse("No value present");
            System.out.println(value);
        }
    }
}
