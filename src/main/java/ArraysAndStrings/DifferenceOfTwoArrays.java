package ArraysAndStrings;

/*
* Question - https://nados.io/question/difference-of-two-arrays
*
* Solution - https://www.youtube.com/watch?v=jKyuWD8XKjw
*
*
* */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DifferenceOfTwoArrays {

    @Test
    public void differenceOfTwoArray(){
        int [] arr1 ={9,9,9};
        int [] arr2={3,3,3,3};
//        int [] arr1 ={0,0,1};
//        int [] arr2={1,0,0,0};
        //Expected -> {0,9,9,9}
        int [] result= new int[arr2.length];
        List<Integer> list = new ArrayList<>();
        int i=arr1.length -1;
        int j=arr2.length -1;
        int k=result.length -1;
        int carry=0;
        while(k>=0){
            int d=0;
            int arr1Val= i>=0?arr1[i]:0;
            if(arr2[j] + carry >= arr1Val){
                d=arr2[j] + carry - arr1Val;
            }
            else{
                d=arr2[j] + carry + 10 - arr1Val;
                carry=-1;
            }
            result[k]=d;
            i--;
            j--;
            k--;
        }

        for(int val:result){
            list.add(val);
        }
        System.out.println(list);
    }
}
