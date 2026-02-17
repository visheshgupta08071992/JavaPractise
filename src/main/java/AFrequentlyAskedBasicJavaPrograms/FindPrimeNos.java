package AFrequentlyAskedBasicJavaPrograms;

/*
A prime no is a no which is only divisible by itself

Key Points:

1 is not a prime no.
2 is the smallest and only even prime number.

Examples of Prime NO:
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, ...

* */

import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindPrimeNos {

    @Test
    public void primeNos(){
       /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Prime No you want to identify : ");
        int n = sc.nextInt();
        */

        int n=100;

         for(int i=1;i<=n;i++){
             if(isPrime(i)){
                 System.out.println(i);
             }
         }
    }

    public Boolean isPrime(int no){
        if(no<=1){
            return false;
        }
        if(no==2){
            return true;
        }
        else{

            /*

            We are iterating till n/2 because Suppose num = 20.
            Divisors of 20 are 1, 2, 4, 5, 10, 20.
            The largest possible factor (other than the number itself) is 10, which is num / 2.

            */
            for(int i=2;i<=no/2;i++){
                if(no%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
