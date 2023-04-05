package Java8ReferanceMaterial;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnderstandingJava8Reduce {

    @Test
    public void findmaxElement(){
        List<Integer> list = Arrays.asList(0,2,2,5,6,9,3);
        int max=list.stream().reduce(Integer.MIN_VALUE,(a,b) -> a>b?a:b);
        System.out.println(max);

    }
}
