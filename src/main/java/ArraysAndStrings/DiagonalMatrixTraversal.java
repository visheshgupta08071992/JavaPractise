package ArraysAndStrings;

/*
* Question -> https://www.youtube.com/watch?v=rydBe9U-RtY&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=14
*
* Solution -> https://www.youtube.com/watch?v=lvRdFCMD_Ew&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=15
*
* https://leetcode.com/problems/diagonal-traverse/description/
*
* */

import org.testng.annotations.Test;

public class DiagonalMatrixTraversal {

    @Test
    public void diagonalTraverse(){
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        //Expected 1 5 9 2 6 3

        for(int g=0;g < arr[0].length;g++){
            for(int i=0,j=g;j < arr[0].length;i++,j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
