package JavaConceptOfTheDay;

import java.util.Arrays;

import org.testng.annotations.Test;

public class CheckEqualityOfTwoArrays {

    @Test
    public void checkEqualityOfArrays(){
        String [] firstArray={"Vishesh","sandesh"};
        String [] secondArray={"sandesh","vishesh"};
        boolean flag=true;
        if(firstArray.length == secondArray.length){
            for(int i=0;i<firstArray.length;i++){
                if(!firstArray[i].equalsIgnoreCase(secondArray[i])){
                    System.out.println("Arrays are not equal");
                    flag=false;
                    break;
                }
            }
        }
        else{
            System.out.println("Arrays are not equal");
            flag=false;
        }
        if(flag){
            System.out.println("Both Arrays are equal");
        }
    }

    @Test
    public void checkEqualityOfIntegerArray(){
        int [] array1={1,2,3,4,5};
        int [] array2={1,2,3,4,5};
        Boolean flag=true;
        if(array1.length==array2.length){
            for(int i=0;i<array1.length;i++){
                if(array1[i]!=array2[i]){
                    System.out.println("Array " + Arrays.toString(array1) + " is not equal to " + Arrays.toString(array2));
                    flag=false;
                    break;
                }
            }

        }
        else{
            System.out.println("Array " + Arrays.toString(array1) + " is not equal to " + Arrays.toString(array2));
            flag=false;
        }
        if(flag){
            System.out.println("Array " + Arrays.toString(array1) + " is equal to " + Arrays.toString(array2));
        }
    }
}
