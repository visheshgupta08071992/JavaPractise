import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class CreateNewPropertyFile {

    @Test
    public void createNewPropertyFile() throws IOException {

        Properties p=new Properties();
        p.setProperty("name","Sonoo Jaiswal123");
        p.setProperty("email","sonoojaiswal@javatpoint.com");

        p.store(new FileWriter("info.properties"),"Javatpoint Properties Example");

    }
}
