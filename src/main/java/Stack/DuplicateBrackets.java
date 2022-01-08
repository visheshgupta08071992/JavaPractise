package Stack;


//BalancedExpression means if there is an opening bracket then there would be corresponding closing bracket

/*You are given a string exp representing an expression.
        Assume that the expression is balanced i.e. the opening and closing brackets match with each other. There is always a closing bracket for each opening bracket.
        But, some of the pairs of brackets may be extra/needless. You are required to print true if you detect extra brackets and false otherwise.
        Example

        ((a + b) + (c + d)) -> false: There is no redundant or duplicate braces found
        (a + b) + ((c + d)) -> true: There is a pair of redundant or duplicate braces around c+d.

    Explanation ->  https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/duplicate_brackets/topic

        */

import org.testng.annotations.Test;

import java.util.Stack;

public class DuplicateBrackets {

    @Test
    public void checkDuplicacyInBalancedExpression(){
//        ((a + b) + (c + d)) -> false
//        (a + b) + ((c + d)) -> true:
        String input="(a + b) + ((c + d))";
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(c==')'){
                if(st.peek()=='('){
                    System.out.println("True -> Duplicacy Present");
                    return;
                }
                else{
                    //Pop till we dont get opening brace '('
                    while(st.peek()!='('){
                        st.pop();
                    }
                }
                //Also remove the corresponding opening brace
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        System.out.println("False -> Duplicacy not Present");

    }

}
