package DSAPreparation.Grind75.SlidingWindow;
/*
* Leetcode - https://leetcode.com/problems/sliding-window-maximum/
* Explanation - https://www.youtube.com/watch?v=tCVOQX3lWeI
*
* You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.



Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation:
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Example 2:

Input: nums = [1], k = 1
Output: [1]
*
*
*
*
* */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SlidingWindowMaximum {

    @Test
    public void bruteForce(){
        int [] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        List<Integer> list = new ArrayList<>();
        int [] result = new int[nums.length - k + 1];
        int max;

        for(int i=0;i<=nums.length - k;i++){
            max=Integer.MIN_VALUE;
            for(int j=i,count=1;count<=k;j++,count++){
                if(nums[j] > max){
                    max = nums[j];
                }
            }
            list.add(max);
        }
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void bestSolution() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int [] nextGreater = new int[nums.length];
        int k = 3;
        Stack<Integer> st = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(nums[i]);
                nextGreater[i]=-1;
            }
            else{
                while(!st.isEmpty() && nums[i] > st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    st.push(nums[i]);
                    nextGreater[i]=-1;
                }
                else{
                    nextGreater[i]=st.peek();
                    st.push(nums[i]);
                }
            }
        }
        System.out.println(Arrays.toString(nextGreater));

    }
}
