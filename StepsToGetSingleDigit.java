/*
Given a number N, product(N) is the product of the digits of N. We can then form a sequence N,
product(N), product(product(N))...
For example, using 99, we get the sequence 99, 9*9 = 81, 8*1 = 8.
You are expected to complete the function, getSingleDigitProduct, which takes a single argument.
The argument passed to the function is an integer N. Your function is expected to return after how
many steps a single digit number occurs in this sequence.

Sample Test Cases:

Input #00:
99

Output #00:
2

Explanation:
Step - 1 : 9 * 9 = 81
Step - 2 : 8 * 1 = 8
There are 2 steps to get to this single digit number.

Input #01:
1137638147

Output #01:
7
Explanation:
Step - 1 : 1*1*3*7*6*3*8*1*4*7 = 84672
Step - 2 : 8 * 4 * 6 * 7 * 2 = 2688
Step - 3 : 2 * 6 * 8 * 8 = 768
Step - 4 : 7 * 6 * 8 = 336
Step - 5 : 3 * 3 * 6 = 54
Step - 6 : 5 * 4 = 20
Step - 7 : 2 * 0 = 0
There are 7 steps, hence the answer = 7
 
*/

import java.util.Scanner;

public class StepsToGetSingleDigit {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(getSingleDigitProduct(N));
	}

	private static int getSingleDigitProduct(int n) {
		if(n<10) return 0;
		int product=1;
		while(n>0){
			product=product*(n%10);
			n=n/10;
		}
		return 1+getSingleDigitProduct(product);
	}

}
