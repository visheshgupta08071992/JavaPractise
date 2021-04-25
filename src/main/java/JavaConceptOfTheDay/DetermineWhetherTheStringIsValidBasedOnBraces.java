package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class DetermineWhetherTheStringIsValidBasedOnBraces {

	//If the opening and closing braces are equal then its a valid string else invalid.

	@Test
	public void determineWhetherTheStringIsValidOnBraces(){

		String [] multipleInput= {"{{a{a}nc{}:}}}","{{{a{a}nc{}:}}}","{{{a{a}nc{}:}}}}"};
		determineWhetherOpeningAndClosingBracesAreEqual(multipleInput);
	}

	public void determineWhetherOpeningAndClosingBracesAreEqual(String [] input){

		for(String i:input){
			char [] inputArray=i.toCharArray();
			int openBracesCount=0;
			int closedBracesCount=0;
			for(char c:inputArray){
				if(c=='{'){
					openBracesCount++;
				}
				else if(c=='}'){
					closedBracesCount++;
				}
			}
			System.out.println("Open Braces Count in " + i + " : " + openBracesCount);
			System.out.println("Closed Braces Count in " + i + " : "  + closedBracesCount);
			if(openBracesCount==closedBracesCount){
				System.out.println(i + " is Valid");
			}
			else{
				System.out.println(i + " is InValid");
			}
		}
	}
}
