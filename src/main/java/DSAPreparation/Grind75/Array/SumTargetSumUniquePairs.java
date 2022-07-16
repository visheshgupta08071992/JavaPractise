package DSAPreparation.Grind75.Array;

//https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/arrays-and-strings/2-sum-target-sum-unique-pairs/ojquestion

/*
*
* Given an array of integer which consist some duplicate elements and a target. Print
 all the pairs forming the target. If the pair is printed then it should not be printed again
* Given Array 10 10 30 40 50 20   and Target 60
* Then the pair returned should be 10 50 and 20 40
*
* */
import org.testng.annotations.Test;

import java.util.*;

public class SumTargetSumUniquePairs {

    @Test
    //Tried with Hashmap, But the given program does not work as it repeats the pair
    public void returnUniquePair(){
        int [] arr={2,2,4,3,1,6,6,7,5,9,1,8,9};
        int target=10;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){

                map.put(arr[i], arr[i]);

        }

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target -arr[i])){
                System.out.println(arr[i] + " " + map.get(target -arr[i]));
            }
        }
    }

    @Test
    public void perfectApproach(){
        int [] arr={2,2,4,3,1,6,6,7,5,9,1,8,9};
        int target=10;
        int i=0;
        int j=arr.length -1;
        Arrays.sort(arr);
        while(i < j){

            if(i!=0 && arr[i] == arr[i-1]){
                i++;
                //continue does not execute the next line of code after it and moves to next
                //interation of while loop
                continue;
            }
            if(arr[i] + arr[j] == target){
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            }
            else if(arr[i] + arr[j] > target){
                j--;
            }
            else if(arr[i] + arr[j] < target){
                i++;
            }
        }
    }


}
