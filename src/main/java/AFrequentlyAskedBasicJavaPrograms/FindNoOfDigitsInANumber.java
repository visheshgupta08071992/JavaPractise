package AFrequentlyAskedBasicJavaPrograms;

import org.testng.annotations.Test;

public class FindNoOfDigitsInANumber {

    @Test
    public void findNoOfDigits(){
        int no=12345;
        int count=0;

        if(no<0){
            no=no*-1;
        }
        if(no==0){
            System.out.println("No of Digits in a No is : " + 1);
            return;
        }
        else{
            while(no>0){
                no=no/10;
                count++;
            }
        }
        System.out.println(count);
    }
}
