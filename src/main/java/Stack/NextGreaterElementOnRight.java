package Stack;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Stack;
import java.util.logging.Logger;

public class NextGreaterElementOnRight {

    @Test
    //Using Brute Force O(n2)
    public void nextGreaterOnRight(){
       int [] arr={2,5,9,3,1,12,6,8,7};
        int [] newArr= new int[arr.length];
        //Expected -> 5 9 12 12 12 -1 8 -1 -1
        if (arr.length==0){
            System.out.println("Empty Array");
            return;
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[i]) {
                        newArr[i] = arr[j];
                        break;
                    }
                    if (j == arr.length - 1) {
                        newArr[i] = -1;
                    }
                }
            }
        }
        newArr[arr.length-1]=-1;
        System.out.println(Arrays.toString(newArr));
    }

    @Test
    //Using Stack O(n)
    public void nextGreaterOnRightUsingStack() {
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        int[] newArr = new int[arr.length];
        Stack<Integer> st=new Stack<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                newArr[i]=-1;
                st.push(arr[i]);
            }
            else{
                while( st.size() > 0 && arr[i] > st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    newArr[i]=-1;
                    st.push(arr[i]);
                }
                else if(st.peek() > arr[i]){
                    newArr[i]=st.peek();
                    st.push(arr[i]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }

}
