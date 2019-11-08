package Package01;
/*

Given an int array of any length, print a new array of its first 2 elements. 
If the array is smaller than length 2, use whatever elements are present.

Example:
input 1, 2, 3 
output: [1, 2]

Example:
input 1,
output: [1]

 */

import java.util.Arrays;
import java.util.Scanner;

public class Q129_Arrays_FrontPiece {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = scan.nextInt();
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the number " + (i + 1) + ": ");
			num[i] = scan.nextInt();
		}
		if (size > 1) {
		int[] nums2 = new int[2];
		for (int i = 0; i < nums2.length; i++) {
			nums2[i]=num[i];
		}
		System.out.println(Arrays.toString(nums2));
		}
		else
		System.out.println(Arrays.toString(num));

	}
}