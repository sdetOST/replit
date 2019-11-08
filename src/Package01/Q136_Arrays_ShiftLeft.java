package Package01;
/*
Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. 
You may modify and print the given array, or print a new array.

Example: 
input: 6, 2, 5, 3
output: [2, 5, 3, 6]

*/

import java.util.Arrays;
import java.util.Scanner;

public class Q136_Arrays_ShiftLeft {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the number " + (i + 1) + ": ");
			nums[i] = scan.nextInt();
		}
		int[] nums2 = new int[size];
		
		for (int i = 0; i < nums2.length; i++) {
			nums2[i]=nums[i];
		}
		for (int i = 0; i < nums.length-1; i++) {
			nums[i] = nums2[i+1];
		}
			nums[nums.length-1] = nums2[0];

		System.out.println(Arrays.toString(nums));
	}
}
