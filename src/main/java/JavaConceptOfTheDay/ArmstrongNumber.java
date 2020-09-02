package JavaConceptOfTheDay;

//A number is called an Armstrong number if it is equal to sum of its digits each raised to the power of number of
// digits in it. For example: 153, 371, 407, 9474, 54748 are some Armstrong numbers.
//153 = 13 + 53 + 33 = 1 + 125 + 27 = 153

import org.testng.annotations.Test;

public class ArmstrongNumber {

	@Test
	public void checkWhetherArmStrongNo(){
		int inputNumber=153;
		int inputNumber2=153;
		int inputNumber3=153;
		int digits=0;
		int rem;
		int sum=0;
		while(inputNumber>0){
			inputNumber=inputNumber/10;
			digits=digits+1;
		}
		while(inputNumber3>0){
			rem=inputNumber3%10;
			int remPower=1;
			for(int j=0;j<digits;j++){
				remPower=remPower*rem;
			}
			sum=sum+remPower;
			System.out.println(sum);
			inputNumber3=inputNumber3/10;
		}
		System.out.println(sum);
		System.out.println(inputNumber2);
		if(sum==inputNumber2){
			System.out.println("No is Armstrong");
		}
	}
}
