package ArraysAndStrings;

/*
* Given a matrix,traverse it spirally and print it
* Question -> https://www.youtube.com/watch?v=UPEZBPh1UcU&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=6
* Solution -> https://www.youtube.com/watch?v=SVFXEqn3Ceo&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=7
*
*
* */

import org.testng.annotations.Test;

public class PrintMatrixInSpiral {

    @Test
    public void printMatrixInSpiralWay(){
        int [][] arr={{1,4,7,10,13},{2,5,8,11,14},{3,6,9,12,15}};
        //Expected op -> 1 2 3 6 9 12 15 14 13 10 7 4 5 8 11

        int minRow=0;
        int minCol=0;
        int maxRow=arr.length - 1;
        int maxClo=arr[0].length - 1;
        int totalElementsInMatrix=(maxRow+1) * (maxClo + 1);
        int count=0;

        while(count < totalElementsInMatrix){

            for(int i=minRow;i<=maxRow && count < totalElementsInMatrix;i++){
                System.out.println(arr[i][minCol]);
                count++;
            }
            minCol=minCol + 1;
            for(int j= minCol;j<=maxClo && count < totalElementsInMatrix;j++){
                System.out.println(arr[maxRow][j]);
                count++;
            }
            maxRow=maxRow - 1;
            for(int i=maxRow;i>=minRow && count < totalElementsInMatrix;i--){
                System.out.println(arr[i][maxClo]);
                count++;
            }
            maxClo=maxClo -1;
            for(int j=maxClo;j>=minCol && count < totalElementsInMatrix;j--){
                System.out.println(arr[minRow][j]);
                count++;
            }
            minRow= minRow + 1;
        }
    }
}
