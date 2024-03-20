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
	public void printString1(){
		String input="Selenium";
		System.out.println(input);
		for(int i=input.length()-1;i>=0;i--){
			System.out.println(input.substring(0,i));
		}
	}

	@Test
	public void printString2(){
		String input="Selenium";
		StringBuilder sb= new StringBuilder(input);
		for(int i=1;i<=input.length();i++){
			System.out.println(sb);
			sb.deleteCharAt(sb.length()-1);
		}
	}


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
