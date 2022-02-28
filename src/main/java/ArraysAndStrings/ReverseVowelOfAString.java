package ArraysAndStrings;


/*
*
* Question - https://nados.io/question/reverse-vowels-of-a-string
* Solution - https://www.youtube.com/watch?v=hgtH9FIZrOE&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=25
* LeetCode -https://leetcode.com/problems/reverse-vowels-of-a-string/
*
*
* */

import org.testng.annotations.Test;

import java.util.Arrays;

public class ReverseVowelOfAString {

    @Test
    public void reverseVowel(){
        String s = "PepCoding";
        //Expected - PipCodeng

        char [] strArr = s.toCharArray();
        int i=0;
        int j=strArr.length-1;
        while(i<j){
            if(isVowel(strArr[i]) && isVowel(strArr[j])){
                char temp=strArr[i];
                strArr[i]=strArr[j];
                strArr[j]=temp;
                i++;
                j--;
            }
            else if(!isVowel(strArr[i]) && isVowel(strArr[j])){
                i++;
            }
            else if(isVowel(strArr[i]) && !isVowel(strArr[j])){
                j--;
            }
            else if(!isVowel(strArr[i]) && !isVowel(strArr[j])){
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(strArr));
        //To convert character array into String
        s=String.valueOf(strArr);
        System.out.println(s);
    }

    public Boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        return false;
    }
}


