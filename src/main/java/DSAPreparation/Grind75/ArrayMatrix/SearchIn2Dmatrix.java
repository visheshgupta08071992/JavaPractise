package DSAPreparation.Grind75.ArrayMatrix;

/*
* Leetcode - https://leetcode.com/problems/search-a-2d-matrix/
*
*
* Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.


Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
*
*
* */

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchIn2Dmatrix {

    @Test
    public void testBruteForce(){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=16;

        int rows= matrix.length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target){
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }

    @Test
    //Since matrix is sorted we should we binary search
    public void testUsingBinarySearch(){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=16;

        int rows= matrix.length;

        for(int i=0;i<rows;i++){
            int start=0;
            int end=matrix[i].length -1;
            int mid;

            while(start<=end){
                mid = (start + end)/2;
                if(matrix[i][mid]==target){
                    System.out.println("true");
                    return;
                }
                else if(matrix[i][mid] > target){
                    end=mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        System.out.println("false");
    }
}
