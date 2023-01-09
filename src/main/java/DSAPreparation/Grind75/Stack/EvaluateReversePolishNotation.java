package DSAPreparation.Grind75.Stack;

import org.testng.annotations.Test;

import java.util.Stack;

/*
* Leetcode - https://leetcode.com/problems/evaluate-reverse-polish-notation/submissions/
*
* Explanation - https://www.youtube.com/watch?v=8VYdGvOnkl0
*
* Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, and /. Each operand may be an integer or another expression.

Note that division between two integers should truncate toward zero.

It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.



Example 1:

Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9
Example 2:

Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6
Example 3:

Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
Output: 22
Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22
*
*
* */

public class EvaluateReversePolishNotation {

    @Test
    public void evaluateReversePolishNotation(){
        String [] tokens ={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        //Expected 22
        //Created Stack of Integer
        Stack<Integer> st = new Stack<>();

        //Iterating the String Array and adding the String by converting it into integer into stack

        for(String s : tokens){
            //Here we are using equals instead of == operater as in string eeuals compares the value where
            //as == compares referenace. So whenever you are using string use equals for comparision

            if(s.equals("+") || s.equals("-")  || s.equals("*")  || s.equals("/") ){

                // Here pop fetches the values and then removes it from the stack
                // we ar first storing value in val2 as we need to perform operatipn from left to right
                int val2 = st.pop();
                int val1 = st.pop();

                if(s.equals("+")){
                    st.push(val1 + val2);
                }
                else if(s.equals("-")){
                    st.push(val1 - val2);
                }
                else if(s.equals("*")){
                    st.push(val1 * val2);
                }
                else if(s.equals("/")){
                    st.push(val1 / val2);
                }
            }

            else{
                // If the string is not arithemetic operator then add it into stack
                st.push(Integer.valueOf(s));
            }
        }
        System.out.println(st.peek());
    }
}
