package DSAPreparation.Grind75.Array;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Leetcode - https://leetcode.com/problems/merge-intervals/
* Explanation - https://www.youtube.com/watch?v=_FkR5zMwHQ0
*
* Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.



Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
*
* */
public class MergeInterval {

    @Test
    public void merge(){
        int [][] intervals={{1,3},{2,6},{8,10},{15,18}};
        //Output: {{1,6},{8,10},{15,18}}

        /*
        * Sort the interval array based on starting point, Start point is present in
        * column 0 for the interval array.
        *
        * We are sorting the array based on starting point to compare starting of current
        * interval with ending point of previous interval
        * */

        Arrays.sort(intervals,(a,b) ->{
            //sorting in asecneding order
            return a[0] - b[0];
        });

        //Creating List of integer array to store merges

        List<int []> list = new ArrayList<>();

        //Iterating over intervals and checking if merge can be done

        for(int [] interval:intervals){

            //Initially add the first interval
            if(list.size()==0){
                list.add(interval);
            }
            else{
                //If list is not empty check whether starting point of current interval is
                //smaller then the ending point of previous interval,If yes the merge else add
                //the interval to list
                int [] prevInterval=list.get(list.size() - 1);
                if(interval[0]<=prevInterval[1]){
                    //Set the ending point of previous interval
                    prevInterval[1]=Math.max(interval[1],prevInterval[1]);
                }
                else{
                    list.add(interval);
                }
            }
        }
        System.out.println(Arrays.deepToString(list.toArray(new int[list.size()][])));
    }
}
