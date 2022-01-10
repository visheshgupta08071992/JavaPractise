package Stack;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Stack;

//Aditya Verma - https://www.youtube.com/watch?v=nc1AYFyvOR4&list=PL_z_8CaSLPWdeOezg68SKkeLN4-T_jNHd&index=5
public class NextSmallerOnRight {


    @Test
    // o(n2)
    public void bruteForce(){
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        // expected : 1,3,3,1,-1,6,-1,7,-1
        int[] newArr = new int[arr.length];
        for(int i=0;i<arr.length - 1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    newArr[i]=arr[j];
                    break;
                }
                if(j==arr.length-1){
                    newArr[i] = -1;
                }
            }
        }
        newArr[arr.length-1]=-1;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }


    @Test
    //Using Stack O(n)
    public void nextSmallerOnRightUsingStack() {
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        // expected : 1,3,3,1,-1,6,-1,7,-1
        int[] newArr = new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                newArr[i]=-1;
                st.push(arr[i]);
            }
            else{
                while(st.size()>0 && arr[i] <= st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    newArr[i]=-1;
                    st.push(arr[i]);
                }
                if(arr[i] > st.peek()){
                    newArr[i]=st.peek();
                    st.push(arr[i]);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }
}
