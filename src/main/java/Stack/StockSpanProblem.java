package Stack;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the prices of a share on n days.
3. You are required to find the stock span for n days.
4. Stock span is defined as the number of days passed between the current day and the first day before today when price was higher than today.

e.g.
for the array [2 5 9 3 1 12 6 8 7]
span for 2 is 1
span for 5 is 2
span for 9 is 3
span for 3 is 1
span for 1 is 1
span for 12 is 6
span for 6 is 1
span for 8 is 2
span for 7 is 1

PeepCoding -> https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/stock_span/topic

Aditya Verma -> https://www.youtube.com/watch?v=p9T-fE1g1pU&list=PL_z_8CaSLPWdeOezg68SKkeLN4-T_jNHd&index=6

https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1

* */
public class StockSpanProblem {

    @Test
    public void usingBruteForce(){
      //  int[] arr = {100, 80, 60, 70, 60, 75, 85};
        // Expected - 1 1 1 2 1 4 6
        int[] arr = {100,130,100,90,120,120,110,130,140};
        // [1, 2, 1, 1, 3, 4, 1, 8, 9]
        int[] newArr = new int[arr.length];

        for(int i=arr.length-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                if(arr[j] > arr[i]){
                    newArr[i]=i-j;
                    break;
                }
                if(j==0){
                    newArr[i]=i+1;
                }
            }
        }
        newArr[0]=1;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }

    @Test
    public void stockSpanProblem() {
    //   int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int[] arr = {100,130,100,90,120,120,110,130,140};
        // Expected - 1 1 1 2 1 4 6
        int[] newArr = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty()) {
                newArr[i] = 1;
                st.push(0);
            } else {
                while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    newArr[i] = i + 1;
                    st.push(i);
                }
                if( arr[st.peek()] > arr[i] ) {
                    newArr[i] = i - st.peek();
                    st.push(i);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }
}
