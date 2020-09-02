import java.util.Map;
import java.util.Properties;

import org.testng.annotations.Test;

public class GetAllPropertiesOfSystem {

    @Test
    public void getPropertiesOfSystem(){
        Properties p=System.getProperties();
        for (Map.Entry values:p.entrySet()) {
            System.out.println(values.getKey() + "      " + values.getValue());
        }
    }

    @Test
    public void getPropertiesOfSystemUsingJava8(){
        Properties p=System.getProperties();
        p.forEach((k,v) -> System.out.println(k + "   " + v ));
    }

}
