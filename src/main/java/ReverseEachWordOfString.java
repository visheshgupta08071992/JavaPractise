public class ReverseEachWordOfString {

    public static String reverseEachWord(String input){
        String [] words=input.split("");
        String reverseWord="";
        String reverseString="";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            for(int j=word.length()-1;j>=0;j--){
                reverseWord=reverseWord + word.charAt(j);
            }
        }
        reverseString=reverseString + reverseWord;
        return reverseString;
    }

    public static void main(String[] args) {
String reverseString=reverseEachWord("BAD IS DAD");
        System.out.println(reverseString);
        System.out.println(reverseString.trim());
    }
}
