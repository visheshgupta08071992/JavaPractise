public class ReplaceWhiteSpacesFromString {

    public static void replaceWhiteSpaces(){

        String inputString="Harry is Harry";
        inputString.replaceAll("\\s","");
        System.out.println(inputString.replaceAll("\\s",""));
    }

    public static void replaceWhiteSpacesWithoutUsingRegex(){

        String inputString="Harry is Harry";
        char [] inputArray=inputString.toCharArray();
        String stringWithoutSpace="";
        for(char c:inputArray){
            if(c != ' '){
                stringWithoutSpace =stringWithoutSpace + c;
            }
        }
        System.out.println(stringWithoutSpace);
    }

    public static void main(String[] args) {

      //  replaceWhiteSpaces();
      replaceWhiteSpacesWithoutUsingRegex();
    }
}
