package Java8Practise.LambaFunction;

import org.testng.annotations.Test;

public class FindStringLengthWithUsingLenthMethod {

  /*  As per Javadoc,

    public int lastIndexOf(String str)

    Returns the index within this string of the last occurrence of the specified substring. The last occurrence of the empty string “” is considered to occur at the index value this.length()
*/
    @Test
    public void strLength(){
        String a="vishesh";
        System.out.println("Length of String is " +a.lastIndexOf(""));
    }
}
