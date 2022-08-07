package DSAPreparation.Grind75.Stack;

import org.testng.annotations.Test;

import java.util.Stack;

/*
* Leetcode - https://leetcode.com/problems/valid-parentheses/
*
* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
*
*
* */

public class Validparanthesis {

    @Test
    public void valid(){
        String s="()[]{}";
        char [] cArray = s.toCharArray();
        Stack<Character> stack =  new Stack<>();

        for(char c : cArray){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                if(c ==')') {

                    if(stack.isEmpty()){
                        System.out.println("false");
                        return;
                    }

                    if (stack.peek() == '(') {

                        stack.pop();

                    } else {
                        System.out.println("false");
                        return;

                    }
                }

                else if(c =='}'){


                    if(stack.isEmpty()){
                        System.out.println("false");
                        return;
                    }


                    if(stack.peek()=='{'){

                        stack.pop();


                    }
                    else{
                        System.out.println("false");
                        return;
                    }
                }
                else  if(c ==']'){

                    if(stack.isEmpty()){
                        System.out.println("false");
                        return;
                    }

                    if(stack.peek()=='['){

                        stack.pop();


                    }
                    else{
                        System.out.println("false");
                        return;
                    }
                }


            }

        }
        if(!stack.isEmpty()){
            System.out.println("false");
            return;
        }
        System.out.println("true");
    }
}
