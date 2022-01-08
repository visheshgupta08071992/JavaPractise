package JavaConceptOfTheDay;

import org.testng.annotations.Test;

public class UnderStandNumberFormatException {

    //Convert Valid numeric string into number
    @Test
    public void convertValidString(){
        String no="123";
        int number=Integer.parseInt(no);
        System.out.println("String no is : " + no);
        System.out.println("Integer no is : " + number);
    }

    //Convert InValid numeric string into number which would give no format exception
    //NumberFormatException is run time exception
    @Test
    public void convertInvalidValidString(){
        String no="123Invalid";
        //NumberFormatException is thrown here
        int number=Integer.parseInt(no);
        System.out.println("String no is : " + no);
        System.out.println("Integer no is : " + number);
    }

    @Test
    public void convertNull(){
        //NumberFormatException is thrown here
        try{
            int number=Integer.parseInt(null);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }

    }
}
