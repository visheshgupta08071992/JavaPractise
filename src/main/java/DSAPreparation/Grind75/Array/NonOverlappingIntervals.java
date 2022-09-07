package DSAPreparation.Grind75.Array;

/*
* Leetcode - https://leetcode.com/problems/non-overlapping-intervals/
*
* Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.



Example 1:

Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
Output: 1
Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
Example 2:

Input: intervals = [[1,2],[1,2],[1,2]]
Output: 2
Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.
Example 3:

Input: intervals = [[1,2],[2,3]]
Output: 0
Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
*
*
*
*
* */


import org.testng.annotations.Test;

import java.util.*;

public class NonOverlappingIntervals {

    //Again this question is similar to merge interval, Solve Merge Interval question first
    @Test
    public void nonOverLap(){

      //  int [][] intervals= {{1,2},{2,3},{3,4},{1,3}};
        int [][] intervals= {{1,2},{2,3}};
        //Creating list of intervals for storing intervals

        List<int []> list = new ArrayList<>();

        int minInterval=0;

        //Sort the intervals based on starting point
        Arrays.sort(intervals,(a, b) ->{
            return a[0] - b[0];
        });

        for(int [] interval:intervals){

            //If the list is empty then add the interval into the list
            if(list.size()==0){
                list.add(interval);
            }
            else{
                int [] prev=list.get(list.size() -1);

                //Check if there is overlap,If overlap is present increase count of minInterval and remove the
                // interval which is greater as it might overlap with other intervals

                //If start of current interval is smaller the end of previous interval then there is overlap
                if(interval[0] < prev[1]){

                    minInterval=minInterval + 1;

                    // Removing interval which is greater as it might overlap with other intervals
                    prev[1] = Math.min(prev[1],interval[1]);
                }
                else{
                    list.add(interval);
                }
            }
        }
        System.out.println(minInterval);

    }
}
