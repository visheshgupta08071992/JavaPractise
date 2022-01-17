package ArraysAndStrings;

/*
* 1. Given an integer array of size 'n'.
2. Find all elements that appear more than n / 3 times and return it in an arraylist.
3. Note : solve the problem in linear time and in O(1) space.
*
*Pepcoding -> https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/arrays-and-strings/majority-elements-ii/ojquestion
*LeetCode -> https://leetcode.com/problems/majority-element-ii/
* */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {

    @Test
    public void findMajorityBestApproach(){
        int [] arr={2,1,3,4,1,5,6,1};
        int value1=arr[0];
        int count1=1;
        int value2=arr[0];
        int count2=0;
        List<Integer> output=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == value1){
                count1++;
            }
            else if(arr[i] == value2){
                count2++;
            }
            else{
                if(count1==0){
                    value1=arr[i];
                    count1=1;
                }
                else if(count2==0){
                    value2=arr[i];
                    count2=1;
                }
                else{
                    count1--;
                    count2--;
                }
            }
        }
        System.out.println(value1);
        System.out.println(value2);
       if(checkOccuranceMoreThanNBy3(arr,value1)){
           output.add(value1);
       }
        if(value1!=value2 && checkOccuranceMoreThanNBy3(arr,value2)){
            output.add(value2);
        }
        System.out.println(output);
    }

    public Boolean checkOccuranceMoreThanNBy3(int [] arr,int n){
        int count=0;
        int maxOccurance=(arr.length)/3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }
        }
        if(count > maxOccurance){
            return true;
        }
        else {
            return false;
        }
    }

    @Test
    public void findMajority(){
        /*Using HashMap the time complexity is o(n) and the space complexity would be
         * o(n) if all the elements are uniques*/
        int [] arr={2,2,1,1,1,2,2};
        Map<Integer,Integer> map = new HashMap<>();
        int majorityCheckCount= (arr.length)/3;
        List<Integer> output = new ArrayList<>();
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
                output.add(occurance);
            }
        }
        System.out.println(output);
    }
}
