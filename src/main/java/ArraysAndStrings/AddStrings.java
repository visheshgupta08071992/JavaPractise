package ArraysAndStrings;


import org.testng.annotations.Test;

import java.util.Arrays;

/*
* Question - https://nados.io/question/add-strings
*
* Solution - https://www.youtube.com/watch?v=6KWwfw43fOg&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=28
*
* LeetCode - https://leetcode.com/problems/add-strings/submissions/
* */
public class AddStrings {

    @Test
    public void addString(){
        String s1="456";
        String s2="77";
        String result="";
        //Expected String 1110


        int [] s3Arr= new int[s1.length() > s2.length() ? s1.length():s2.length()];
        int i=s1.length() -1;
        int j=s2.length() -1;
        int k=s3Arr.length-1;
        int carry=0;
        while (k>=0){
            int d=carry;

            if(i>=0){
                d= d + (s1.charAt(i) - '0');
            }

            if(j>=0){
                d= d + (s2.charAt(j) - '0');
            }
            carry=d/10;
            s3Arr[k]=d%10;
            i--;
            j--;
            k--;
        }
        for(int val:s3Arr){
            result= result + val;
        }
        if(carry > 0){
            result=carry + result;
        }

        System.out.println(result);
    }
}
