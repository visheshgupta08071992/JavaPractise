package Java8Practise.LambaFunction;

import static java.lang.System.*;

public class StringClass {

    public static void main(String[] args) {
        StringOperation upperCaseString= String::toUpperCase;
        out.println(upperCaseString.uppercase("vishesh"));

    }
}
