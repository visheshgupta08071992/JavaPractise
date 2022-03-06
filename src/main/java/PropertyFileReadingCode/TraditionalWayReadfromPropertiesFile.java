package PropertyFileReadingCode;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TraditionalWayReadfromPropertiesFile {

    @Test
    public void readFromPropertiesFile() throws IOException {
        Properties properties=new Properties();

        //Using Absolute path
        //FileInputStream fileInputStream = new FileInputStream("C:\\Users\\guptvis\\Desktop\\JavaPractise\\src\\main\\java\\PropertyFileReadingCode\\config.properties");

        //Using System directory to have path till the project directory
        //FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/PropertyFileReadingCode/config.properties");

        //.represent project folder directory
        FileInputStream fileInputStream = new FileInputStream( "./src/main/java/PropertyFileReadingCode/config.properties");

        properties.load(fileInputStream);
        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("age"));
        System.out.println(properties.getProperty("expertise"));
        System.out.println(properties.getProperty("married"));

       /*One of the disadvantage of reading from properties file using the above code is
       * everything is written in form of string even if it is boolean or integer as shown below
       *
       * Another disadvantage is we need to handle all the exceptions like IOException,FileNotFoundException
       *
       *
       * */

        if(Integer.parseInt(properties.getProperty("age"))==77){
            System.out.println("Age is correct");
        }
        if(properties.getProperty("married").equalsIgnoreCase("true")){
            System.out.println("He is married");
        }
    }
}
