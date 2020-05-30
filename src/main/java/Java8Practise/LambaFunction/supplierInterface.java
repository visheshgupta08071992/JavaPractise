package Java8Practise.LambaFunction;
import static java.lang.System.*;

import java.util.function.Supplier;


public class supplierInterface {
    public static void main(String[]args){
        Supplier<Double> random = Math::random;
        out.println(random.get());
    }


}
