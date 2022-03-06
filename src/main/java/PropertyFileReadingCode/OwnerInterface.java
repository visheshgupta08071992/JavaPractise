package PropertyFileReadingCode;

import org.aeonbits.owner.Config;

import java.util.List;

@Config.Sources(value="file:./src/main/java/PropertyFileReadingCode/config.properties")
public interface OwnerInterface extends Config {
    String user();
    int age();
    boolean married();
    List<String> expertise();
}
