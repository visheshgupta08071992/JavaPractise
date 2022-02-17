package ArraysAndStrings;


import org.testng.annotations.Test;

/*
*
*Question : https://www.youtube.com/watch?v=FnywCfCcMRk&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=8
*Solution : https://www.youtube.com/watch?v=FUBlb360kqU&list=PL-Jc9J83PIiFkOETg2Ybq-FMuJjkZSGeH&index=9
* */
public class ExitPointOfmatrix {

    @Test
    public void getExitPoint(){
        int [][] arr={{0,1,0,1},{0,0,1,0},{1,0,0,1},{1,1,0,0},{0,0,1,1}};
        //Exit Point is 1,3
        int direction=0; //0-east,1-south,2-west,3-north
        int i=0;
        int j=0;

        while(true){
            direction=(direction + arr[i][j]) % 4;
            //east
            if(direction==0){
                j++;
            }
            //south
            else if(direction==1){
                i++;
            }
            //west
            else if(direction==2){
                j--;
            }
            //North
            else if(direction==3){
                i--;
            }
            if(i<0){
                i++;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(i==arr.length){
                i--;
                break;
            }
            else if(j==arr[0].length){
                j--;
                break;
            }

        }
        System.out.println("Exit is at " + i + " " + j);
    }
}
