package JavaConceptOfTheDay;


//The Given Program is used to find a Fibonacci No at a Given Index.
//The Concept is clearly explained in https://www.youtube.com/watch?v=_I0zspi93ow
import java.util.Scanner;

public class ProgramToFindFibonacciAtAGivenIndex {

	public static void main(String[] args) {
		System.out.println("Please Enter the index for which you wish to find Fibonacci \n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long no=fibonaciAtGivenIndex(n);
		System.out.println("Fibonacci at Index " + n + " is " + no);
	}

	public static long fibonaciAtGivenIndex(int index){
		if(index==0){
			return 0;
		}
		else if(index==1){
			return 1;
		}
		else{
			return fibonaciAtGivenIndex(index-1) + fibonaciAtGivenIndex(index-2);
		}
	}
}
