package JavaConceptOfTheDay;

import org.testng.annotations.Test;

/*
* https://www.geeksforgeeks.org/problems/demonitisation0013/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
*
*Given 3 Strings S, M and N. Your task is to remove occurences of M and N completely from the given string S.
* After removing every occurence of M and N from the string S, if S becomes empty, then return -1.
*
*Input:
S = abc
m = ab
n = bc
Output:
-1
Explanation: When we remove the two strings,
we get an empty string and thus the Output -1.
*
Input:
S =  abbbccab
m = ab
n = bcc
Output:
b
Explanation: There are two instance of the String
"ab" in S and one occurence of "bcc". Removing
these from S we get "b"
*
*
* */
public class DemonitisationOfString {

    @Test
    public void demonitization(){
       String S = "abc";
       String m = "ab";
       String n = "bc";
        //Replace m from the String
        S = S.replace(m,"");

        // If after replacing S ength is less then n and n conatins S then replace S with empty string
        if(S.length() < n.length()){
            if(n.contains(S)){
                S = S.replace(S,"");
            }
        }
        //If S length is not less then n's length then replace n from S.
        else{
            S = S.replace(n,"");
        }

        if(S.isEmpty()){
            System.out.println("-1");
            return;
        }
        System.out.println(S);;
    }

}
