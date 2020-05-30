public class ReplaceWhiteSpacesFromString {

    public static void replaceWhiteSpaces(){

        String inputString="Harry is Harry";
        inputString.replaceAll("\\s","");
        System.out.println(inputString.replaceAll("\\s",""));
    }

    public static void main(String[] args) {
        replaceWhiteSpaces();
    }
}
