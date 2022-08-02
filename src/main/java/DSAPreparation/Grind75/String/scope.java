package DSAPreparation.Grind75.String;

import org.testng.annotations.Test;

//This program is written to understand the scope of variable
public class scope {
    @Test
    public void scopeTest(){
        int i=0;
        increseScope(i);
        System.out.println(i);
    }

    public void increseScope(int i){
        i=i+1;
        System.out.println(i);
    }
}
