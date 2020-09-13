package SeleniumPractise.HandlingDropDowns;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ClariInterview {
	@Test
	public void maxProfit(){
		int [] input={50,55,65,70,45,80,35,20};
		//sort the Array
		//Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		//Find Minimum price of Stock
		int minPrice=input[0];
		int maxPrice=input[input.length-1];
		int minimumPriceIndex=0;
		int maxPriceIndex=0;
	    for(int i=0;i<input.length;i++){
	    	if(input[i]<minPrice && i<input.length-1){
	    		minPrice=input[i];
			    minimumPriceIndex=i;
		    }
		    if(input[i]>maxPrice){
			    maxPrice=input[i];
			    maxPriceIndex=i;
		    }
	    }


		System.out.println("MinPrice is  " + minPrice );
		System.out.println("MaxPrice is  " + maxPrice );
		System.out.println("MinPriceIndex :" + minimumPriceIndex);
		System.out.println("MaxPriceIndex :" + maxPriceIndex);




	}

}
