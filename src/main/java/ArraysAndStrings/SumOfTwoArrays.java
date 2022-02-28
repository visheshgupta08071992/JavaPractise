package ArraysAndStrings;

import org.testng.annotations.Test;

/*
* Question - https://nados.io/question/sum-of-two-arrays
* Solution - https://www.youtube.com/watch?v=BzJK1zNXwcU
*
* Given two arrays as nos, Return third array as sum of Nos
*
* */
public class SumOfTwoArrays {

    @Test
    public void sumOfArrays(){
        int [] arr1={1,2,4};
        int [] arr2={9,0,9};
        //Expected 1033
        int length=0;
        if(arr1.length > arr2.length){
            length=arr1.length;
        }
        else{
            length=arr2.length;
        }
        int [] result=new int[length];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=result.length-1;
        int carry=0;

        while(k>=0){
            int d=carry;

            if(i>=0){
                d=d+arr1[i];
            }
            if(j>=0){
                d=d+ arr2[j];
            }
            carry=d/10;
            result[k]=d%10;
            i--;
            j--;
            k--;
        }
        if(carry!=0){
            System.out.println(carry);
        }
        for(int val:result){
            System.out.println(val);
        }
    }
}
