package SeleniumPractise.HandlingDropDowns;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SelectionSort {

    @Test
    public void sort(){
        int [] a={5,4,3,2,1};

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
