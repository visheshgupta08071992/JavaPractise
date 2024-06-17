package JavaConceptOfTheDay;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

/*
* https://www.geeksforgeeks.org/problems/sort-the-string-in-descending-order3542/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
*
* */
public class SortStringInDescendingOrder {

    @Test
    public void sort(){
        String str="alkasingh";
        //output snlkihgaa
        char [] strArr = str.toCharArray();
        Arrays.sort(strArr);
        StringBuilder sb =new StringBuilder(String.valueOf(strArr));
        System.out.println(sb.reverse().toString());

    }

    @Test
    public void approach2(){
        String str="alkasingh";
        char [] strArr = str.toCharArray();
        Arrays.sort(strArr);

        int i=0;
        int j=strArr.length - 1;
        while(i<j){
            char c = strArr[i];
            strArr[i] = strArr[j];
            strArr[j] = c;
            i++;
            j--;
        }

        System.out.printf(String.valueOf(strArr));
    }
}
