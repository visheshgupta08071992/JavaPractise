package DSAPreparation.Grind75.Stack;

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
    public void dailyTemperatureBruteForce() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        Stack<Integer> st = new Stack<>();
        int [] result = new int[temperatures.length];

        for(int i=0;i<temperatures.length - 1;i++){
            for(int j=i+1;j<temperatures.length;j++){
                if(temperatures[j] > temperatures[i]){
                    result[i] = j-i;
                    break;
                }
                if(j==temperatures.length - 1){
                    result[i] = 0;
                }
            }
        }
        result[temperatures.length - 1] = 0;

        System.out.println(Arrays.toString(result));

    }

    @Test
    public void dailyTemperature(){
        int [] temperatures={73,74,75,71,69,72,76,73};
        Stack<Integer> st = new Stack<>();
        int [] result = new int[temperatures.length];

        for(int i=temperatures.length - 1;i>=0;i--){
            if(st.isEmpty()){
                result[i] =0;
                st.push(i);
            }
            else{
                while(!st.isEmpty() && temperatures[i] >=temperatures[st.peek()]){
                    st.pop();
                }
                if(st.isEmpty()){
                    result[i] =0;
                    st.push(i);
                }
                else{
                    result[i] = st.peek() - i ;
                    st.push(i);

                }

            }
        }
        System.out.println(Arrays.toString(temperatures));
        System.out.println(Arrays.toString(result));
    }
}
