package JavaConceptOfTheDay.InterviewQuestions;

/*Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.



Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:

Input: nums = [0]
Output: [[],[0]]



Constraints:

    1 <= nums.length <= 10
    -10 <= nums[i] <= 10
    All the numbers of nums are unique.

    Leetcode:https://leetcode.com/problems/subsets/

*/

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Coupa {

	@Test
	public void findSubSets(){
		int [] nums={1,2,3};
		//Required Output: [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<Integer>());

		for(int num : nums){

			List<List<Integer>> newSubsets = new ArrayList<>();

			for(List<Integer> subset : result){

				List<Integer> newList = new ArrayList<>(subset);
				newList.add(num);
				newSubsets.add(newList);
			}

			for(List<Integer> r : newSubsets){

				result.add(r);
			}
		}
		System.out.println(result);
	}

}
