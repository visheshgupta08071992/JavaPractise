package DSAPreparation.Grind75.SlidingWindow;

/*
* https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1
* Input:
N = 7, K = 4
A[] = {1,2,1,3,4,2,3}
Output: 3 4 4 3
*
*
* https://www.youtube.com/watch?v=j48e8ac7r20
* */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountDistinctElementInEveryWindow {

    @Test
    public void countDistinctElementInEveryWindow(){
        int [] A={1,2,1,3,4,2,3};
        int k=4;
        int i=0;
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int j=0;j<A.length;j++){

            if(map.containsKey(A[j])){
                map.put(A[j],map.get(A[j]) + 1);
            }
            else{
                map.put(A[j],1);
            }

            if(j-i+1==k){
                list.add(map.size());
                if(map.get(A[i]) > 1){
                    map.put(A[i],map.get(A[i]) -1);

                }
                else{
                    map.remove(A[i]);
                }
                i++;
            }
        }
        System.out.println(list);
    }

    @Test
    public void countDistinctElementInEveryWindowUsingSet(){
        int [] arr={1,2,1,3,4,2,3};
        int k=4;
        ArrayList<Integer> list = new ArrayList<>();
        int j=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<=arr.length - k;i++){

            while(j<k){
                set.add(arr[i+j]);
                j++;
            }
            j=0;
            list.add(set.size());
            set.clear();
        }
        System.out.println(list);;
    }
    
}
