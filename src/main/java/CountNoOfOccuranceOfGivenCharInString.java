public class CountNoOfOccuranceOfGivenCharInString {

    public static void countCharacterOccurance(){

        String inputString="Happy is Happy for pig";
        int count=0;
        for(Character C:inputString.toCharArray()){
            if(C.equals('p')){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void countCharacterOccuranceWithoutUsingForLoop(){
        String s = "Java is java again java again";

        char c = 'a';
        System.out.println(s.length());
        System.out.println(s.replace("a", ""));
        System.out.println(s.replace("a", "").length());

        int count = s.length() - s.replace("a", "").length();

        System.out.println("Number of occurances of 'a' in "+s+" = "+count);
    }

    public static void main(String[] args) {
        countCharacterOccurance();
        countCharacterOccuranceWithoutUsingForLoop();
    }
}
