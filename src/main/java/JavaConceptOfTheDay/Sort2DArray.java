package JavaConceptOfTheDay;

import org.junit.Test;

import java.util.Arrays;

public class Sort2DArray {

    @Test
    public void sortOnColumn0Ascending(){
        int[][] twoDArray = {
                {5, 2, 9},
                {8, 3, 1},
                {4, 7, 6}
        };

        //Sort on Column 0
        Arrays.sort(twoDArray,(a,b) ->{
            return a[0] - b[0];
        });
        System.out.println(Arrays.deepToString(twoDArray)); // [[4, 7, 6], [5, 2, 9], [8, 3, 1]]
    }

    @Test
    public void sortEachRowAscending(){
        int[][] twoDArray = {
                {5, 2, 9},
                {8, 3, 1},
                {4, 7, 6}
        };
        //Sort each row individually
        for(int [] row:twoDArray){
            Arrays.sort(row);
        }
        System.out.println(Arrays.deepToString(twoDArray)); // [[2, 5, 9], [1, 3, 8], [4, 6, 7]]
    }
}
