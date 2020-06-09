package Java8Practise.LambaFunction;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TakeAnArrayAndReturnSquareOfTheArray {
   @Test
    public void returnSquareOfInputArray(){
        List<Integer> numbers= Arrays.asList(2,3,4,5);
        numbers.stream()
                .map(number -> number * number)
                .forEach(System.out::println);
   }
}
