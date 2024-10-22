package ArraysAndStrings;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;





    public class FilterGroupGenerator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of FilterGroups:");
            int numFilterGroups = scanner.nextInt();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonArray filterGroupsArray = new JsonArray();

            for (int i = 1; i <= numFilterGroups; i++) {
                JsonObject filterGroupObject = new JsonObject();
                filterGroupObject.addProperty("id", "FilterGroup" + i);
                filterGroupObject.addProperty("name", "filter-group");
                filterGroupObject.addProperty("description", "A filter group example");
                filterGroupObject.addProperty("portfolioType", "FilterGroup");

                JsonObject attributesObject = new JsonObject();
                attributesObject.addProperty("customAttr1", false);
                attributesObject.addProperty("customAttr2", 1.5);
                filterGroupObject.add("attributes", attributesObject);

                filterGroupObject.addProperty("filterId", "TestAnt");

                JsonArray portfolioReferencesArray = new JsonArray();
                JsonObject portfolioReferenceObject = new JsonObject();
                portfolioReferenceObject.addProperty("portfolioId", "PORT" + i);
                portfolioReferencesArray.add(portfolioReferenceObject);
                filterGroupObject.add("portfolioReferences", portfolioReferencesArray);

                filterGroupsArray.add(filterGroupObject);
            }

            String jsonOutput = gson.toJson(filterGroupsArray);
            String format = "json"; // Change this to "ndjson" if required
            String outputDirectory = "C:\\Users\\guptvis\\OneDrive\\OneDrive - MSCI Office 365\\Desktop\\PositionJson";
            String outputFile = outputDirectory + "\\ImportFilterGroup.json";

            try (FileWriter file = new FileWriter(outputFile)) {
                file.write(jsonOutput);
                System.out.println("FilterGroup JSON structure created and stored in 'ImportFilterGroup.json' file.");
            } catch (IOException e) {
                System.err.println("Error writing JSON to file: " + e.getMessage());
            }
        }
    }

