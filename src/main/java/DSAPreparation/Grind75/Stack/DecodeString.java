package DSAPreparation.Grind75.Stack;

/*
* Leetcode - https://leetcode.com/problems/decode-string/
*
* Explanation - https://www.youtube.com/watch?v=E9qHRcQXmDk
*
*Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.

Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
*
*
*
* */

import org.testng.annotations.Test;

import java.util.Stack;

public class DecodeString {
    @Test
    public void decode1() {
        // String s = "2[abc]3[cd]ef";
        String s = "2[abc]ef";
       // String s = "3[a2[c]]";
        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int k = 0;

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                k = (k * 10) + (c - '0');
                continue;
            }

            if (c == '[') {
                numStack.push(k);
                k = 0;
                stringStack.push(String.valueOf(c));
                continue;
            }

            if (c != ']') {
                stringStack.push(String.valueOf(c));
                continue;
            }

            StringBuilder temp = new StringBuilder();
            while (!stringStack.peek().equals("["))
                temp.insert(0, stringStack.pop());

            // remove the "["
            stringStack.pop();

            // Get the new string
            StringBuilder replacement = new StringBuilder();
            int count = numStack.pop();
            for (int i = 0; i < count; i++)
                replacement.append(temp);

            // Add it to the stack
            stringStack.push(replacement.toString());
        }

        StringBuilder result = new StringBuilder();
        while (!stringStack.empty()) {
            result.insert(0, stringStack.pop());
        }
        System.out.println(result.toString());

    }

    @Test
    public void usingelseIf(){

        String s="3[a]2[bc]";
        // Created numStack to store numeric values of String
        Stack<Integer> numStack= new Stack<>();

        //Created  String stack to store rest of the characters as String
        Stack<String> st= new Stack<>();


        int k=0;
        for(char c:s.toCharArray()){

            if(Character.isDigit(c)){
                k= k*10 + Integer.valueOf(String.valueOf(c));
            }

            else if(c=='['){
                numStack.push(k);
                k=0;
                st.push(String.valueOf(c));
            }
            else if(c!=']'){
                st.push(String.valueOf(c));
            }

            else{
                StringBuilder sb = new StringBuilder();

                while(!st.peek().equals("[")){
                    sb.insert(0,st.pop());
                }

                st.pop();

                int count = numStack.pop();

                StringBuilder sb1 = new StringBuilder();

                for(int i=1;i<=count;i++){
                    sb1.append(sb);
                }

                st.push(sb1.toString());
            }

        }

        StringBuilder result = new StringBuilder();

        while(!st.isEmpty()){
            result.insert(0,st.pop());
        }

        System.out.println(result.toString());
    }
}
