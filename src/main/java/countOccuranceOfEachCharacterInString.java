import java.util.HashMap;
import java.util.Map;

public class countOccuranceOfEachCharacterInString {

    public static void occuranceOfEachCharacterInString(){
        String inputString="Happy is Happy";
        char [] characterArray=inputString.toCharArray();
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for (char c: characterArray) {
            if(h.containsKey(c)){
                h.put(c,h.get(c)+1);
            }
            else{
                h.put(c,1);
            }
            System.out.println(h);
        }
        for (Map.Entry m:h.entrySet()) {
            System.out.println("Occurance of " +m.getKey() + " is " + m.getValue());
        }
    }

    public static void main(String[] args) {
        occuranceOfEachCharacterInString();
    }


}
