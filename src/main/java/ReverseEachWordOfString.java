import org.testng.annotations.Test;

public class ReverseEachWordOfString {

    //Input : BAD IS DAD
    //Output: DAB SI DAD

    @Test
    public void reverseEachWordOFString(){
        String input="BAD IS DAD";
        String [] inputArray=input.split(" ");
        String reverseString="";
        for(int i=0;i<=inputArray.length-1;i++){
            String word=inputArray[i];
            String reverseWord="";
            for(int j=word.length()-1;j>=0;j--){
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString=reverseString + reverseWord + " ";
        }
        System.out.println(reverseString.trim());
    }
}
