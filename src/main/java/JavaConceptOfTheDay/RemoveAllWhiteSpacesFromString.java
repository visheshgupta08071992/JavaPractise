package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class RemoveAllWhiteSpacesFromString {

    /*
    * Difference between replace and replaceALL - https://stackoverflow.com/questions/10827872/difference-between-string-replace-and-replaceall
    *
    * Both replace() and replaceAll() replace all occurrences in the String
    *
    * Its just that replaceAll supports regex while replace does not support regex
    *
    * */

    @Test
    public void removeWhiteSpace(){

        //Using Regex
        String input="a b c";
        System.out.println(input.replaceAll("\\s","")); // Remeber we need to use \\ for replacement

       //Without regex,just mentioning space
        String s ="a b c d e f";
        System.out.println(s.replace(" ",""));

        String m ="a b c d e f   h     l";
        System.out.println(s.replaceAll("\\s",""));
        //Replace does not support regex
      //  System.out.println(s.replace("\\s",""));

        System.out.println(s.replace(" ",""));

        //Using Character Array
        char[] charArray = input.toCharArray();     //Here we need to char and not Character
        String outputWithoutSpace="";
        for(int i=0;i<charArray.length;i++){
            if(charArray[i] != ' ' && charArray[i] != '\t'){          //Here we need to compare space and tab in
                // single inverted commas
                outputWithoutSpace=outputWithoutSpace + charArray[i];
            }

        }
        System.out.println(outputWithoutSpace);


        //Using String
        String outputWithoutSpace1="";
        for(int j=0;j<input.length();j++){
            if(input.charAt(j) != ' '){
                outputWithoutSpace1=outputWithoutSpace1 + input.charAt(j);
            }
        }
        System.out.println(outputWithoutSpace1);
    }
    @Test
    public void removeWhiteSpaceInPlace(){
        String input="a b c";
        char [] inputArray=input.toCharArray();
        int i=0;
        for(int j=0;j<=inputArray.length-1;j++){
            if(inputArray[j] != ' '){
                inputArray[i]=inputArray[j];
       //         System.out.println(inputArray[i]);
                i++;
     //           System.out.println(inputArray[i]);
            }
        }
        int m=0;
       while(m < inputArray.length-1){
           System.out.println(inputArray[m]);
           m++;
       }
    }
}
