package DSAPreparation.Grind75.SlidingWindow;

/*
* https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345
*
* Given an array A[] of size N and a positive integer K, find the first negative integer for each and every window(contiguous subarray) of size K.



Example 1:

Input :
N = 5
A[] = {-8, 2, 3, -6, 10}
K = 2
Output :
-8 0 -6 -6
Explanation :
First negative integer for each window of size k
{-8, 2} = -8
{2, 3} = 0 (does not contain a negative integer)
{3, -6} = -6
{-6, 10} = -6
*
* */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List1stNegativeNumberInEveryWindowOfSizeK {

    @Test
    public void bruteForce(){
        int [] arr = {-8,2,3,-6,10};
        int k=2;
        int [] result=new int[arr.length-k+1];

        for(int i=0;i<=arr.length-k;i++){
            for(int j=i,count=1;count<=k;count++,j++){
                if(arr[j]<0){
                    result[i]=arr[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void BestApproach(){
        int [] arr = {-8,2,3,-6,10};
        int k=2;
        int [] result=new int[arr.length-k+1];
        int count=0;
        int i=0;
        List<Integer> list = new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j] < 0){
                list.add(arr[j]);
            }
            if(j-i+1==k){
                if(list.isEmpty()){
                    result[count]=0;
                    count++;
                    i++;
                }
                else{
                    result[count]=list.get(0);
                    if(list.get(0)==arr[i]){
                        list.remove(0);
                    }
                    count++;
                    i++;
                }
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
