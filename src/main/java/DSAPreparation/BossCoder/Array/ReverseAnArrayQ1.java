package DSAPreparation.BossCoder.Array;

import org.testng.annotations.Test;

import java.util.Arrays;

/*
* https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
* https://practice.geeksforgeeks.org/problems/reverse-a-string/1
*
* */

public class ReverseAnArrayQ1 {

    @Test
    public void reverseArray(){

        int [] arr={4,5,1,2};
        //output - 2,1,5,4
        int i=0;
        int j=arr.length -1;
        int temp;
        while(i<j){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void reverseString(){
        String str="Sahil";
        char [] arr = str.toCharArray();
        int i=0;
        int j=arr.length -1;
        char temp;
        while(i<j){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(new String(arr));
    }

}
