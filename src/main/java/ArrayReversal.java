import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayReversal {

    private static void arrayReverseUsingTemporaryArray(){

        int [] arr1={1,2,3,4,5};
        int [] reverseArr=new int[arr1.length];
        int j=0;
        for(int i= arr1.length-1;i>=0;i--){
            reverseArr[j]=arr1[i];
            j++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(reverseArr));
    }

    private static void arrayReverseUsingWithoutTemporaryArray(){

        int [] arr1={1,2,3,4,5,6};
        int i=0;
        int j=arr1.length-1;
        while(i<j){
            int temp=arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void main(String[] args) {

      arrayReverseUsingTemporaryArray();
        arrayReverseUsingWithoutTemporaryArray();
    }
}
