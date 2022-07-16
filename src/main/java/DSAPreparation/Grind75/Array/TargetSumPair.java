package DSAPreparation.Grind75.Array;

/*https://www.youtube.com/watch?v=4t9jv9AkVdE
*
*Given an array of integer consisting of all the unique elements and a target. Print
* all the pairs forminf the target. If the pair is printed then it should not be printed again
* example - {7,15,3,18,6,4,19,2,12,8,9};
* Target -15
* if {7,8} is printed then {8,7} should not be printed
*
*
*
* */

import org.testng.annotations.Test;

import java.util.Arrays;

public class TargetSumPair {
 //Complexity of this code is nlogn , considering sorting nlogn and then while loop has n complexity

    @Test
    public void returnTargetSumPair(){
        int [] arr={7,15,3,18,6,4,19,2,12,8,9};
        int target=15;
        // Sort the Array
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i=0;
        int j=arr.length - 1;
        while(i < j){
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
