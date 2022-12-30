package ArraysAndStrings;

/*
* Question - https://leetcode.com/problems/add-to-array-form-of-integer/
*
*
* */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArrayFormOfInteger {

    @Test
    public void addToArrayFormOfInteger(){
        int [] num={2,1,5};
        int k=806;
        // Expected [1,0,2,1]
        String strNum= Integer.toString(k);
        int [] result = new int[num.length > strNum.length() ? num.length:strNum.length()];
        List<Integer> sum = new ArrayList<>();
        int carry=0;
        int i=num.length-1;
        int j=strNum.length() - 1;
        int m=result.length -1;
        while(m>=0){
            int d=carry;
            if(i>=0){
                d= d + num[i];
            }
            if(j>=0){
                d = d + (strNum.charAt(j) - '0');
            }
            carry=d/10;
            result[m]=d%10;
            i--;
            j--;
            m--;
        }
        if(carry > 0){
            sum.add(carry);
        }
        for(int val : result){
            sum.add(val);
        }
        System.out.println(sum);
    }

    @Test
    public void addArrayBestSolution(){
        int [] num={2,1,5};
        int k=806;
        String num2= String.valueOf(k);
        int [] result = new int[num.length > num2.length() ? num.length:num2.length()];
        int carry=0;

        int i=num.length - 1;
        int j=num2.length() - 1;
        int m=result.length - 1;
        List<Integer> list = new ArrayList<>();

        while(m>=0){
            int val1 = i>=0 ? num[i]:0;
            int val2 = j>=0 ? num2.charAt(i) - '0':0;
            i--;
            j--;
            int sum = val1 + val2 + carry;
            result[m]=sum%10;
            m--;
            carry=sum/10;
        }

        if(carry > 0){
            list.add(carry);
        }
        for(int val : result){
            list.add(val);
        }
        System.out.println(list);
    }
}
