package ArraysAndStrings;

/*
*1. Given an integer array of size 'n'.
2. Return an array answer such that answer[i] is equal to the product of all the elements of arr except arr[i].
3. The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer
*
* Peepcoding - https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/arrays-and-strings/product-of-array-except-itself/ojquestion
* Leetcode - https://leetcode.com/problems/product-of-array-except-self/
* */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptItself {

    @Test
    public void bestSolution(){
        int [] arr={1,2,3,4};
        int [] result=new int[arr.length];
        int [] rightArray=new int[arr.length];

        //Create Right Array
        int rightProduct=1;
        for(int i=arr.length-1;i>=0;i--){
            rightProduct=rightProduct * arr[i];
            rightArray[i]=rightProduct;
        }

        // Create result
        int leftProduct=1;
        for(int i=0;i<arr.length-1;i++){
            result[i] =leftProduct * rightArray[i+1];
            leftProduct=leftProduct * arr[i];
        }
        result[arr.length - 1] = leftProduct;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void findProductOfArrayExceptItself(){
        // This code would not work if there zero in the array
        int [] arr={1,2,3,4};
        int [] result=new int[arr.length];
        for(int i=0;i<arr.length;i++){
                    result[i]=1;
                    for(int j=0;j<arr.length;j++){
                        result[i]=result[i] * arr[j];
                    }

                    result[i] = result[i] / arr[i];


                }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
        }
    }

