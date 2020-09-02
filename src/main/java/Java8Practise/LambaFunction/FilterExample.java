package Java8Practise.LambaFunction;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class FilterExample{

   @Test
    public void filter(){
        List<String> example= Arrays.asList("vishesh","sandesh","Tillu");
        example.stream().filter(ele -> ele.startsWith("vishesh")).forEach(System.out::println);
       example.stream().filter(ele -> !ele.startsWith("vishesh")).forEach(System.out::println);
    }
}
