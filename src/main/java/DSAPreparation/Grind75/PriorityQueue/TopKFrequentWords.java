package DSAPreparation.Grind75.PriorityQueue;

import org.testng.annotations.Test;

import java.util.*;

/*
* Leetcode - https://leetcode.com/problems/top-k-frequent-words/
*
*
*Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.



Example 1:

Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
Explanation: "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.
Example 2:

Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
Output: ["the","is","sunny","day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.
*
*
* */

public class TopKFrequentWords {
    //Note - Comparater mai jispr bhi operation krana hai wo pehle rehta for exmaple queue mai remove operation krana rehta toh jispre remove
// krana ho wo pehle rahega and display in list mai jise dikhana hai wo comparater mail pehle rahega
    @Test
    public void findTopKFrequentWords(){
        String [] words={"i","love","leetcode","i","love","coding"};
        int k=2;
//        String [] words={"the","day","is","sunny","the","the","the","sunny","is","is"};
//        int k=4;

        Map<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        //Create map to maintain the frequency of word
        for(String s : words){
            if(map.containsKey(s)){
                map.put(s,map.get(s) + 1);
            }
            else{
                map.put(s,1);
            }
        }
        // Create Priority Queue based on frequency count and lexographic order
        PriorityQueue<String> pq = new PriorityQueue<>((a,b) ->
        {
            // If frequency is same then remove the string which is fretaed in lexogrphic order
            if(map.get(a) == map.get(b)){
               return b.compareTo(a);
            }
            // String which has less frequency should be reoved first
           return map.get(a) - map.get(b);

        });

        for(String s : map.keySet()){
            pq.add(s);
            if(pq.size() > k){
                pq.remove();
            }
        }
        while(!pq.isEmpty()){
            list.add(pq.poll());
        }
        System.out.println(list);
        Collections.sort(list,(a,b) -> {
            if(map.get(a) == map.get(b)) {
                // If frequency is same then first displaye string which is lexographically smaller
                return a.compareTo(b);
            }

            //Else display string which has more frequency first
            return map.get(b) - map.get(a);

        });
        System.out.println(list);
    }
}
