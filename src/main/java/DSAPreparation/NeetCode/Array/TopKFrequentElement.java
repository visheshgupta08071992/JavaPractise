package DSAPreparation.NeetCode.Array;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
*https://leetcode.com/problems/top-k-frequent-elements/submissions/
*
*
*
*
* Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.



Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
*
* */

public class TopKFrequentElement {

    @Test
    public void topKFrequentElementBySortingHashMapWithValues(){
        Map<Integer,Integer> map =new HashMap<>();
        int [] nums={1,1,1,2,2,3};
        int k=2;

        int [] result=new int[k];

        //Stores the frequency of elemnet in HashMap
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        //Sort the Map based on Values in descending order using Java 8

        Map<Integer,Integer> mapSortedWithKey=map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(mapSortedWithKey);

        //Iterate for Top K element
        for(int i=1,j=0;i<=k;i++,j++){
            for(Map.Entry<Integer,Integer> map1 : mapSortedWithKey.entrySet() ){
                result[j] = map1.getKey();
                //Removing the value as it is added in result
                mapSortedWithKey.remove(map1.getKey());
                //Breaking to get next value
                break;
            }
        }
        System.out.println(Arrays.toString(result));;
    }
    }
