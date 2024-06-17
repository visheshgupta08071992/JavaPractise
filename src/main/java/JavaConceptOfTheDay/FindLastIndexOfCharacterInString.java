package JavaConceptOfTheDay;

/*
*
* https://www.geeksforgeeks.org/problems/last-index-of-a-character-in-the-string4516/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
* */

import org.testng.annotations.Test;

public class FindLastIndexOfCharacterInString {

    @Test
    public void findLastIndexOfChar(){

        String s="okiyh";
        char p='z';
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==p){
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");;

    }


}
