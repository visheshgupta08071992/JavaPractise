package DSAPreparation.Grind75.Array;

/*
* Leetcode - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*
* Youtube - https://www.youtube.com/watch?v=34WE6kwq49U&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=14
*
*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
*
*
* */

import org.testng.annotations.Test;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {

    @Test
    //The Time complexity of given program is o(n2) and space complexity is o(1)
    public void bruteForce(){
        int [] prices ={7,1,5,3,6,4};

        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            // j<=prices.length as for scenario where array size is only 2 i.e {1,2}
            for(int j=i+1;j<=prices.length-1;j++){
                if(prices[j] > prices[i]){
                    int profit = prices[j] - prices[i];
                    if(profit > maxProfit){
                        maxProfit = profit;
                    }
                }
            }
        }
        System.out.println(maxProfit);
    }

    @Test
    //The Time complexity of given program is o(n) and space complexity is o(n)
    public void Optimized(){
        int [] prices ={7,1,5,3,6,4};

        //Created an array maxPrice to maintain max price from the following date
        int [] maxPriceArr=new int[prices.length]; // [7, 6, 6, 6, 6, 4]
        int maxPrice=0;
        for(int i=maxPriceArr.length-1;i>=0;i--){
            if(prices[i]>maxPrice){
                maxPrice=prices[i];
            }
            maxPriceArr[i]=maxPrice;
        }
        System.out.println(Arrays.toString(maxPriceArr));

        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            int profit= maxPriceArr[i] - prices[i];
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        System.out.println(maxProfit);

    }

    @Test
    //The Time complexity of given program is o(n) and space complexity is o(1)
    /*
    * Algorithmn in simple terms, Minimum price maintain krke chalege and ussi din sell karega and agar profit
    * maxProfit se jyada aata toh msxProfit mai store krlege
    * */
    public void BestSolution(){
        int [] prices ={7,1,5,3,6,4};

        //Initially the minimum price would be the starting price as there are no prices before it.
        int minPrice=prices[0];
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < minPrice){
                minPrice=prices[i];
            }
            int profit=prices[i] - minPrice;
            if(profit >maxProfit){
                maxProfit=profit;
            }
        }
        System.out.println(maxProfit);
    }
}
