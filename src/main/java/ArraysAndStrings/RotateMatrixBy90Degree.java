package ArraysAndStrings;


import org.testng.annotations.Test;

import java.util.Arrays;

/*
* Question -> https://www.youtube.com/watch?v=0qj4kRcuKqo&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=10
* Solution -> https://www.youtube.com/watch?v=SoxrXQbhCPI&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=11
* */
public class RotateMatrixBy90Degree {

    @Test

    public void rotateMatrix() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        //Expected -> {{9,5,1},{10,6,2},{11,7,3},{12,8,4}}
        int rows = arr.length;
        int columns = arr[0].length;

        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        for(int i=0;i<transpose.length;i++){
            int start=0;
            int end=transpose[i].length -1;
            while(start < end){
                int temp = transpose[i][start];
                transpose[i][start]=transpose[i][end];
                transpose[i][end]=temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.deepToString(transpose));
    }
}
