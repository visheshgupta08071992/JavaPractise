package ArraysAndStrings;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class TreeImport {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of trees:");
            int numTrees = scanner.nextInt();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonArray treesArray = new JsonArray();

            for (int i = 1; i <= numTrees; i++) {
                JsonObject treeObject = new JsonObject();
                treeObject.addProperty("id", "Tree" + i);
                treeObject.addProperty("name", "system");
                treeObject.addProperty("description", "system");
                treeObject.addProperty("baseCurrency", "USD");
                treeObject.addProperty("owner", "system");
                treeObject.addProperty("portfolioType", "Tree");
                treeObject.addProperty("asOfDate", "2021-01-01");
                treeObject.addProperty("source", "system");

                JsonArray treeNodesArray = new JsonArray();
                JsonObject treeNodeObject = new JsonObject();
                JsonObject portfolioReferenceObject = new JsonObject();
                portfolioReferenceObject.addProperty("portfolioId", "PORT" + i);
                treeNodeObject.add("portfolioReference", portfolioReferenceObject);
                treeNodeObject.addProperty("assignedValue", "USD 1");
                treeNodeObject.addProperty("weight", 1);
                treeNodeObject.addProperty("scale", 1);
                treeNodesArray.add(treeNodeObject);
                treeObject.add("treeNodes", treeNodesArray);

                treesArray.add(treeObject);
            }

         //   System.out.println(gson.toJson(treesArray));
            String jsonOutput = gson.toJson(treesArray);
            String format = "json"; // Change this to "ndjson" if required
            String outputDirectory = "C:\\Users\\guptvis\\OneDrive\\OneDrive - MSCI Office 365\\Desktop\\PositionJson";
            String outputFile = outputDirectory + "\\Importtree.json";

            try (FileWriter file = new FileWriter(outputFile)) {
                file.write(jsonOutput);
                System.out.println("Tree JSON structure created and stored in 'tree.json' file.");
            } catch (IOException e) {
                System.err.println("Error writing JSON to file: " + e.getMessage());
            }
        }
    }

