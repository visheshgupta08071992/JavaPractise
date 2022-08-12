package DSAPreparation.Grind75.Stack;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
LeetCode -> https://leetcode.com/problems/next-greater-element-i/
* */

public class nextGreaterToRightFromAnotherArr {
    @Test
    public void test(){
        Map<Integer,Integer> map=nextGreaterOnRightUsingStack();
        int[] nums1 = {4,1,2,};
        int [] nextGreaterInNums1=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            nextGreaterInNums1[i] = map.get(nums1[i]);
        }
        System.out.println(Arrays.toString(nextGreaterInNums1));
    }

    public Map<Integer,Integer> nextGreaterOnRightUsingStack() {
        // int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        int[] arr = {1,3,4,2};
        //Expected - 5,9,12,12,12,3,12,-1,6,8,12,12,-1
        int[] newArr = new int[arr.length];
        Stack<Integer> st=new Stack<Integer>();
        Map<Integer,Integer> map =new HashMap<Integer,Integer>();
        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                newArr[i]=-1;
                map.put(arr[i],-1);
                st.push(arr[i]);
            }
            else{
                while( st.size() > 0 && arr[i] >= st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    newArr[i]=-1;
                    map.put(arr[i],-1);
                    st.push(arr[i]);
                }
                else if(st.peek() > arr[i]){
                    newArr[i]=st.peek();
                    map.put(arr[i],st.peek());
                    st.push(arr[i]);
                }
            }
        }
        return map;
    }
}
