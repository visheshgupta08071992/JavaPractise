package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class UnderstandingIntegerWrapperClass {

	@Test
	public void integerWrapper(){
		Integer a=2;
		Integer b=2;
		Integer c=new Integer(2);
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a.equals(c));

		System.out.println(a+2);
		System.out.println(a);

	}
}
