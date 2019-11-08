package Package01;

import java.util.Arrays;
import java.util.Scanner;

/*

Given an array nums, calculate count of even numbers in nums 
(not their values!) and print out to console.

nums -> [2, 1, 2, 3, 4]) -> 3
nums -> [2, 2, 0, 3, 5]) -> 3
nums -> [1, 3, 5, 7, 9]) -> 0
  
 
 */
public class Q110_Arrays_CountEvens {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 5 integer : ");
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };
		
		int count = 0;
		for (int i=0; i<nums.length;i++) {
			if (nums[i] %2 == 0) count++;
			
		}
		System.out.println(Arrays.toString(nums)+" "+count);

	}
}
