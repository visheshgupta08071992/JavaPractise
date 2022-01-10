package Stack;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Stack;

//Aditya Verma - https://www.youtube.com/watch?v=T5s96ynzArg&list=PL_z_8CaSLPWdeOezg68SKkeLN4-T_jNHd&index=3

public class NextGreaterElementOnLeft {

    @Test
    //Using Brute Force O(n2)
    public void nextGreaterOnLeft() {
        int[] arr = {12,7,8,6,1,12,3,1,3,3,9,5,2};
        // Expected - -1 12 12 8 6 -1 12 3 12 12 12 9 5
        int[] newArr = new int[arr.length];
        //Expected -> -1 -1 -1 9 3 -1 12 12 8
        for(int i=arr.length-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                if(arr[j] > arr[i]){
                    newArr[i]=arr[j];
                    break;
                }
                if(j==0){
                    newArr[i]=-1;
                }
            }
        }
        newArr[0]=-1;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }

    @Test
    public void nextGreaterOnLeftUsingStack() {
        int[] arr = {12,7,8,6,1,12,3,1,3,3,9,5,2};
        // Expected - -1 12 12 8 6 -1 12 3 12 12 12 9 5
        int[] newArr = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();

        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()){
                newArr[i]=-1;
                st.push(arr[i]);
            }
            else{
                while(st.size()>0  && arr[i]>=st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    newArr[i]=-1;
                    st.push(arr[i]);
                }
                else if(arr[i]<st.peek()){
                    newArr[i]=st.peek();
                    st.push(arr[i]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }
}
