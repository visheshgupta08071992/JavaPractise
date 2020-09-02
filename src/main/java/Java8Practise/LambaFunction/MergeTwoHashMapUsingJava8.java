package Java8Practise.LambaFunction;

import java.util.HashMap;

//Your program should take two maps (which may have same keys) as input and
// merge them into single map.
// The values of same keys must be result of an applied merging function
// like adding values or concatenating values or selecting smallest or largest value if two keys are found same.

public class MergeTwoHashMapUsingJava8 {
    public static void main(String[] args) {
        //Map-1

        HashMap<String, Integer> subjectToStudentCountMap1 = new HashMap<>();

        subjectToStudentCountMap1.put("Maths", 45);
        subjectToStudentCountMap1.put("Physics", 57);
        subjectToStudentCountMap1.put("Chemistry", 52);
        subjectToStudentCountMap1.put("History", 41);

        //Map-2

        HashMap<String, Integer> subjectToStudentCountMap2 = new HashMap<>();

        subjectToStudentCountMap2.put("Economics", 49);
        subjectToStudentCountMap2.put("Maths", 42);
        subjectToStudentCountMap2.put("Biology", 41);
        subjectToStudentCountMap2.put("History", 55);

        //Merging Map-1 and Map-2 into Map-3
        //If any two keys are found same, their values are added

        HashMap<String, Integer> subjectToStudentCountMap3 = new HashMap<>(subjectToStudentCountMap1);

        subjectToStudentCountMap2.forEach((key, value) -> subjectToStudentCountMap1.merge(key, value, (v1, v2) -> {
            if(v1>v2){
                return v1;
            }
            else
            return v2;
        }));

        //Printing map1, map2 and map3

        System.out.println("Map 1 : "+subjectToStudentCountMap1);

        System.out.println("Map 2 : "+subjectToStudentCountMap2);

        System.out.println("Map 3 : "+subjectToStudentCountMap3);
    }
}
