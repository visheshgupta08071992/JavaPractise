package ArraysAndStrings;

import org.testng.annotations.Test;

import java.util.Arrays;

/*
* Solution in place for n*n matrix - https://www.youtube.com/watch?v=SoxrXQbhCPI&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=11
* solution for m*n matrix - https://www.youtube.com/watch?v=wtYv5vg6iD8
* */

public class TransposeOfMatrix {

    @Test
    /*Use below code of creating additional matrix when no of rows and columsn are not equal
    and then we can change the no rows with columns and columns with rows in Tranpsose matrix */

    /*This code also works when no of rows and columns are equal but would take additional space*/
    public void transpose(){
        int [][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        //Expected -> {{1,5,9},{2,6,10},{3,7,11},{4,8,12}}
        int rows= arr.length;
        int columns=arr[0].length;

        int [][] transpose= new int[columns][rows];

        for(int i=0;i < transpose.length;i++){
            for(int j=0;j < transpose[0].length;j++){
                transpose[i][j]=arr[j][i];
            }
        }
        System.out.println(Arrays.deepToString(transpose));
    }

    @Test
    /*
    * This code is only applicable when no of rows equals no of columns
    *
    * */
    public void transposeWithoutAdditionalSpace(){
        int [][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        //Expected {{1,5,9,13},{2,6,10,14},{3,7,11,15},{4,8,12,16}}

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
