package DSAPreparation.Grind75.PriorityQueue;

/*
* Leetcode - https://leetcode.com/problems/kth-largest-element-in-an-array/
* Pepcoding - https://www.pepcoding.com/resources/online-java-foundation/hashmap-and-heap/k-largest-elements-official/ojquestion
*
*Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

You must solve it in O(n) time complexity.



Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
*
* */

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

    @Test
    public void findKthLargestElement(){
        int [] nums={3,2,3,1,2,4,5,5,6};
        int k=4;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : nums){
            pq.add(i);
        }

        for(int i=1;i<k;i++){
            pq.remove();
        }

        System.out.println(pq.peek());
    }

    @Test
    public void findKthLargestElementUsingSort(){
        int [] nums={3,2,3,1,2,4,5,5,6};
        int k=2;
        Integer [] nums1 = new Integer[nums.length];

        for(int i=0;i<nums.length;i++){
            nums1[i]=nums[i];
        }

        //We cannot sort array of type int in reverseOrder, Hence first converting to Array of Type Integer
        Arrays.sort(nums1, Collections.reverseOrder());

        System.out.println(nums1[k-1]);
    }

    }



