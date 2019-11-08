package Package01;
/*

Complete a method fib() that will compute Fibonacci numbers
In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... The first two numbers of fibonacci series are 0 and 1.
Given a number num, print n-th Fibonacci Number.

Input  : 2
Output : 1

Input  : 9
Output : 34

 */

import java.util.Scanner;

public class Q154_Methods17_FibonacciNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		fib(num);
	}

	public static void fib(int num) {
		int[] arr = new int[num];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 0; i < arr.length - 2; i++) {
			arr[i + 2] = arr[i + 1] + arr[i];

		}
		System.out.println(arr[arr.length - 1]);

	}
}
