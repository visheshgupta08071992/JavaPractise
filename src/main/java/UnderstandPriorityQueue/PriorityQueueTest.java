package UnderstandPriorityQueue;

import org.testng.annotations.Test;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    @Test
    public void understandPQ1(){
        int [] arr={9,8,10,3,4,2,7};
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i:arr){
            pq.add(i);
        }
        while(pq.size() > 0){
           System.out.println(pq.peek());
           pq.remove();
       }
    }

    @Test
    public void understandPQ2(){
        int [] arr={9,8,10,3,4,2,7};
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i:arr){
            pq.add(i);
        }
        while(pq.size() > 0){
            System.out.println(pq.poll());
        }
    }

    @Test
    public void understandPQ3(){
        int [] arr={9,8,10,3,4,2,7};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i:arr){
            pq.add(i);
        }
        while(pq.size() > 0){
            System.out.println(pq.poll());
        }
    }

    @Test
    public void understandPQ4(){
        int [] arr={9,8,10,3,4,2,7};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i:arr){
            pq.add(i);
        }
        while(pq.size() > 0){
            System.out.println(pq.poll());
        }
    }
}
