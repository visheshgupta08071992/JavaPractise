package JavaConceptOfTheDay;

import java.util.Arrays;

import org.testng.annotations.Test;

public class JavaProgramtoReverseAString {

    //In comments I am mentioning the mistakes which I have made

    @Test
    public void reverseString(){
        String input="a b c";
        String reverse="";  // Did not initialized the reverse String
        for(int i=input.length()-1;i>=0;i--){     // length() is function with () in String.....In Arrays it does not have ()
            reverse=reverse+input.charAt(i);
        }
        System.out.println("Reverse String is " + reverse);
    }

    @Test
    public void reverseStringUsingStringBuffer(){
        String input="a b c";
        StringBuffer sb=new StringBuffer(input);
        System.out.println("Reverse String is " + sb.reverse());
    }

    @Test
    public void reverseStringWithoutUsingAdditionalVariable(){
        String input="a b c";
        char [] inputArray=input.toCharArray();
        int startingIndex=0;
        int endingIndex=input.length()-1;
        char temp;
        while(startingIndex<=endingIndex){
            temp=inputArray[startingIndex];
            inputArray[startingIndex]=inputArray[endingIndex];
            inputArray[endingIndex]=temp;
            startingIndex++;
            endingIndex--;
        }

        System.out.println("Reverse String is " + Arrays.toString(inputArray));
	    System.out.println("Reverse String is " + String.valueOf(inputArray));
    }

	@Test
	public void StringConcatination(){
		String a="Vishesh";
		String b="Sandesh";
		String c="Gupta";
		System.out.println(a+b+c);
		System.out.println(a.concat(b).concat(c));
		System.out.println(String.join("-",a,b));

	}

	@Test
	public void StringSplit(){
		String str = "Javatpoint";
		String [] strArray=str.split("t");
		System.out.println(Arrays.toString(strArray));

	}

	@Test
	public void ReversingUsingStringBufferWithoutUsingInBuiltMethod(){

    	//Always reverse String using StringBuffer as StringBuffer is mutuable i.e it would not keep on creating new
		// object as in case with String which we consume Memory
    	StringBuffer s=new StringBuffer("Vishesh");
		//It would create an empty StringBuffer
    	StringBuffer reverse=new StringBuffer();

		for(int i=s.length()-1;i>=0;i--){
			reverse.append(s.charAt(i));
			//Note concatination operator cannot be applied to StringBuffer we always need to use append function
			//reverse=reverse+s.charAt(i)
		}
		System.out.println("Reverse String is  " + reverse);

	}

	//Reverse a String without using Additional Variable,This can be done through Recurssion
	@Test
	public void reverseStringWithoutAdditionalVariable(){
    	String s="java";
		System.out.println(reverseUsingRecursion(s));
	}

	public String reverseUsingRecursion(String s){

    	if(s.equals(null) || s.length()<=1){
    		return s;
	    }
    	return reverseUsingRecursion(s.substring(1)) + s.charAt(0);
	}


	@Test
	public void PrintStringInAGivenWay(){
	/*selenium
	* seleniu
	* seleni
	* selen
	* sele
	* sel
	* se
	* s*/

	String s="selenium";
	for(int i=s.length()-1;i>=0;i--){
		System.out.println(s);
		s=s.substring(0,s.length()-1);
	}
	}

	@Test
	public void PrintStringInAGivenWayUsingStringBuffer(){
		/*selenium
		 * seleniu
		 * seleni
		 * selen
		 * sele
		 * sel
		 * se
		 * s*/


		StringBuffer s=new StringBuffer("Selenium");
		for(int i=s.length()-1;i>=0;i--){
			System.out.println(s);
			//Two ways of doing it using replace function or by using deleteCharAt function.Both would work
			//s.replace(0,s.length(),s.substring(0,s.length()-1));
			//s.deleteCharAt(i);
		}
	}
}
