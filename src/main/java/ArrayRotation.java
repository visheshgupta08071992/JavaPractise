import java.util.Arrays;

public class ArrayRotation {

    private static void rotateArrayFromStart(int [] arr1,int noOfRotation){
        for(int i=1;i<=noOfRotation;i++){
            int temp=arr1[0];
            for (int j=0;j<arr1.length-1;j++){
                arr1[j]=arr1[j+1];
            }
            arr1[arr1.length-1]=temp;
        }
        System.out.println(Arrays.toString(arr1));
    }

    private static void rotateArrayFromLast(int [] arr1,int noOfRotation){
        for(int i=1;i<=noOfRotation;i++){
            int temp=arr1[arr1.length-1];
            for (int j=arr1.length-1;j>0;j--){
                arr1[j]=arr1[j-1];
            }
            arr1[0]=temp;
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int noOfRotation=2;
        rotateArrayFromStart(arr1,noOfRotation);
        rotateArrayFromLast(arr1,noOfRotation);
    }
}
