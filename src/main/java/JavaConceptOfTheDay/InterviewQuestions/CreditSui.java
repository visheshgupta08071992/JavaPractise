package JavaConceptOfTheDay.InterviewQuestions;


import org.testng.annotations.Test;

/*
Input : abc abcd\b abc \n ababab abc
Output : abc abc abc
 ababab

Means \b aaya to uske pahele ka charecter delete karna aur \n aaya to new line pe jana*/
public class CreditSui {

	@Test
	public void test(){
		String input="abc abcd\\b abc \\n ababab abc";
		StringBuilder sb=new StringBuilder();
		char [] inputArray=input.toCharArray();
		for(int i=0;i<inputArray.length;i++){
			if(inputArray[i]=='\\'){
				if(i<inputArray.length-1 && inputArray[i+1]=='b'){
                  sb.deleteCharAt(sb.length()-1);
				}
				if(i<inputArray.length-1 && inputArray[i+1]=='n'){
					sb.append('\n');
				}
				i++;
			}
			else{
				sb.append(inputArray[i]);
			}
		}
		System.out.println(sb.toString());
	}
}
