package ArraysAndStrings;

/*
* Question - https://nados.io/question/max-chunks-to-make-array-sorted
* Solution - https://www.youtube.com/watch?v=XZueXHOhO5E&list=PL-Jc9J83PIiE-TR27GB7V5TBLQRT5RnSl&index=13
* LeetCode - https://leetcode.com/problems/max-chunks-to-make-sorted/submissions/
* */

import org.testng.annotations.Test;

public class MaxChunksToMakeArraySorted {

    @Test
    public void maxChunks(){
        int [] arr={2,1,3,0,5,4};
        //Expected 2 chunks
        int max=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
            if(max==i){
                count++;
            }
        }
        System.out.println("Max chunks that can be formed are : " + count);
    }
    /*
    * Time Complexity : O(n)

      Overall time complexity of the function will be O(n) because we are using only one loop which is running from 0 to n - 1.


      Space Complexity : O(1)

      Since, no extra spaces are used to store numbers, therefore the space complexity is constant.
    *
    * */
}
