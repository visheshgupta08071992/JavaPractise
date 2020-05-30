import java.util.HashSet;

public class MultipleArrayUnion {

    public static void union(int[] ... inputArrays){
        HashSet unionSet=new HashSet();
        for(int[] inputArray:inputArrays){
            for(int input : inputArray){
                unionSet.add(input);
            }
        }
        System.out.println(unionSet);
    }

    public static void main(String[] args) {

    union(
                new int [] {1,2,4,3,7},
                new int [] {4,8,2,5},
                new int [] {6,1,7},
                new int [] {10,2,3,7,8,9}

        );

    }
}
