package Java8Practise.LambaFunction;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class TakeAnArrayAndReturnSquareOfTheArray {
   @Test
    public void returnSquareOfInputArray(){
        List<Integer> numbers= Arrays.asList(2,3,4,5);
        numbers.stream()
                .map(number -> number * number)
                .forEach(System.out::println);
   }
}
