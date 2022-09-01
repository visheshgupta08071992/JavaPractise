package DSAPreparation.Grind75.ArrayMatrix;

/*
* LeetCode - https://leetcode.com/problems/rotate-image/
*
*
* You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.



Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Example 2:


Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
*
*
* */

import org.testng.annotations.Test;

import java.util.Arrays;

public class RotatematrixBy90Degree {

    @Test
    public void rotate(){
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        /*
* For Rotating matrix first we need to Transpose the Matrix and Once the matrix is transposed
then row by row we need to replace value of first column with value of last column, value of 2nd column with value of
end last column and so on

 Since we need to rotate matrix inPlace we would not be using any other additional matrix for even transpose */


        /*Transposing the matrix*/

        // The given inPlcae transpose only works as matrix is of n*n length

        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        // Now row by row we need to replace value of first column with value of last column, value of 2nd column with value of
//end last column and so on

        for(int i=0;i<matrix.length;i++){
            int start=0;
            int end=matrix[0].length - 1;

            while(start<end){
                int temp = matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
