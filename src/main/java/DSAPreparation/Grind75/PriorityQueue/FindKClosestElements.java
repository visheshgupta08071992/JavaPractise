package DSAPreparation.Grind75.PriorityQueue;

/*
* Leetcode - https://leetcode.com/problems/find-k-closest-elements/
* Youtube - https://www.youtube.com/watch?v=1otAwCQG7XM
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

import java.util.*;

public class FindKClosestElements {
/*
* In this question Hashmap would not work as agar duplicate elements rahe toh HashMap correct answer nhi
* dega, Hence hume ek class khud se banana padega
*
*
* */
    @Test
    public void findKClosest(){
        /*int [] arr = {1,2,3,4,5};
        int k=4;
        int x=3;*/

         int [] arr={0,1,1,1,2,3,6,7,8,9};
         int k=9;
         int x=4;


        List<Integer> list = new ArrayList<>();


        //Create a PriorityQueue such that element with more gap is removed and if gap for two elements
        //is same then larger element should be removed

        PriorityQueue<pair> pq = new PriorityQueue<>((a,b) ->{
            if(a.gap == b.gap){
                return b.val - a.val;
            }
            else{
                return b.gap - a.gap;
            }
        });

        for(int i=0;i<arr.length;i++){
            pq.add(new pair(arr[i],Math.abs(x-arr[i])));
            if(pq.size() > k){
                pq.remove();
            }
        }
        while(!pq.isEmpty()){
            list.add(pq.poll().val);
        }
        Collections.sort(list);
        System.out.println(list);
    }

    public static class pair {
        int val;
        int gap;

        public pair(){

        }

        public pair(int val, int gap) {
            this.val = val;
            this.gap = gap;
        }
    }
}


