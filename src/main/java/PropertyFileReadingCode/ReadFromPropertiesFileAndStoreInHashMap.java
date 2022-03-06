package PropertyFileReadingCode;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ReadFromPropertiesFileAndStoreInHashMap {

    @Test
    public void readFromPropertiesFileAndStoreInMap() throws IOException {

        Properties properties=new Properties();
        FileInputStream fileInputStream = new FileInputStream( "./src/main/java/PropertyFileReadingCode/config.properties");

        properties.load(fileInputStream);

        Map<String, String> map = new HashMap<>();

        for(Map.Entry<Object, Object> entry : properties.entrySet()){
            map.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue()));
        }
        System.out.println(map);
        System.out.println(map.get("user"));
    }
}
