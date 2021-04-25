package JavaConceptOfTheDay.InterviewQuestions;

import java.util.Stack;

import org.testng.annotations.Test;

public class BalanceParanthesis {

	/*
	 *
	 * Problem is very nicely explained in : https://www.youtube.com/watch?v=uuE2pEjLiEI
	 * https://www.youtube.com/watch?v=CCyEXcNamC4
	 * */

	@Test
	public void checkParanthesisBalance() {

		String input = "{{()[{}]}}";
		Stack<Character> st=new Stack<Character>();
		Boolean flag=true;
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)=='(' || input.charAt(i)=='{' || input.charAt(i)=='['){
				st.push(input.charAt(i));
			}
			else{
				if(input.charAt(i)==')'){
					flag=handleClosing(st,'(');
					if(!flag){
						System.out.println("Not a valid String");
						break;
					}
				}
				else if(input.charAt(i)=='}'){
					flag=handleClosing(st,'{');
					if(!flag){
						System.out.println("Not a valid String");
						break;
					}
				}
				else if(input.charAt(i)==']'){
					flag=handleClosing(st,'[');
					if(!flag){
						System.out.println("Not a valid String");
						break;
					}
				}
			}
		}

		if(flag){
			if(st.empty()){
				System.out.println("String is Valid");
			}
			else{
				System.out.println("String is not Valid");
			}
		}

	}

	public Boolean handleClosing(Stack<Character> st, char correspondingOpening){

		if(st.empty()){
			return false;
		}
		else if(st.peek()!=correspondingOpening){
			return false;
		}
		else{
			st.pop();
			return true;
		}

	}
}
