package DSAPreparation.Grind75.Array;

/*Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

*/

import org.testng.annotations.Test;

import java.util.*;

public class IntersectionOfTwoArrays1 {

    @Test
    public void approach1(){
        int [] nums1 = {1,2,2,1};
        int [] nums2={2,2};

        /*
        * Since output should contain unique values, Output should be 2
        *
        * If the problem would not have condition that output should contain unique value then
        * below solution would not have worked and the expected output would be [2,2]
        *
        * */

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i:nums1){
            set1.add(i);
        }

        for(int i:nums2){
            set2.add(i);
        }

        set1.retainAll(set2);

        System.out.println(set1);
    }

    @Test
    public void approach2() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        /*
         * Since output should contain unique values, Output should be 2
         *
         * If the problem would not have condition that output should contain unique value then
         * below solution would not have worked and the expected output would be [2,2]
         *
         * */

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection= new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }

        for(int i:nums2){
            if(!set1.add(i)){
                intersection.add(i);
            }
        }
        System.out.println(intersection);
    }

    @Test
    public void approach3() {

        /*
         * Since output should contain unique values, Output should be 2
         *
         * If the problem would not have condition that output should contain unique value then
         * below solution would not have worked and the expected output would be [2,2]
         *
         * */

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set1 = new HashSet<>();

        for(int i : nums1){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }
            else{
                map.put(i,1);
            }
        }

        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                set1.add(nums2[i]);
            }
        }
        System.out.println(set1);
    }

}
