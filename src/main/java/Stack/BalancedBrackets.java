package Stack;

import org.testng.annotations.Test;

/*
1. You are given a string exp representing an expression.
2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

e.g.
[(a + b) + {(c + d) * (e / f)}] -> true
[(a + b) + {(c + d) * (e / f)]} -> false
[(a + b) + {(c + d) * (e / f)} -> false
([(a + b) + {(c + d) * (e / f)}] -> false


Explanation : https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/balanced_brackets/topic

Note:
1. If after iteration stack is empty then it is a balanced string
2. If after iteration stack is not empty then additional open brace present

Algo:
1.If character other than open or close brace ignore
2.If character opening brace then push in stack
3.If character closing brace then
   1. If stack is empty then Not a balance string as additional closing brace present
   2. If Top brace is not same as closing brace Not a balance string
   3.If Top brace is  same as closing brace then pop



* */
import java.util.Stack;

public class BalancedBrackets {

    @Test
    public void balancedBrackets() {
        String s = "{[a+b]}";
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            //Push if there are any opening braces
            if(c=='{' || c=='[' || c=='('){
                st.push(c);
            }
            else if(c=='}'){
                if(st.size()==0){
                    System.out.println("Additional Closing brace " + c);
                    return;
                }
                else if(st.peek()!='{'){
                    System.out.println("Mismatch in braces" + st.peek() + " and " + c);
                    return;
                }
                else{
                    st.pop();
                }
            }
            else if(c==']'){
                if(st.size()==0){
                    System.out.println("Additional Closing brace " + c);
                    return;
                }
                else if(st.peek()!='['){
                    System.out.println("Mismatch in braces" + st.peek() + " and " + c);
                    return;
                }
                else{
                    st.pop();
                }
            }
            else if(c==')'){
                if(st.size()==0){
                    System.out.println("Additional Closing brace " + c);
                    return;
                }
                else if(st.peek()!='('){
                    System.out.println("Mismatch in braces" + st.peek() + " and " + c);
                    return;
                }
                else{
                    st.pop();
                }
            }
        }
        if(st.size()>0){
            System.out.println("Additional opening braces present");
        }
        else{
            System.out.println("It is a balanced string");
        }
    }

}