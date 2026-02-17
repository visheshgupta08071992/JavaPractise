package AFrequentlyAskedBasicJavaPrograms;

/*
*
* Can you please write a Java program for below scenario,Given Question was asked in Epsilon

Input: 19
Output:[4,4,4,7]

Input: 21
Output: [5,5,5,6]

Input: 20
Output: [5,5,5,5]
*
*
*
* */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoInParts {

    @Test
    public void approach1() {
        int no = 21;
        int noOfParts = 4;
        List<Integer> list = new ArrayList<>();

        if (no % noOfParts == 0) {
            int n = no / noOfParts;
            for (int i = 1; i <= noOfParts; i++) {
                list.add(n);
            }
        } else {
            int n = no / noOfParts;
            int remainder = no%noOfParts;
            for (int i = 1; i < noOfParts; i++) {
                list.add(n);
            }
            list.add(n+remainder);
        }
        System.out.println(list);
    }
}