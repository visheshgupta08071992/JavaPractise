package DSAPreparation.Grind75.String;

/*
* Leetcode - https://leetcode.com/problems/largest-number/
* Pepcoding - https://www.youtube.com/watch?v=VV_KPrG_PzE
* Explanantion - https://www.youtube.com/watch?v=AKZaaVqjVl4
*
* Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.



Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"
*
*
* */


import org.testng.annotations.Test;

import java.util.Arrays;

public class LargestNo {

    @Test
    public void findLargestNo(){
        int [] nums = {3,30,34,5,9};
      //  int [] nums={111311,1113};
        String [] str = new String[nums.length];

        for(int i=0;i<nums.length;i++){
            str[i]= String.valueOf(nums[i]);
        }

        Arrays.sort(str,(a,b) ->{
            //Since we need sorting in descending
            return (b+a).compareTo(a+b);
        });
        System.out.println(Arrays.toString(str));
        StringBuilder sb = new StringBuilder();
        for(String s:str){
            sb.append(s);
        }
        if(sb.charAt(0) == '0'){
            System.out.println("0");
            return;
        }
        System.out.println(sb.toString());

    }
}
