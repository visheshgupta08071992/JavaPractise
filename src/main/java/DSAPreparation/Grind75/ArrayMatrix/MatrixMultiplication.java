package DSAPreparation.Grind75.ArrayMatrix;


import org.testng.annotations.Test;

import java.util.Arrays;

// Search 2D Arrays in pepcoding
//Question -> https://nados.io/article/matrix-multiplication
//Matrix Multiplication Solution -> https://www.youtube.com/watch?v=0dGuTLr6xT4
//Given two matrix find the product of both the Matrix
//Matrix can only be multiplied if column of first matrix matches with row of second matrix
public class MatrixMultiplication {

    @Test
    public void matrixMultiplication(){
        int [][] matrix1 = {{1,2},{3,4}}; // 2*2
        int [][] matrix2 = {{1,3,5},{2,4,6}}; // 2*3
        //Expected {{5,11,17},{11,25,31}}
        int [][] product=new int[matrix1.length][matrix2[0].length];
        //Check whether Matrix can be multiplied
        if(matrix1[0].length == matrix2.length){
            for(int i=0;i<product.length;i++){
                for(int j=0;j<product[i].length;j++){
                    for(int k=0;k< matrix2.length;k++){
                        product[i][j] += (matrix1[i][k] * matrix2[k][j]);
                    }
                }
            }

            for(int i=0;i<product.length;i++){
                for(int j=0;j<product[i].length;j++){
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }

            //Printing 2D using for loop

            //Printing 2D array using Arrays method
            System.out.println(Arrays.deepToString(product));
        }
        else{
            System.out.println("Matrix cannot be multiplied");
        }

    }
}
