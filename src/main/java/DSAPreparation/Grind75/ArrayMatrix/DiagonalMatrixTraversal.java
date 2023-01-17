package DSAPreparation.Grind75.ArrayMatrix;

import org.testng.annotations.Test;

import java.util.Arrays;


/*
* Leetcode - https://leetcode.com/problems/diagonal-traverse/description/
* Explanation -  https://www.youtube.com/watch?v=-FEeaf3ufIE
*
* In the given program ensure the 1st condition should be for last row and last column within if
* and else statement.
*
* */

public class DiagonalMatrixTraversal {

    @Test
    public void bestApproach(){
       int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        if(mat.length==0){
            System.out.println("Empty Matrix");
            return;
        }

        int rowLength = mat.length;
        int colLength =mat[0].length;
        int [] result = new int[rowLength*colLength];
        int row=0;
        int col=0;

        for(int i=0;i<result.length;i++){
            result[i] = mat[row][col];

            //we need to move downward if row + col is odd
            if((row + col)%2 !=0){
                //If while moving downward we reached last row then increase column
                if(row == rowLength -1){
                    col++;
                }
                //If while moving downward we reached zeroth column then increase row
                else if(col==0){
                    row++;
                }
                else{
                    row++;
                    col--;
                }

            }
            //we need to move upward if row + col is even
            else{
                //If while moving upward we reached last column then increase row
                if(col==colLength -1){
                    row++;
                }
                //If while moving upward we reached first row then increase column
                else if(row==0){
                    col++;
                }
                else{
                    row--;
                    col++;
                }

            }
        }
        System.out.println(Arrays.toString(result));
    }
}
