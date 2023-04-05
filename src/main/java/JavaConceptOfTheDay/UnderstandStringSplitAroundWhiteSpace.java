package JavaConceptOfTheDay;

import org.testng.annotations.Test;

import java.util.Arrays;

public class UnderstandStringSplitAroundWhiteSpace {

    @Test
    public void understandStringSplitAroundWhiteSpace(){
        String s ="a good   example";
        String [] sArray = s.split(" ");
        System.out.println(Arrays.toString(sArray));
    }
}
