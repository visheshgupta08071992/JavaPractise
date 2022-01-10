package Stack;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Stack;

/*
* https://leetcode.com/problems/daily-temperatures/
*
*Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.


Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]
* */
public class DailyTemperatures {

    @Test
    public void dailyTemperature(){
        int [] temperatures={73,74,75,71,69,72,76,73};
        Stack<Integer> st = new Stack<Integer>();
        int [] answer=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            if(st.isEmpty()){
                answer[i]=0;
                st.push(i);
            }
            else{
                while(st.size() > 0 && temperatures[i] >= temperatures[st.peek()])
                    st.pop();
            }
            if(st.isEmpty()){
                answer[i]=0;
                st.push(i);
            }
            if(temperatures[st.peek()] > temperatures[i]){
                answer[i]=st.peek() -i;
                st.push(i);
            }
        }
        System.out.println(Arrays.toString(temperatures));
        System.out.println(Arrays.toString(answer));
    }
}
