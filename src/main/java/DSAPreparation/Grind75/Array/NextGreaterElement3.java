package DSAPreparation.Grind75.Array;

/*
* Leetcode - https://leetcode.com/problems/next-greater-element-iii/
* Explanation - https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/arrays-and-strings/next-greater-element-iii/ojquestion
*
*Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive integer exists, return -1.

Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit in 32-bit integer, return -1.

Example 1:

Input: n = 12
Output: 21
Example 2:

Input: n = 21
Output: -1

*
*
*
*
* */

import org.testng.annotations.Test;

public class NextGreaterElement3 {

    @Test
    public void nextGreater(){
        int n=452651;
        char [] no = String.valueOf(n).toCharArray();
        //int i = no.length() -1;

        String s="";

        int i=no.length -2;
        //Verify whether the nos are in increasing order
        while(i>=0 && no[i]>=no[i+1]){
            i--;
        }
        //All the no's are increasing order so no new greater no can be formed
        if(i<0){
            System.out.println("-1");
            return;
        }
        int k=no.length -1;

        // Check at what index the ith element is smaller then the k element
        while(no[i] >= no[k]){
            k--;
        }
        //Once the index is found swap the element
        char temp = no[i];
        no[i]=no[k];
        no[k]=temp;

        //Form the result String

        for(int j=0;j<=i;j++){
            s= s+ no[j];
        }
        for(int m=no.length-1;m>i;m--){
            s= s+ no[m];
        }

        System.out.println(s);

    }
}
