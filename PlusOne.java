/*
 
Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.

*/
import java.util.ArrayList;

public class PlusOne {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		int carry = 0;
		for (int i = a.size() - 1; i >= 0; i--) {

			if (a.get(i) == 9) {
				a.set(i, 0);
				carry = 1;

			} else {
				a.set(i, a.get(i) + 1);
				carry = 0;
				break;
			}
		}
		if (carry == 1) {
			a.add(0, 1);
		}
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) == 0) {
				a.remove(i);
				i--;
			} else {
				break;
			}
		}
		return a;
	}

}
