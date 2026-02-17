package AFrequentlyAskedBasicJavaPrograms;

import org.testng.annotations.Test;

public class FibonaccinNo {

    @Test
    public void printFibonacci(){
        //Prints first 15 fibonacci nos
        int n=15;
        int first=0;
        int second=1;
        int next;
        for(int i=1;i<=n;i++){
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }
}
