package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class CheckOneStringIsRotationOfAnother {

/*	Problem :

	If s1 and s2 are two given strings, then write a java program to check whether s2 is a rotated version of s1?

	Examples :

	If “JavaJ2eeStrutsHibernate” is a string then below are some rotated versions of this string.*/

/*“StrutsHibernateJavaJ2ee”, “J2eeStrutsHibernateJava”, “HibernateJavaJ2eeStruts”*/

/*https://leetcode.com/problems/rotate-string/submissions/918662967/*/
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

	//Given No1 and No2, Find whether No2 is rotated version of
	/*Example:
	*
	* If NO1 is 1234 then rotated version of N01 is
	* 2341,3412,4123
	* */

	@Test
	public void checkOneNoIsRotationOfAn(){
		int number1=1234;
		int number2=4123;
		String number1String=String.valueOf(number1);
		String number2String=String.valueOf(number2);
		String number3String=number1String + number1String;
		if(number3String.contains(number2String)){
			System.out.println(number2String + " is rotated version of " + number1String);
		}
		else{
			System.out.println(number2String + " is not rotated version of " + number1String);
		}
	}
}
