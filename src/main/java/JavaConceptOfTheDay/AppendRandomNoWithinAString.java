package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class AppendRandomNoWithinAString {

	@Test
	public void appendRandomNoWithinAString(){
		int min = 10;
		int max = 100000;
		int random= (int) (Math.random()* (max - min + 1) + min);
		System.out.println(random);
		String domain1="goog-test.b7" +random+ ".appdirect.com.iaasprov.in";
		System.out.println(domain1);
	}
}
