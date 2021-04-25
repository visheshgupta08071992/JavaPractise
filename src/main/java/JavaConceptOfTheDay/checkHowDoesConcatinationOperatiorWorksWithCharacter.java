package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class checkHowDoesConcatinationOperatiorWorksWithCharacter {


	//After running the below program we understand that concatination operator does not work for Character. If it
	// had worked we should get output as : ab but it is summing asci value of a and retruning the output as 194
	@Test
	public void findLargestTwoDigitNoInAString1(){
		char a='a';
		char b='a';
		System.out.println(a+b);
	}
}
