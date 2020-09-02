package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class CheckEqualityOfTwoArrays {

    @Test
    public void checkEqualityOfArrays(){
        String [] firstArray={"Vishesh","1sanDesh"};
        String [] secondArray={"vishesh","sandesh"};
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
        }
        if(flag){
            System.out.println("Both Arrays are equal");
        }
    }
}
