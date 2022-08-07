package DSAPreparation.Grind75.Stack;

/*
* LeetCode - https://leetcode.com/problems/implement-queue-using-stacks/submissions/
* Youtube - https://www.youtube.com/watch?v=mDcP7tLuBhc
*
* */

import java.util.Stack;

public class ImplementQueueUsingTwoStacks {

    class MyQueue {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {
            s1.push(x); //Complexity of adding is o(1)
        }

        public int pop() {
            // Complexity of pping is o(n) as everytime we need to remove all elements from Stack s1 for removing one element
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            int ans = s2.pop();

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

            return ans;

        }

        public int peek() {
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            int ans = s2.peek();

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

            return ans;
        }

        public boolean empty() {
            return s1.isEmpty() && s2.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
