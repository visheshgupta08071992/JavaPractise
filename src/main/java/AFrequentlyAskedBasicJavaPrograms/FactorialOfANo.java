package AFrequentlyAskedBasicJavaPrograms;

import org.testng.annotations.Test;

public class FactorialOfANo {

    @Test
    public void findFactorial(){

        int n=5;
        int fact=1;
        for(int i=n;i>0;i--){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
