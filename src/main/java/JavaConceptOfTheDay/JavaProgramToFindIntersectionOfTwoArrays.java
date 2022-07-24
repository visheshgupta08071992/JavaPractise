package JavaConceptOfTheDay;

import java.util.*;

import org.testng.annotations.Test;

/*
* Leetcode - https://leetcode.com/problems/intersection-of-two-arrays/
*
* */
public class JavaProgramToFindIntersectionOfTwoArrays {
	@Test
	public void findIntersectionofTwoArrays() {
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

		String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

		Set<String> set = new LinkedHashSet<String>(Arrays.asList(s1));
		Set<String> set1 = new LinkedHashSet<String>(Arrays.asList(s2));
		//retainAll method of set retains only the common elements from both the set and stores in the set which
		//calls the method
		set.retainAll(set1);
		System.out.println(set);
	}

	@Test
	public void findIntersectionofTwoArraysIterativeWay() {
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

		String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

		Set<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					set.add(s1[i]);
				}
			}
		}
		System.out.println(set);
	}

	@Test
	public void findIntersectionofTwoArraysAnotherWay() {
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

		String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

		Set<String> set = new LinkedHashSet<String>(Arrays.asList(s1));
		for (int i = 0; i < s2.length; i++) {
			if (!set.add(s2[i])) {
				System.out.println(s2[i]);
			}
		}
	}

	@Test
	public void findIntersectionofTwoArraysUsingHashMap() {
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

		String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

		Map<String, Integer> map = new HashMap<>();

		for (String c : s1) {
           if(	map.containsKey(c)){
           	map.put(c,map.get(c) + 1);
		   }
           else{
           	map.put(c,1);
		   }
		}

		for(int i=0;i<s2.length;i++){
			if(map.containsKey(s2[i])){
				System.out.println(s2[i]);
			}
		}

	}
}