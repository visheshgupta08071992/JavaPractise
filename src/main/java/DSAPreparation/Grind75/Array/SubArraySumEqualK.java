package DSAPreparation.Grind75.Array;

/*
* Leetcode - https://leetcode.com/problems/subarray-sum-equals-k/description/
*
*Explanation - https://www.youtube.com/watch?v=20v8zSo2v18
*
*
*
*
*
*
*/

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualK {

    @Test
    public void SubArraySum(){
        int [] nums = {-1,-1,1};
        int k=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            if(map.containsKey(sum - k)){
                count = count + map.get(sum - k);
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum) + 1);
            }
            else{
                map.put(sum,1);
            }

        }
        System.out.println(count);
    }
}
