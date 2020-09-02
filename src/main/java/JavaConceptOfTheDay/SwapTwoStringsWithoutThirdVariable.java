package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class SwapTwoStringsWithoutThirdVariable {

	@Test
	public void swapTwoStrings(){
		String s1="bad";
		String s2="dada";
		s1=s1+s2; //baddada
		s2=s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());

		//Swapping ends

		System.out.println("After Swapping :");

		System.out.println("s1 : "+s1);

		System.out.println("s2 : "+s2);

	}
}
