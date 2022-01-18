package ArraysAndStrings;


import org.testng.annotations.Test;

import java.math.BigInteger;

/*
* 1. Given a positive number 'n' in form of String.
2. Find the smallest number which has exactly the same digits existing in the number 'n' and is greater in value than 'n'.
3. If no such positive number exists, return -1 as string.
*
* Pepcoding -> https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/arrays-and-strings/next-greater-element-iii/ojquestion
* LeetCode -> https://leetcode.com/problems/next-greater-element-iii/
*
*
* */
public class NextGreaterElement3 {

    @Test
    public void nextGreater(){
        String number="42963";
        // Expected -> 43269

        char [] noArray=number.toCharArray();
        int i=noArray.length - 2;
        while(i>=0 && noArray[i] >= noArray[i+1]){
            i--;
        }
        if(i<0){
            System.out.println("Greater Element cannot be made");
            return;
        }
        int k=noArray.length - 1;
        while(noArray[i] >= noArray[k]){
            k--;
        }
        char temp =noArray[i];
        noArray[i]=noArray[k];
        noArray[k]=temp;

        String result="";
        for(int j=0;j<=i;j++){
            result=result + noArray[j];
        }
        for(int j=noArray.length-1;j>i;j--){
            result = result + noArray[j];
        }
        System.out.println(number);
        System.out.println(result);

    }

    @Test
    public void test(){
       // String s="21474";
        String s="2147483648";
        BigInteger no = BigInteger.valueOf(Long.parseLong(s));


        System.out.println(s);
       System.out.println(no);
    }
}
