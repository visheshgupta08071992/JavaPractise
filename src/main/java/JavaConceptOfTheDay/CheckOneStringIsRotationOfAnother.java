package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class CheckOneStringIsRotationOfAnother {

/*	Problem :

	If s1 and s2 are two given strings, then write a java program to check whether s2 is a rotated version of s1?

	Examples :

	If “JavaJ2eeStrutsHibernate” is a string then below are some rotated versions of this string.*/

/*“StrutsHibernateJavaJ2ee”, “J2eeStrutsHibernateJava”, “HibernateJavaJ2eeStruts”*/

	@Test
	public void checkOneStringIsRotationOfAnother(){
		String s1="JavaJ2eeStrutsHibernate";
		String s2="J2eeStrutsHibernateJava";
		String s3=s1+s1;
		if(s3.contains(s2)){
			System.out.println(s2 + " is rotated version of " + s1);
		}
		else{
			System.out.println(s2 + " is not rotated version of " + s1);
		}
	}
}
