/*
	Write a function:

	class Solution { public int solution(int[] A); }

	that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

	For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

	Given A = [1, 2, 3], the function should return 4.

	Given A = [−1, −3], the function should return 1.

	Write an efficient algorithm for the following assumptions:

	N is an integer within the range [1..100,000];
	each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
package counting.elements;

import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.Set;

public class MissingInteger {

	private static final int MAX_ELEMENT_VALUE = 1000000;

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 3, 6, 4, 1, 2 }));
		System.out.println(solution(new int[] { 1, 2, 3 }));
		System.out.println(solution(new int[] { -1, -3 }));
	}

	private static int solution(int[] A) {
		final Set<Integer> elements = Arrays.stream(A).boxed().collect(toSet());
		for (int i = 1; i <= MAX_ELEMENT_VALUE; i++) {
			if (!elements.contains(i))
				return i;
		}
		return 1;
	}

}
