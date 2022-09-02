package DSAPreparation.Grind75.ArrayMatrix;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
*
* Leetcode - https://leetcode.com/problems/set-matrix-zeroes/
* Solution - https://www.youtube.com/watch?v=zgaOU5aInOc&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=78
*  Solution which I refered - https://www.youtube.com/watch?v=djt9mwch-Xo
*
* */

public class SetMatrixZero {

    @Test
    public void setMatrixZero(){
        //int [][] arr={{1,1,1},{1,0,1},{1,1,1}};
        //Expected [[1,0,1],[0,0,0],[1,0,1]]
        int [][] arr={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        // Expected [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
        Set<Integer> rowWithZero= new HashSet<>();
        Set<Integer> columnWithZero= new HashSet<>();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    rowWithZero.add(i);
                    columnWithZero.add(j);
                }
            }
        }
        System.out.println(" Row with zero : " + rowWithZero);
        System.out.println(" Columns with zero : " + columnWithZero);

        for(int i=0;i< arr.length;i++){
            for(int j=0;j < arr[i].length;j++){
                if(rowWithZero.contains(i)){
                    for(int k=0;k<arr[0].length;k++){
                        arr[i][k]=0;
                    }
                }
                if(columnWithZero.contains(j)){
                    for(int m=0;m<arr.length;m++){
                        arr[m][j]=0;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    @Test
    public void setMatrixZeroBestApprch(){
        int [][] arr={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        // Expected [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

        int firstRow=1;
        int firstCoulmn=1;
        int noOfRows=arr.length;
        int noOfCols=arr[0].length;

        //Check whether any zero value present in first row,If yes set firstRow to zero
        int i=0;
        for(int j=0;j<noOfCols;j++){
            if(arr[i][j]==0){
                firstRow=0;
                break;
            }
        }
        //Check whether any zero value present in first column,If yes set firstColumn to zero
        int j=0;
        for(i=0;i<noOfRows;i++){
            if(arr[i][j]==0){
                firstCoulmn=0;
                break;
            }
        }

        // Set the Corresponding first row and first column header as zero if the inner matrix has zero

        for(i=1;i<noOfRows;i++){
            for(j=1;j<noOfCols;j++){
                if(arr[i][j]==0){
                    arr[0][j]=0;
                    arr[i][0]=0;
                }
            }
        }

        //Check whether the header row and header column is zero,If it is zero then make the
        //corresponding row and column zero. If column marker is zero then we need to make entire column
        // as zero, If row marker is zero we need to make entire row as zero.

        //If column marker is zero then setting entire column as zero
        for(j=1,i=0;j<noOfCols;j++){
            if(arr[i][j]==0){
                for(int m=1;m<noOfRows;m++){
                    arr[m][j]=0;
                }
            }
        }

        //If row marker is zero then setting entire row as zero
        for(i=1,j=0;i<noOfRows;i++){
            if(arr[i][j]==0){
                for(int n=1;n<noOfCols;n++){
                    arr[i][n]=0;
                }
            }
        }

        //If firstrow had zero then make entire first row zero
        if(firstRow==0){
            for(j=0,i=0;j<noOfCols;j++){
                arr[i][j]=0;
            }
        }

        //If firstColumn had zero then make entire first column zero
        if(firstCoulmn==0){
            for(j=0,i=0;i<noOfRows;i++){
                arr[i][j]=0;
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
