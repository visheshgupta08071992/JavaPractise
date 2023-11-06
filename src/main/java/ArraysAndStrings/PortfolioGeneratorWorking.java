package ArraysAndStrings;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class PortfolioGeneratorWorking {

    private static final Map<String, List<String>> IDENTIFIER_POOL = new HashMap<>();
    private static final List<Map<String, Integer>> ATTR_POOL = new ArrayList<>();
    private static final List<Map<String, Integer>> INTERNAL_ATTR_POOL = new ArrayList<>();

    static {
        IDENTIFIER_POOL.put("ticker", new ArrayList<>(Arrays.asList("QQ", "RR", "SS", "TT")));
        IDENTIFIER_POOL.put("cusip", new ArrayList<>(Arrays.asList("US49", "US50", "EU49", "EU50")));
        IDENTIFIER_POOL.put("sedol", new ArrayList<>(Arrays.asList("XYZ00", "XYZ01", "XYZ02", "XYZ03")));

        ATTR_POOL.add(Collections.singletonMap("ant", 1));
        ATTR_POOL.add(Collections.singletonMap("bat", 2));
        // Add more attributes here...

        INTERNAL_ATTR_POOL.add(Collections.singletonMap("Ann Arbor", 1));
        INTERNAL_ATTR_POOL.add(Collections.singletonMap("Boston", 2));
        // Add more internal attributes here...
    }

    private static final String[] CURRENCIES = {"USD", "EUR", "GBP", "CHF", "JPY"};
    private static final String[] SNAPSHOT_TYPES = {"OPEN", "CLOSE"};

    private static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private static <T> T getRandomElement(List<T> list) {
        return list.get(ThreadLocalRandom.current().nextInt(list.size()));
    }

    private static <K, V> Map<K, V> getRandomAttributes(List<Map<K, V>> attributesList) {
        Collections.shuffle(attributesList);
        return attributesList.get(0);
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        System.out.print("Enter the number of portfolios to generate: ");
        int numPortfolios = scanner.nextInt();

        System.out.print("Enter the minimum number of positions per portfolio: ");
        int minPositions = scanner.nextInt();

        System.out.print("Enter the maximum number of positions per portfolio: ");
        int maxPositions = scanner.nextInt();

        System.out.print("Enter the asOfDate (YYYY-MM-DD): ");
        String asOfDate = scanner.next();


        System.out.print("Do you want to set snapshotType (yes/no): . snapshotType would be set to OPEN if typed yes: ");
        String input = scanner.next();
        boolean setSnapshotTypeOpen = input.equalsIgnoreCase("yes");

        List<Map<String, Object>> portfolios = new ArrayList<>();

        for (int portfolioId = 1; portfolioId <= numPortfolios; portfolioId++) {
            String baseCurrency = getRandomElement(Arrays.asList(CURRENCIES));
            String localCurrency = getRandomElement(Arrays.asList(CURRENCIES));

            boolean isInvalidPortfolio = getRandomInt(0, 99) < 0; // Change this to the desired percentage
            String portfolioIdPrefix = isInvalidPortfolio ? "?" : "";

            Map<String, Object> portfolio = new LinkedHashMap<>();
            portfolio.put("id", portfolioIdPrefix + "portfolio" + portfolioId);
            portfolio.put("portfolioType", "Base");
            portfolio.put("name", "Name-" + portfolioId);
            portfolio.put("description", "Sample Portfolio " + portfolioId);
            portfolio.put("source", "Source-" + portfolioId);
            portfolio.put("owner", "omps");
            portfolio.put("asOfDate", asOfDate);
            portfolio.put("baseCurrency", baseCurrency);
            portfolio.put("attributes", getRandomAttributes(ATTR_POOL));
            portfolio.put("internalAttributes", getRandomAttributes(INTERNAL_ATTR_POOL));

            String snapshotType = getRandomElement(Arrays.asList(SNAPSHOT_TYPES));
            if (setSnapshotTypeOpen) {
                portfolio.put("snapshotType", "OPEN");
            }

            int positionCount = getRandomInt(minPositions, maxPositions);
            List<Map<String, Object>> positions = new ArrayList<>();

            for (int positionId = 1; positionId <= positionCount; positionId++) {
                boolean isInvalidPosition = getRandomInt(0, 99) < 0; // Change this to the desired percentage
                String positionIdPrefix = isInvalidPosition ? "?" : "";

                String instrumentIdType = getRandomElement(new ArrayList<>(IDENTIFIER_POOL.keySet()));
                String instrumentId = getRandomElement(IDENTIFIER_POOL.get(instrumentIdType));

                Map<String, Object> position = new LinkedHashMap<>();
                position.put("id", positionIdPrefix + "PMSJ" + positionId);
                position.put("quantity", getRandomInt(0, 1000));
                position.put("quantityType", "NumShares");

                Map<String, Object> instrument = new HashMap<>();
                Map<String, Object> primaryId = new HashMap<>();
                primaryId.put("id", "IMSJ" + instrumentId);
                primaryId.put("idType", instrumentIdType.toUpperCase());
                instrument.put("primaryId", primaryId);
                instrument.put("attributes", getRandomAttributes(ATTR_POOL));
                instrument.put("internalAttributes", getRandomAttributes(INTERNAL_ATTR_POOL));

                position.put("instrument", instrument);
                position.put("attributes", getRandomAttributes(ATTR_POOL));
                position.put("internalAttributes", getRandomAttributes(INTERNAL_ATTR_POOL));

                positions.add(position);
            }


            portfolio.put("positions", positions);


            portfolios.add(portfolio);
        }

        String format = "json"; // Change this to "ndjson" if required

        switch (format) {
            case "json":
                System.out.println(gson.toJson(portfolios));
                break;
            case "ndjson":
                for (Map<String, Object> portfolio : portfolios) {
                    System.out.println(gson.toJson(portfolio));
                }
                break;
            default:
                System.out.println("Unsupported format: " + format);
        }
    }
}