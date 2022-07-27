package DSAPreparation.Grind75.String;

import org.testng.annotations.Test;

import java.util.Arrays;

/*
* This program is used to under how does sorting works for String array in Java using
* in build Arrays.sort function.
*
* So the sort function sorts the string array lexographically
*
*So it compares first digit from left of first no to first digit from left of second no
* and whichever is smaller it considers that no as smaller
*
* If first digit from left of first no equals first digit from left of second no then it compares
* with second digit from left for both nos
*
* P
 *
* See find below example how sort works for
* *{10,2} -> {10,2}
 * {13,2} -> {13,2}
 * {"5","13","2"} -> {"13","2","5"}
 * {"5","1389","2"} -> {"1389","2","5"}
 * {"30","3"} -> {"3","30"}
 * {"5587","559"} -> {"5587","559"}
*
*
*
* */

public class UnderstandingLexigraphicSortingOfStringArray {

    /*{10,2} -> {10,2}
    * {13,2} -> {13,2}
    * {"5","13","2"} -> {"13","2","5"}
    * {"5","1389","2"} -> {"1389","2","5"}
    * {"30","3"} -> {"3","30"}
    * {"5587","559"} -> {"5587","559"}
    * */

    @Test
    public void sortStringArray(){
        String [] str = {"5587","559"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }


}
