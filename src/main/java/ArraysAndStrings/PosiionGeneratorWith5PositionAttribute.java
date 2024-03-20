package ArraysAndStrings;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class PosiionGeneratorWith5PositionAttribute {

    private static final Map<String, List<String>> IDENTIFIER_POOL = new HashMap<>();
    private static final List<Map<String, Integer>> ATTR_POOL = new ArrayList<>();
    private static final List<Map<String, Integer>> INTERNAL_ATTR_POOL = new ArrayList<>();

    static {
        IDENTIFIER_POOL.put("ticker", new ArrayList<>(Arrays.asList("QQ", "RR", "SS", "TT")));
        IDENTIFIER_POOL.put("cusip", new ArrayList<>(Arrays.asList("US49", "US50", "EU49", "EU50")));
        IDENTIFIER_POOL.put("sedol", new ArrayList<>(Arrays.asList("XYZ00", "XYZ01", "XYZ02", "XYZ03")));

        // Update ATTR_POOL to include 5 attributes
        ATTR_POOL.add(Collections.singletonMap("ant", 1));
        ATTR_POOL.add(Collections.singletonMap("bat", 2));
        ATTR_POOL.add(Collections.singletonMap("cat", 3));
        ATTR_POOL.add(Collections.singletonMap("dog", 4));
        ATTR_POOL.add(Collections.singletonMap("elephant", 5));

        // Update INTERNAL_ATTR_POOL to include 5 internal attributes
        INTERNAL_ATTR_POOL.add(Collections.singletonMap("Ann Arbor", 1));
        INTERNAL_ATTR_POOL.add(Collections.singletonMap("Boston", 2));
        INTERNAL_ATTR_POOL.add(Collections.singletonMap("Chicago", 3));
        INTERNAL_ATTR_POOL.add(Collections.singletonMap("Denver", 4));
        INTERNAL_ATTR_POOL.add(Collections.singletonMap("El Paso", 5));
    }

    private static final String[] CURRENCIES = {"USD", "EUR", "GBP", "CHF", "JPY"};
    private static final String[] SNAPSHOT_TYPES = {"OPEN", "CLOSE"};

    private static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private static <T> T getRandomElement(List<T> list) {
        return list.get(ThreadLocalRandom.current().nextInt(list.size()));
    }

    private static <K, V> Map<K, V> getRandomAttributes(List<Map<K, V>> attributesList, int count) {
        // Shuffle the list of attributes and select 'count' number of them
        Collections.shuffle(attributesList);
        Map<K, V> attributes = new LinkedHashMap<>();
        for (int i = 0; i < count; i++) {
            attributes.putAll(attributesList.get(i));
        }
        return attributes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.print("Enter the minimum number of positions per portfolio: ");
        int minPositions = scanner.nextInt();

        System.out.print("Enter the maximum number of positions per portfolio: ");
        int maxPositions = scanner.nextInt();

        System.out.print("Enter the asOfDate (YYYY-MM-DD): ");
        String asOfDate = scanner.next();

        int positionCount = getRandomInt(minPositions, maxPositions);
        List<Map<String, Object>> positions = new ArrayList<>();

        for (int positionId = 1; positionId <= positionCount; positionId++) {
            boolean isInvalidPosition = getRandomInt(0, 99) < 0; // Change this to the desired percentage
            String positionIdPrefix = isInvalidPosition ? "?" : "";

            String instrumentIdType = getRandomElement(new ArrayList<>(IDENTIFIER_POOL.keySet()));
            String instrumentId = getRandomElement(IDENTIFIER_POOL.get(instrumentIdType)) ;

            Map<String, Object> position = new LinkedHashMap<>();
            position.put("id", positionIdPrefix + "PMSJ" + positionId);
            position.put("quantity", getRandomInt(0, 1000));
            position.put("quantityType", "NumShares");

            LinkedHashMap<String, Object> instrument = new LinkedHashMap<>();
            LinkedHashMap<String, Object> primaryId = new LinkedHashMap<>();
            //primaryId.put("id", "IMSJ" + ThreadLocalRandom.current().nextInt(1, 100));
            primaryId.put("id", "IMSJ" + positionId);
            primaryId.put("idType", instrumentIdType.toUpperCase());
            instrument.put("primaryId", primaryId);
            instrument.put("attributes", getRandomAttributes(ATTR_POOL, 1)); // Ensure 1 attributes
            instrument.put("internalAttributes", getRandomAttributes(INTERNAL_ATTR_POOL, 1)); // Ensure 1 internal attributes
            instrument.put("blobType","RML3");
            instrument.put("blobData","BMSJ");

            position.put("instrument", instrument);
            position.put("attributes", getRandomAttributes(ATTR_POOL, 5)); // Ensure 5 attributes
            position.put("internalAttributes", getRandomAttributes(INTERNAL_ATTR_POOL, 5)); // Ensure 5 internal attributes

            positions.add(position);
        }

        String format = "json"; // Change this to "ndjson" if required
        String outputDirectory = "C:\\Users\\guptvis\\OneDrive\\OneDrive - MSCI Office 365\\Desktop\\PositionJson";
        String outputFile = outputDirectory + "\\position.json";

        switch (format) {
            case "json":
                try {
                    FileWriter fileWriter = new FileWriter(outputFile);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(gson.toJson(positions));
                    bufferedWriter.newLine(); // Add a newline between JSON objects in case of ndjson
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "ndjson":
                for (Map<String, Object> portfolio : positions) {
                    System.out.println(gson.toJson(portfolio));
                }
                break;
            default:
                System.out.println("Unsupported format: " + format);
        }
    }
}
