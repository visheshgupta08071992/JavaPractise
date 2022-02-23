package ArraysAndStrings;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* Question - https://nados.io/question/partition-labels
* Answer -  https://www.youtube.com/watch?v=_I9di3CUOx4&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=10
* Leetcode - https://leetcode.com/problems/partition-labels/submissions/
*
* */
public class PartitionLabels {

    @Test
    public void partitionLabels(){
        String s = "ababcbacadefegdehijhklij";
        //Expected [9,7,8]

        Map<Character,Integer> map = new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }

        int prev=-1;
        int max=0;
        for(int i=0;i<s.length();i++){
            max=Math.max(map.get(s.charAt(i)),max);
            if(max==i){
                int length=max - prev;
                list.add(length);
                prev=i;
            }
        }
        System.out.println(list);
    }
}
