package DSAPreparation.Grind75.String;

import org.testng.annotations.Test;

import java.util.Locale;

/*
* Leetcode - https://leetcode.com/problems/valid-palindrome/
*
*
* */
public class ValidPalindrome {

    @Test
    //With Regex ab_a input gives result as false as _ is not removed using regex
    public void validPalindrome(){
      //  String s = "A man, a plan, a canal: Panama";
        String s="ab_a";
        s=s.toLowerCase().replaceAll("\\d","") //replacing digits
                .replaceAll("\\s","")//replacing whitespace
                .replaceAll("[^A-Za-z0-9]", "");
               // .replaceAll("\\W",""); // replacing nonWord like , : but
        // \\W does not remove _(underscore)
        System.out.println(s);
        char [] ch=s.toCharArray();

        int i=0;
        int j=ch.length -1;
        while(i<j){
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        String s1=new String(ch);
        if(s.equals(s1)){
            System.out.println("True");
            return;
        }
        else{
            System.out.println("false");
            return;
        }

    }

    @Test
    public void validPalindromeWithoutRegex(){
      //  String s = "A man, a plan, a canal: Panama";
        String s="ab_a";
        String s1="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                s1=s1+s.charAt(i);
            }
        }
        s1=s1.toLowerCase();

        System.out.println(s1);

        char [] ch=s1.toCharArray();

        int i=0;
        int j=ch.length -1;
        while(i<j){
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        String s2=new String(ch);
        if(s1.equals(s2)){
            System.out.println("True");
            return;
        }
        else {
            System.out.println("false");
            return;
        }

    }

    @Test
    public void validPalindromeWithoutRegexAndWithoutReverseBestSolution() {
        //  String s = "A man, a plan, a canal: Panama";
        String s="ab_a";
        StringBuilder s1= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                s1.append(s.charAt(i));
            }
        }
        s=s1.toString().toLowerCase();

        int i=0;
        int j=s.length() -1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");;
}
}
