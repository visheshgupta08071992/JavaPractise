package DSAPreparation.Grind75.Array;

/*

Moores vooting Algorithmn
* Peepcoding -> https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/arrays-and-strings/majority-element-i/ojquestion
*
*LeetCode -> https://leetcode.com/problems/majority-element/
*
* Anuj Bhaiya -> https://www.youtube.com/watch?v=X0G5jEcvroo
*1. Give an array of size 'n'.
2. Find Majority element and print it(if exist), otherwise print "No Majority Element exist".
3. Majority element-> if frequency of an element is more than n/2, then that element is majority element.
3. Note : solve the problem in linear time and in O(1) space.
*
* Array = [2,2,1,1,1,2,2]
Array = [1, 1, 5, 5, 3, 6]
*
* */

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement1 {

    @Test
    public void findMajorityBestSolution(){
        int [] nums={2,2,1,1,1,2,2};
        int index=majorityElementIndex(nums);
        int probablemajorityElement=nums[index];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == probablemajorityElement){
                count++;
            }
        }
        if(count > nums.length/2){
            System.out.println("Majority element is : " + probablemajorityElement);
            return;
        }
        System.out.println("No Majority element found ");
    }
    public int majorityElementIndex(int [] nums){

        int ansIndex=0;
        int count=1;

        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[ansIndex]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                ansIndex=i;
                count=1;
            }
        }
        return ansIndex;
    }



    @Test
    public void findMajority(){
        /*Using HashMap the time complexity is o(n) and the space complexity would be
         * o(n) if all the elements are uniques*/
        int [] arr={2,2,1,1,1,2,2};
        Map<Integer,Integer> map = new HashMap<>();
        int majorityCheckCount= (arr.length)/2;
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }
            else{
                map.put(i,1);
            }
        }
        for(int occurance : map.keySet()){
            if(map.get(occurance) > majorityCheckCount){
                System.out.println("Majority element is : " + occurance);
                return;
            }
        }
        System.out.println("No Majority found");
    }
}
