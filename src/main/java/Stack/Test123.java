package Stack;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Stack;

public class Test123 {

    @Test
    //Using Brute Force O(n2)
    public void nextGreaterOnRight() {
        int[] arr = {2, 5, 9, 3, 3, 1, 3, 12, 1, 6, 8, 7, 12};
        Stack<Integer> st = new Stack<>();
        int [] result = new int[arr.length];
        result[arr.length-1] = -1;
        st.push(arr[arr.length-1]);

        for(int i=arr.length-2;i>=0;i--){
            if(!st.isEmpty() && st.peek() > arr[i]){
                result[i] = st.peek();
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()<=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    result[i]=-1;
                    st.push(arr[i]);
                }
                else if(st.peek() > arr[i]){
                    result[i] = st.peek();
                    st.push(arr[i]);
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void nextGreateronLeft(){

    }
    int[] arr = {12,7,8,6,1,12,3,1,3,3,9,5,2};
}
