package DSAPreparation.BossCoder.Array;

/*
* https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
*
* */

import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class FindKthSmallestElementQ2 {

    @Test
    public void findKthSmallestElement(){
        int [] arr={7,10,4,3,20,15};
        int k=3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i:arr){
            pq.add(i);
        }

        System.out.println(pq);

        for(int j=1;j<k;j++){
            pq.poll();
        }
        System.out.println(pq.poll());
    }

}
