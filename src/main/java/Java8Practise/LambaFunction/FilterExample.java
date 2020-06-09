package Java8Practise.LambaFunction;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class FilterExample{

   @Test
    public void filter(){
        List<String> example= Arrays.asList("vishesh","sandesh","Tillu");
        example.stream().filter(ele -> ele.startsWith("vishesh")).forEach(System.out::println);
    }
}
