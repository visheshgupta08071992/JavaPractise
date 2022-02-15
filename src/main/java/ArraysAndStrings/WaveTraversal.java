package ArraysAndStrings;

import org.testng.annotations.Test;


/*
* Question -> https://www.youtube.com/watch?v=nUUc9DKTBdY&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=4
* Solution -> https://www.youtube.com/watch?v=_olQ9Rrnm_c&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=5
*
*
* */
public class WaveTraversal {

    @Test
    public void waveTraversal(){

        int [][] arr= {{1,3,5},{2,4,6}};
        // Expected {{1,4,5},{2,3,6}}

        for(int j=0;j<arr[0].length;j++){
           if(j%2==0){
               for(int i=0;i<arr.length;i++){
                   System.out.println(arr[i][j]);
               }
           }
           else{
               for(int i=arr.length-1;i>=0;i--){
                   System.out.println(arr[i][j]);
               }
           }
        }

    }
}
