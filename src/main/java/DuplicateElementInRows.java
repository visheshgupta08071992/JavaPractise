import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInRows {

    public static void main(String[] args) {

        // An input array
        int arrayValues[][] = { { 4, 67, 34, 90 }, { 9, 4, 11, 34 }, { 6, 34, 9, 4 }, { 78, 87, 4, 34 } };

        // A set to store expected duplicates
        Set<Integer> expectedDuplicates = new HashSet<Integer>();

        // To store next row elements
        Set<Integer> deleteRow = new HashSet<Integer>();

        boolean duplicates=true;

        // Iteration starts from here
        for (int i = 0; i < arrayValues.length; i++) {
            // This will work for if every row has different number of elements
            for (int j = 0; j < arrayValues[i].length; j++) {
                // Assuming elements of first row are duplicates
                if (i == 0)
                    expectedDuplicates.add(arrayValues[i][j]);

                    // If not first row, add in another HashSet
                else {
                    deleteRow.add(arrayValues[i][j]);
                }

            }

            // Intersection should be avoided for first row
            if (i != 0) {
                // Intersection of two sets
                expectedDuplicates.retainAll(deleteRow);
                // Emptying deleteRow
                deleteRow.clear();

                // Check if intersection makes expectedDuplicates size 0.
                if (expectedDuplicates.size() == 0) {
                    duplicates=false;
                    break;
                }
            }

        }

        // Printing Duplicates
        if(duplicates)
            System.out.println("Duplicated elemets in all rows: "+expectedDuplicates);
        else
            System.out.println("There is no duplicate elements.");


    }
}
