package DSAPreparation.Grind75.Stack;

/*
* Leetcode - https://leetcode.com/problems/next-greater-element-ii/
* Explanation -  https://www.youtube.com/watch?v=RkG94TvnUFs
*
*
* Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.

The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.



Example 1:

Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2;
The number 2 can't find next greater number.
The second 1's next greater number needs to search circularly, which is also 2.
Example 2:

Input: nums = [1,2,3,4,3]
Output: [2,3,4,-1,4]
*
*
* */

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {

    @Test
    public void findNextGreater(){

        int [] nums={1,2,3,4,3};
        //int [] nums={5,4,3,2,1};
        //Created result array for storing result
        int [] result = new int[nums.length];

        //Created Stack for maintaining greater elements
        Stack<Integer> st = new Stack<>();

        //Initialize stack for the last element
        for(int i=nums.length - 2;i>=0;i--){
            if(st.isEmpty()){
                st.push(nums[i]);
            }
            else{
                while(!st.isEmpty() && nums[i] >= st.peek()){
                    st.pop();
                }
                st.push(nums[i]);
            }
        }

        // Once the stack is initialized find the next greater element
        for(int i=nums.length - 1;i>=0;i--){
            if(st.isEmpty()){
                st.push(nums[i]);
                result[i] = -1;
            }
            else{
                while(!st.isEmpty() && nums[i] >= st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    st.push(nums[i]);
                    result[i] = -1;
                }
                else if(st.peek() > nums[i]){
                    result[i] = st.peek();
                    st.push(nums[i]);
                }
            }

        }
        System.out.println(Arrays.toString(result));
    }
}
