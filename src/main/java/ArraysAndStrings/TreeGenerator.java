package ArraysAndStrings;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class TreeGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Tree nodes: ");
        int numNodes = scanner.nextInt();

        JsonArray treeNodes = new JsonArray();
        for (int i = 1; i <= numNodes; i++) {
            JsonObject treeNode = new JsonObject();
            JsonObject portfolioReference = new JsonObject();
            portfolioReference.addProperty("portfolioId", "P" + i);

            treeNode.add("portfolioReference", portfolioReference);
            treeNode.addProperty("assignedValue", "USD 1");
            treeNode.addProperty("weight", 1);
            treeNode.addProperty("scale", 1);

            treeNodes.add(treeNode);
        }

        JsonObject tree = new JsonObject();
        tree.addProperty("id", "T1");
        tree.addProperty("name", "system");
        tree.addProperty("description", "system");
        tree.addProperty("baseCurrency", "USD");
        tree.addProperty("owner", "system");
        tree.addProperty("portfolioType", "Tree");
        tree.addProperty("asOfDate", "2021-01-01");
        tree.addProperty("source", "system");
        tree.add("treeNodes", treeNodes);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonOutput = gson.toJson(tree);


        String format = "json"; // Change this to "ndjson" if required
        String outputDirectory = "C:\\Users\\guptvis\\OneDrive\\OneDrive - MSCI Office 365\\Desktop\\PositionJson";
        String outputFile = outputDirectory + "\\tree.json";

        try (FileWriter file = new FileWriter(outputFile)) {
            file.write(jsonOutput);
            System.out.println("Tree JSON structure created and stored in 'tree.json' file.");
        } catch (IOException e) {
            System.err.println("Error writing JSON to file: " + e.getMessage());
        }
    }
}