package ArraysAndStrings;

import org.testng.annotations.Test;

import java.util.Arrays;

/*
*
* Peepcoding -https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/inverse_of_an_array/topic
*
* Inverse means jo index hai array for new array mai value banjayega and
*  jo value hai wo index ban jayega new array m
*
* Example input array {3 2 4 1 0}
* Expected [4, 3, 1, 0, 2]
* */
public class InverseAnArray {


    @Test
    public void inverseArray(){
        int [] a ={3,2,4,1,0};
        int [] result = new int[a.length];
        for(int i=0;i<a.length;i++){
            result[a[i]]=i;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(result));
    }
    }



