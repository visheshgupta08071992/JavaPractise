package DSAPreparation.Grind75.Stack;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Stack;

/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to "next greater element on the right" for all elements of array
4. Input and output is handled for you.

"Next greater element on the right" of an element x is defined as the first element to right of x having value greater than x.
Note -> If an element does not have any element on it's right side greater than it, consider -1 as it's "next greater element on right"
e.g.
for the array [2 5 9 3 1 12 6 8 7]
Next greater for 2 is 5
Next greater for 5 is 9
Next greater for 9 is 12
Next greater for 3 is 12
Next greater for 1 is 12
Next greater for 12 is -1
Next greater for 6 is 8
Next greater for 8 is -1
Next greater for 7 is -1

PeepCoding - https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/next_greater_element_to_the_right/topic


Aditya Verma Solution:https://www.youtube.com/watch?v=NXOOYYwpbg4&list=PL_z_8CaSLPWdeOezg68SKkeLN4-T_jNHd&index=3

* */

public class NextGreaterElementOnRight {

    @Test
    //Using Brute Force O(n2)
    public void nextGreaterOnRight(){
        int[] arr = {2,5,9,3,3,1,3,12,1,6,8,7,12};
        //Expected - 5,9,12,12,12,3,12,-1,6,8,12,12,-1
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
       // int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        int[] arr = {2,5,9,3,3,1,3,12,1,6,8,7,12};
        //Expected - 5,9,12,12,12,3,12,-1,6,8,12,12,-1
        int[] newArr = new int[arr.length];
        Stack<Integer> st=new Stack<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                newArr[i]=-1;
                st.push(arr[i]);
            }
            else{
                while( st.size() > 0 && arr[i] >= st.peek()){
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
