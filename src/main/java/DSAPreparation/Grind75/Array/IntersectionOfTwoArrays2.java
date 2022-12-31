package DSAPreparation.Grind75.Array;

/*Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays
and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.*/


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays2 {

    @Test
    public void test(){
        int [] nums1 ={1,2,2,1};
        int [] nums2={2,2};

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i: nums1){
           if(map.containsKey(i)){
               map.put(i,map.get(i) + 1);
           }
           else{
               map.put(i,1);
           }
        }
        for(int i: nums2){
            if(map.containsKey(i)){
               if(map.get(i) > 0){
                   list.add(i);
                   map.put(i,map.get(i) - 1);
               }
            }
        }
        System.out.println(list);
    }
}
