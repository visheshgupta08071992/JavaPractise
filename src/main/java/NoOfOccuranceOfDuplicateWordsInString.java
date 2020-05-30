import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NoOfOccuranceOfDuplicateWordsInString {

    public static void noOfOccurance(){
        String input="Java is Java again Java";
        String [] inputArray=input.split(" ");
        System.out.println(Arrays.toString(inputArray));
        HashMap<String,Integer> h=new HashMap<String, Integer>();
        for(String S:inputArray){
            if(h.containsKey(S)){
                h.put(S,h.get(S)+1);
            }
            else{
                h.put(S,1);
            }
        }
        System.out.println(h);
        for (Map.Entry m :h.entrySet()) {
            System.out.println("Occurance of " +m.getKey() + " is " + m.getValue());
        }
    }


    public static void main(String[] args) {
        noOfOccurance();
    }
}
