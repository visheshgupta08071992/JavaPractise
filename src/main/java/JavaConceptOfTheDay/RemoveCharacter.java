package JavaConceptOfTheDay;

import org.testng.annotations.Test;

/*
* https://www.geeksforgeeks.org/problems/remove-character3815/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
*
* Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).
*
*Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".
*
*
*
*
*
* */
public class RemoveCharacter {

    @Test
    public void removeCharacter(){
        String string1 = "computer";
        String string2 = "cat";
        StringBuilder S1 = new StringBuilder(string1);
        int j=0;
        for(int i=0;i<string1.length();i++){

            if(string2.contains(String.valueOf(string1.charAt(i)))){
                S1.deleteCharAt(j);
                j--;
            }
            j++;
        }
        System.out.println(S1.toString());
    }
}
