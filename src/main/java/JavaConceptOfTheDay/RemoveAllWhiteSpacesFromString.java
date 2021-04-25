package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class RemoveAllWhiteSpacesFromString {

    @Test
    public void removeWhiteSpace(){

        //Using Regex
        String input="a b c";
        System.out.println(input.replaceAll("\\s","")); // Remeber we need to use \\ for replacement

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
