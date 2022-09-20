package DSAPreparation.Grind75.BinarySearch;

/*
* Leetcode - https://leetcode.com/problems/koko-eating-bananas/
*
* Solution - https://www.youtube.com/watch?v=LzZFUTWE55c
*
*Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.



Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23
*
*
*
*
* */

import org.testng.annotations.Test;

public class KoKoEatingBanana {

    @Test
    public void test(){
        int [] piles = {3,6,7,11};
        int h=8;

        int max=0;

        for(int i=0;i<piles.length;i++){
            max= Math.max(max,piles[i]);
        }

        if(h==piles.length){
            System.out.println("Minimumn speed should be :  " +max);
            return;
        }

        int low=0;
        int high=max;
        int minSpeed=0;

        while(low<=high){
           int speed= low + (high - low)/2;
           if (ifPossible(piles,h,speed)){
               minSpeed=speed;
               high=speed - 1;
           }
           else{
               low=speed + 1;
           }
        }
        System.out.println("Minimumn speed should be :  " +minSpeed);
    }

    public Boolean ifPossible(int [] piles,int h,int speed){
        int time=0;

        for(int i=0;i<piles.length;i++){
            //Ceil function returns double,hence typecasting it to int
            //Also multiplying piles[i] with 1.0 so as to get correct ceil.
            time = time + (int) Math.ceil(piles[i] * 1.0/speed);
        }
        return time<=h;
    }
}
