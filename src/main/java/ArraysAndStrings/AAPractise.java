package ArraysAndStrings;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class AAPractise {

    @Test
    public void test() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //Expected 1 5 9 2 6 3
    }

    @Test
    public void test2() {
        // nput:abcdeig
        // Output:aeibcdg

        String s = "abcdeig";

        char [] sArray= s.toCharArray();

        int i=0;
        int j=s.length() - 1;

        while(i<=j){
            //Both are vowel
            if(isVowel(sArray[i]) && isVowel(sArray[j])){
                i++;
            }

            //Both are consonent
            else if(!isVowel(sArray[i]) && !isVowel(sArray[j])){
                j--;
            }

            //First is vowel and last is consonent
            else if(isVowel(sArray[i]) && !isVowel(sArray[j])){
                i++;
                j--;
            }

            //First is consonent and last is vowel
            else if(!isVowel(sArray[i]) && isVowel(sArray[j])){
                char c = sArray[i];
                sArray[i]=sArray[j];
                sArray[j]=c;
                i++;
                j--;
            }
        }
        String result = new String(sArray);
        System.out.println(result);
    }

    @Test
    public void test3(){
        String s = "abcdeig";
        String vowel="";
        String consonent="";

        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                vowel = vowel + s.charAt(i);
            }
            else{
                consonent = consonent + s.charAt(i);
            }
        }
        String result = vowel + consonent;
        System.out.println(result);
    }

    @Test
    public void sumOfTwoArrays(){
        int [] arr1={9,9,9};
        int [] arr2={0,0,1};
        int [] arr3= new int[arr1.length > arr2.length ? arr1.length:arr2.length];

        int i= arr1.length -1;
        int j= arr2.length -1;
        int k= arr3.length -1;
        int carry=0;

        while(k>=0){
            int val1 = i>=0?arr1[i]:0;
            int val2 = j>=0?arr2[j]:0;
            i--;
            j--;
            int sum = val1 + val2 + carry;
            arr3[k] = sum%10;
            k--;
            carry= sum/10;
        }
        List<Integer> result = new ArrayList<>();
        if(carry>0){
            result.add(carry);
        }
        for(int var:arr3){
            result.add(var);
        }
        System.out.println(result);
    }

    @Test
    public void diffOfTwoArrays() {
        int[] arr1 = {1,0, 0, 0};
        int[] arr2 = {0, 0, 1};
        int[] arr3= new int[arr1.length > arr2.length ? arr1.length:arr2.length];
        int i= arr1.length -1;
        int j= arr2.length -1;
        int k= arr3.length -1;
        int carry=0;
        while(k>=0){
            int val1 = i>=0?arr1[i]:0;
            int val2 = j>=0?arr2[j]:0;
            i--;
            j--;
            int diff;
            if(val1 + carry >=val2){
                diff = (val1 + carry) - val2;
            }
            else{
                diff= (val1 + carry + 10) - val2;
                carry=-1;
            }
            arr3[k]=diff;
            k--;
        }
        System.out.println(Arrays.toString(arr3));
    }
    public Boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;

    }

    @Test
    public void nextSmallerOnLeft(){
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        // Expected - -1 2 5 2 -1 1 1 6 6

        int [] result = new int[arr.length];

        for(int i=arr.length -1;i>0;i--){
            for(int j = i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    result[i]=arr[j];
                    break;
                }
                if(j==0){
                    result[i]=-1;
                }
            }
        }
        result[0] = -1;
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void nextSmallerOnLeftUsingStack() {
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        // Expected - -1 2 5 2 -1 1 1 6 6
        int [] result = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()){
                result[i]=-1;
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty() && arr[i] < st.peek()){
                    st.pop();
                }
                if(st.isEmpty()){
                    result[i]=-1;
                    st.push(arr[i]);
                }
                else{
                    result[i]=st.peek();
                    st.push(arr[i]);
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}

