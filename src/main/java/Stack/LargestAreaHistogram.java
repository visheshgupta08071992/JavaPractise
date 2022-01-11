package Stack;

import org.testng.annotations.Test;

import java.util.Stack;

/*
* 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the height of bars in a bar chart.
3. You are required to find and print the area of largest rectangle in the histogram.

e.g.
for the array [6 2 5 4 5 1 6] -> 12
*
*
*PeepCoding -> https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/lah-official/ojquestion
*
*
* */
public class LargestAreaHistogram {

    @Test
    public void largestAreaHistogram(){
        int [] arr={6,2,5,4,5,1,6};
        int max=0;
        //Index of smaller element on left
        int [] nextSmallerOnLeft=findNextSmallerOnLeft(arr);
        //Index of smaller element on right
        int [] nextSmallerOnRight=findNextSmallerOnRight(arr);

        //Find largest area
        for(int i=0;i<arr.length;i++){
            int width = nextSmallerOnRight[i] - nextSmallerOnLeft[i] - 1;
            int area = arr[i] * width;
            if(area > max){
                max = area;
            }
        }
        System.out.println(max);
    }

    public int [] findNextSmallerOnLeft(int [] arr){
        int [] smallerOnLeft=new int[arr.length];
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()){
                smallerOnLeft[i]=-1;
                st.push(i);
            }
            else{
                while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                    st.pop();
                }
               if(st.isEmpty()){
                   smallerOnLeft[i]=-1;
                   st.push(i);
               }
               else if(arr[i] > arr[st.peek()]){
                   smallerOnLeft[i]=st.peek();
                   st.push(i);
               }
            }
        }
        return smallerOnLeft;
    }

    public int [] findNextSmallerOnRight(int [] arr){
        int [] smallerOnRight=new int[arr.length];
        Stack<Integer> st1 = new Stack<Integer>();
        for(int i=arr.length-1;i>=0;i--){
            if(st1.isEmpty()){
                smallerOnRight[i]=arr.length;
                st1.push(i);
            }
            else{
                while(st1.size()>0 && arr[i] <= arr[st1.peek()]){
                    st1.pop();
                }
                if(st1.isEmpty()){
                    smallerOnRight[i]=arr.length;
                    st1.push(i);
                }
                else if(arr[i] > arr[st1.peek()]){
                    smallerOnRight[i]=st1.peek();
                    st1.push(i);
                }
            }
        }
        return smallerOnRight;
    }
}
