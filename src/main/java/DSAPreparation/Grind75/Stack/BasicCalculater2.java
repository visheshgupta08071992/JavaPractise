package DSAPreparation.Grind75.Stack;

import org.testng.annotations.Test;

import java.util.Stack;

/*
* Leetcode - https://leetcode.com/problems/basic-calculator-ii/
*
* Explanation - https://www.youtube.com/watch?v=gmy6L9vHTbo
*
*
* Given a string s which represents an expression, evaluate this expression and return its value.

The integer division should truncate toward zero.

You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].

Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().



Example 1:

Input: s = "3+2*2"
Output: 7
Example 2:

Input: s = " 3/2 "
Output: 1
Example 3:

Input: s = " 3+5 / 2 "
Output: 5
*
*
*
* */
public class BasicCalculater2 {

    @Test
    public void test1(){
        //String s = "3+3/2*3-2";
        // String s=" 3/2 ";
        //String s="42";
        //String s = " 3+5 / 2";
        //String s="0-2147483647";

        String s= "-10+3*3-2/3*4+5";

        //Removing white spaces from string expression


        s=s.replaceAll(" ","");

        Stack<Integer> st = new Stack<>();
        char sign='+';

        for(int i=0;i<s.length();i++){

            if(Character.isDigit(s.charAt(i))){
                int val=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    val= val*10 + (s.charAt(i) -'0');
                    i++;
                }
                //As for loop should start from correct sequence as while loop had incremented i to non digit
                i--;
                if (sign=='+'){
                    st.push(val);
                }
                else if (sign=='-'){
                    st.push(-val);
                }
                else if (sign=='*'){
                    st.push(st.pop()*val);
                }
                else if (sign=='/'){
                    st.push(st.pop()/val);
                }
            }
            //Since we have removed white spaces, character would only be either of +,-,*,/
            else{
                sign=s.charAt(i);
            }

        }

        int result=0;
        while(!st.isEmpty()){
            result=result + st.pop();
        }
        System.out.println(result);
    }

    @Test
    public void anotherWay(){
        String s= "-10+3*3-2/3*4+5";
        Stack<Integer> st = new Stack<>();
        char sign = '+';
        int result=0;

        s=s.replaceAll(" ","");

        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){

                int initial=i;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    i++;
                }
                int value = Integer.valueOf(s.substring(initial,i));

                i--;
                if(sign=='+'){
                    st.push(value);
                }
                else if(sign=='-'){
                    st.push(-value);
                }
                else if(sign=='*'){
                    st.push(st.pop()*value);
                }
                else if(sign=='/'){
                    st.push(st.pop()/value);
                }

            }

            else{
                sign = s.charAt(i);
            }
        }
        while(!st.isEmpty()){
            result = result + st.pop();
        }
        System.out.println(result);

    }
}
