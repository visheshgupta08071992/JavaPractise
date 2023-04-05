package JavaConceptOfTheDay;

import org.testng.annotations.Test;

import java.math.BigDecimal;

/*
* https://medium.com/@reachansari/use-of-bigdecimal-instead-double-in-java-for-financial-systems-591440bdd5f4
* */

public class BigDecimalConstructer {

    @Test
    public void understandingBigDecimalConstructer(){


        BigDecimal bigUsingBigDecimalValueOf=BigDecimal.valueOf(1.123456789123456789);
        BigDecimal bigDecimalusingDoubleConstructer=new BigDecimal(1.123456789123456789);

        /*
        * we should always use BigDecimalStringConstructor to avoid floating point errors
        *
        *
        * */
        BigDecimal bigDecimalusingString=new BigDecimal("1.123456789123456789");

        //Expected output :1.123456789123456789

        System.out.println("bigUsingBigDecimalValueOf - " + bigUsingBigDecimalValueOf);

        System.out.println("bigDecimalusingDoubleConstructer - " + bigDecimalusingDoubleConstructer);

        System.out.println("bigDecimalusingString - " + bigDecimalusingString);

    }
}
