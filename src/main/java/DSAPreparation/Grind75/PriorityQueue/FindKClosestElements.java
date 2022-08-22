package DSAPreparation.Grind75.PriorityQueue;

/*
* Leetcode - https://leetcode.com/problems/find-k-closest-elements/
*
* Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

|a - x| < |b - x|, or
|a - x| == |b - x| and a < b


Example 1:

Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]
Example 2:

Input: arr = [1,2,3,4,5], k = 4, x = -1
Output: [1,2,3,4]
*
*
*
*
* */


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKClosestElements {

    @Test
    public void findKClosest(){
        int [] arr = {1,2,3,4,5};
        List<Integer> arr1= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int k=4;
        int x=3;

    }
}


