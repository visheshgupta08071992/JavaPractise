package JavaConceptOfTheDay;

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
}
