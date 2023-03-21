package JavaConceptOfTheDay;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Practise {

    @Test
    public void problem1(){
      int no =-10101;
      while(no>0){
          int n=no%10;
          if(n!=0 && n!=1){
              System.out.println("Not a Binary");
              return;
          }
          no=no/10;
      }
        System.out.println("No is Binary");
    }

    @Test
    public void findLeaders(){
        int [] arr={14, 16, 11, 7, 2, 15, 3};
        List<Integer> list = new ArrayList<>();
        list.add(arr[arr.length-1]);
        int max= arr[arr.length -1];
        for(int i=arr.length - 2;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        System.out.println(list);
    }
}
