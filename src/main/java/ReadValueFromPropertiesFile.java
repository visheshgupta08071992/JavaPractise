import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadValueFromPropertiesFile {

    @Test
    public void readValueUsingFileReader() throws IOException {
        Properties prop=new Properties();
        FileReader propfile=new FileReader("/Users/vishesh.gupta/Desktop/JavaPractise/src/main/java/credentials.properties");
        prop.load(propfile);
        System.out.println("Username is :" + prop.getProperty("user"));
        System.out.println("Password is :" + prop.getProperty("password"));
        prop.setProperty("URL","www.google.com");
    }

    @Test
    public void readValueUsingFileInputStream() throws IOException {
        Properties prop=new Properties();
        FileInputStream propfile=new FileInputStream("/Users/vishesh.gupta/Desktop/JavaPractise/src/main/java/credentials.properties");
        prop.load(propfile);
        System.out.println("Username is :" + prop.getProperty("user"));
        System.out.println("Password is :" + prop.getProperty("password"));
    }
}
