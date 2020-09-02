package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class CheckWhetherGivenNoIsBinaryOrNot {

	@Test
	public void checkNoIsBinary(){
		int no=105101;
		boolean flag=true;
		while(no>0){
			if((no%10) >1){
				flag=false;
				System.out.println("No is not binary");
				break;
			}
			no=no/10;
		}
		if(flag){
			System.out.println("No is Binary");
		}
	}
}
