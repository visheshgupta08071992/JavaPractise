import java.util.Arrays;

public class SeparateZeroFromNonZero {

    private static void separateZerosAtEnd(){
        int[] arr1 ={1,0,5,0,4,0};
        //Output should be {1,5,4,0,0,0}
        int count=0;
        for(int i=0;i<=arr1.length-1;i++){
            if(arr1[i]!=0){
                arr1[count]=arr1[i];
                count++;
            }
        }
        while(count<arr1.length){
            arr1[count]=0;
            count++;
        }
        System.out.println(Arrays.toString(arr1));
    }

    private static void separateZerosAtStart(){
        int[] arr1 ={1,0,5,0,4,0};
        //Output should be {0,0,0,1,5,4}
        int count=arr1.length-1;
        for(int i=arr1.length-1;i>=0;i--){
            if(arr1[i]!=0){
                arr1[count]=arr1[i];
                count--;
            }
        }
        while(count>=0){
            arr1[count]=0;
            count--;
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void main(String[] args) {
      //  separateZerosAtEnd();
        separateZerosAtStart();
    }
}
