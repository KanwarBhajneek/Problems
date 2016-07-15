/*

Max Non Negative SubArray

Find out the maximum sub-array of non negative numbers from an array.
The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.

Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).

Example:

A : [1, 2, 5, -7, 2, 3]
The two sub-arrays are [1, 2, 5] [2, 3].
The answer is [1, 2, 5] as its sum is larger than [2, 3]
NOTE: If there is a tie, then compare with segment's length and return segment which has maximum length
NOTE 2: If there is still a tie, then return the segment with minimum starting index

*/

import java.util.*;

public class MaximumSubArray {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {

		ArrayList<SubArray> list = new ArrayList<SubArray>();
		long sum = 0;
		ArrayList<Integer> elements = new ArrayList<Integer>();

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) >= 0) {
				sum = sum + a.get(i);
				elements.add(a.get(i));
			} else {
				SubArray sa = new SubArray();
				sa.elements = elements;
				sa.sum = sum;
				sa.minStartIndex = i - elements.size() + 1;
				list.add(sa);
				sum = 0;
				elements = null;
				elements = new ArrayList<Integer>();
			}
		}
		if (sum > 0) {
			SubArray sa = new SubArray();
			sa.elements = elements;
			sa.sum = sum;
			sa.minStartIndex = a.size() - elements.size();
			list.add(sa);
			sum = 0;
			elements = null;
		}
		Collections.sort(list);
		return list.get(list.size() - 1).elements;

	}

	class SubArray implements Comparable<SubArray> {
		ArrayList<Integer> elements;
		Long sum;
		Integer minStartIndex;

		@Override
		public int compareTo(SubArray s) {
			if (((Long) this.sum).equals((Long) s.sum)) {
				if (((Integer) this.elements.size())
						.equals((Integer) s.elements.size())) {
					return this.minStartIndex.compareTo(s.minStartIndex);
				} else {
					return ((Integer) this.elements.size())
							.compareTo((Integer) s.elements.size());
				}
			} else {
				return this.sum.compareTo(s.sum);

			}
		}
	}

}
