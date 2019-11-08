package Package01;
/*
Given an array nums with 7 integers every element is repeated twice - except one. 
Find that element and print it to console.

Example:

nums --> [1, 1, 2, 3, 4, 3, 4]
         2
 * 
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class Q111_Arrays_FindNonDuplicate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 7 integer :");
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };
		
		Arrays.sort(nums);
		int a = nums.length;
		
		if(nums[0]!=nums[1]) System.out.println(nums[0]);
		else if (nums[a-1]!=nums[a-2]) System.out.println(nums[a-1]);
		else {
			for(int i = 1; i<a-2;i++) {
				if ( nums[i]!=nums[i+1] && nums[i+1] != nums[i+2]) System.out.println(nums[i+1]);
			}
		}
	}
}
