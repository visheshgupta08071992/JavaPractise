package DSAPreparation.Grind75.Array;

/*
*1. Given an integer array of size 'n'.
2. Return an array answer such that answer[i] is equal to the product of all the elements of arr except arr[i].
3. The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer
*
* Peepcoding - https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/arrays-and-strings/product-of-array-except-itself/ojquestion
* Leetcode - https://leetcode.com/problems/product-of-array-except-self/
* */

import org.testng.annotations.Test;

import java.util.Arrays;

public class ProductOfArrayExceptItself {

    @Test
    public void bestSolution(){
        int [] nums={2,3,1,5,2,4};
        int [] right= new int[nums.length];
        int [] result= new int[nums.length];

        //Create right product
        int product=1;
        for(int i=nums.length -1;i>=0;i--){
            product= product * nums[i];
            right[i]=product;
        }

        //Find the product of array except itself
        int leftProduct=1;
        for(int i=0;i<nums.length -1;i++){
            result[i]= right[i+1] * leftProduct;
            leftProduct=leftProduct * nums[i];
        }
        result[nums.length -1]=leftProduct;
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void findProductOfArrayExceptUsingDivision() {
        // This code would not work if there zero in the array
        int[] arr = {1, 2, 3, 4};
        int[] result = new int[arr.length];
        int product=1;

        for(int i=0;i<arr.length;i++){
            product=product * arr[i];
        }

        for(int i=0;i<arr.length;i++){
            result[i]=product / arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
