package Java8Practise.LambaFunction;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Java8Distinct {

    @Test
    public void Java8Distinct(){

        List<String> names= Arrays.asList("vishesh","vishesh","vishesh","sandesh","sandesh","Tonu","Tonu");
        System.out.println("Printing names without duplication:");
        names.forEach(System.out::println);
        //Removing Duplicate names using java 8
        System.out.println("Removing duplicate names:");
        names.stream().distinct().forEach(System.out::println);

        //Removing Duplicate names using HashSet
        System.out.println("Removing duplicate names using Hashset:");
        Set<String> uniqueNames=new HashSet<>();
        names.forEach(name ->uniqueNames.add(name));
        uniqueNames.forEach(System.out::println);

    }
}
