//Given string is 120.00$.........Output should be 120.00


import java.util.Arrays;

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

    public static void main(String[] args) {
        remove$FromStringUsingRegex();
        remove$FromStringWithoutUsingRegex();
    }
}
