package DSAPreparation.Grind75.PriorityQueue;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

/*
*https://leetcode.com/problems/top-k-frequent-elements/submissions/
* Pepcoding -> https://www.youtube.com/watch?v=HkPDkRpScSs
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

//        int [] nums={4,2,4,1,1,5,4,3,1};
//        int k=3;

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
//        for(int i=1,j=0;i<=k;i++,j++){
//            for(Map.Entry<Integer,Integer> map1 : mapSortedWithKey.entrySet() ){
//                result[j] = map1.getKey();
//                //Removing the value as it is added in result
//                mapSortedWithKey.remove(map1.getKey());
//                //Breaking to get next value
//                break;
//            }
//        }
        int count=1;
        int j=0;
        for(int key:mapSortedWithKey.keySet()){
            if(count<=k){
                result[j]=key;
            }
            count++;
            j++;
        }
        System.out.println(Arrays.toString(result));
    }


    @Test
    public void findTopKFrequentElementUsingPriorityQueue() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
//        int [] nums={4,2,4,1,1,5,4,3,1};
//        int k=3;

        Map<Integer, Integer> map = new HashMap<>();

        int[] result = new int[k];

        //Stores the frequency of elemnet in HashMap

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        //Create a Priority Queue giving priority to minimum frequency element

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int i : map.keySet()) {
            pq.add(i);
            if (pq.size() > k) {
                pq.remove();
            }
        }
        int j = 0;
        while (!pq.isEmpty()) {
            result[j] = pq.poll();
            j++;
        }


        System.out.println(Arrays.toString(result));

    }
      @Test
      public void testUsingCompareTo(){
          Map<Integer,Integer> map = new HashMap<>();
          int[] nums = {1, 1, 1, 2, 2, 3};
          int k = 2;

          //For Storing result
          int [] result = new int[k];

          //Created Hashmap for storing frequency
          for(int i : nums){
              if(map.containsKey(i)){
                  map.put(i,map.get(i) + 1);
              }
              else{
                  map.put(i,1);
              }
          }

          // Creating Priority Queue ensuring that element with minimum frequency is removed

          PriorityQueue<Integer> pq =  new PriorityQueue<>((a,b) -> map.get(a).compareTo(map.get(b)));

          for(int key:map.keySet()){
              pq.add(key);
              if(pq.size() > k){
                  pq.remove();
              }
          }
          int j=0;
          while(!pq.isEmpty()){
              result[j] = pq.poll();
              j++;
          }
          System.out.println(Arrays.toString(result));;
      }
    }
