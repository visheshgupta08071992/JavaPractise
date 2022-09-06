package DSAPreparation.Grind75.Array;

/*
* Leetcode - https://leetcode.com/problems/insert-interval/
*
*
* You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.



Example 1:

Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
Example 2:

Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
*
*
*
* */

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InsertInterval {

/*
* Solve merge interval question before solving this question.
* Here we directly inserting the interval and then sorting based on starting point and
* then merging if overlap
*
* */

    @Test
    public void insertInterval(){
        /*int [][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int [] newInterval={4,8};
*/
        int [][] intervals = {{1,5},{6,8}};
        int [] newInterval={5,6};

        List<int []> list = new ArrayList<>();

        /*
          Belwo if condition for scenario
        * int [][] intervals= {}
          int [] newInterval={5,7}
          Output ->{{5,7}}
        * */
        if(intervals.length==0){
            list.add(newInterval);
            System.out.println(Arrays.deepToString(list.toArray(new int[list.size()][])));
            return;
        }


        // Add the newInterval into list
        list.add(newInterval);

        //Add the intervals from intervals Array into the list

        for(int [] interval:intervals){
            list.add(interval);
        }

        //Sort the List based on starting point
        Collections.sort(list,(a, b) -> {
            return a[0] - b[0];
        });

        //After the interval are inserted and sorted,Merge the Intervals whic are overlapping

        List<int []> list1 = new ArrayList<>();

        for(int [] interval:list){
            if(list1.size()==0){
                list1.add(interval);
            }
            else{
                int [] prev= list1.get(list1.size() - 1);

                //Check whether the current interval can be merged with previous interval
                if(interval[0]<=prev[1]){
                    prev[1]=Math.max(interval[1],prev[1]);
                }
                else {
                    list1.add(interval);
                }
            }
        }
        System.out.println(Arrays.deepToString(list1.toArray(new int[list1.size()][])));
    }

    @Test
    public void insertIntervalBestApproach() {
        /*int [][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int [] newInterval={4,8};
*/
        int[][] intervals = {{1, 5}, {6, 8}};
        int[] newInterval = {5, 6};

        List<int[]> merged = new ArrayList<>();

         /*
          Belwo if condition for scenario
        * int [][] intervals= {}
          int [] newInterval={5,7}
          Output ->{{5,7}}
        * */
        if(intervals.length==0){
            merged.add(newInterval);
            System.out.println(Arrays.deepToString(merged.toArray(new int[merged.size()][])));
            return;
        }
        int i = 0;
        // add not overlapping
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            merged.add(intervals[i]);
            i++;
        }
        // add overlapping
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        merged.add(newInterval);
        // add rest
        while (i < intervals.length) {
            merged.add(intervals[i]);
            i++;
        }
        System.out.println(Arrays.deepToString(merged.toArray(new int[merged.size()][])));
    }
}
