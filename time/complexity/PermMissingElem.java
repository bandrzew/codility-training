/*
	An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly
	one element is missing.

	Your goal is to find that missing element.

	Write a function:

	class Solution { public int solution(int[] A); }

	that, given an array A, returns the value of the missing element.

	For example, given array A such that:

	  A[0] = 2
	  A[1] = 3
	  A[2] = 1
	  A[3] = 5
	the function should return 4, as it is the missing element.

	Write an efficient algorithm for the following assumptions:

	N is an integer within the range [0..100,000];
	the elements of A are all distinct;
	each element of array A is an integer within the range [1..(N + 1)].
*/
package time.complexity;

import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.Set;

public class PermMissingElem {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 2, 3, 1, 5 }));
	}

	private static int solution(int[] A) {
		final Set<Integer> elements = Arrays.stream(A).boxed().collect(toSet());
		for (int i = 1; i <= A.length + 1; i++) {
			if (!elements.remove(i))
				return i;
		}
		return 0;
	}

}
