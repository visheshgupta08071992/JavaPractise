import java.util.Arrays;
import java.util.HashSet;

public class MultipleArrayIntersection {

    public static void arrayIntersection(int[] ... inputArrays){

            HashSet<Integer> intersectionSet=new HashSet(Arrays.asList());
        System.out.println(intersectionSet);
            for(int i=1;i<inputArrays.length;i++){
                HashSet<Integer> set=new HashSet(Arrays.asList(inputArrays[i]));
                intersectionSet.retainAll(set);
                System.out.println(intersectionSet);
            }
        System.out.println(intersectionSet);

    }

    public static void main(String[] args) {
        arrayIntersection(
                new int [] {1,2,4,3,7},
                new int [] {4,8,2,5},
                new int [] {6,1,7,4},
                new int [] {10,2,3,7,8,9,4}
        );
    }
}
