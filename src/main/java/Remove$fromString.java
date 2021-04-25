//Given string is 120.00$.........Output should be 120.00


import java.util.Arrays;

import org.testng.annotations.Test;

public class Remove$fromString {

    public static void remove$FromStringUsingRegex(){
        String input="120.00$";
        String output=input.replaceAll("\\$","");
        System.out.println(output);
    }

    public static void remove$FromStringWithoutUsingRegex(){
        String input="120.00$";
        String [] output=input.split("\\$");
        System.out.println(output[0]);
        System.out.println(Arrays.toString(output));
    }

    public static void remove$FromStringUsingRegex1(){
        String input="120.00$";
        String output=input.replace("$","");
        System.out.println(output);
    }

    @Test
    public void remove$(){
        String input="120.00$";
        input=input.substring(0,input.length()-1);
        System.out.println(input);
    }

    public static void main(String[] args) {
        remove$FromStringUsingRegex();
        remove$FromStringWithoutUsingRegex();
        remove$FromStringUsingRegex1();
    }
}
