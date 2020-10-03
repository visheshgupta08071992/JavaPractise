package JavaConceptOfTheDay;

//Print String in below format
/*Selenium
Seleniu
Seleni
Selen
Sele
Sel
Se
s*/


import org.testng.annotations.Test;

public class JavaProgramToPrintStringInGivenFormat {

	@Test
	public void printString(){
		String input="Selenium";
		int startIndex=0;
		int endIndex=input.length()-1;
		while(startIndex<=endIndex){
			System.out.println(input);
			input = input.substring(startIndex,endIndex);
			endIndex--;
		}
	}
}
