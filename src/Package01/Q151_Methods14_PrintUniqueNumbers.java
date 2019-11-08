package Package01;

import java.util.Scanner;

public class Q151_Methods14_PrintUniqueNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		printUniqueNumbers(nums);
	}

	public static void printUniqueNumbers(int[] nums) {
		String s = ",";
		for (int j = 0; j < nums.length; j++) {
			int a = nums[j];
			char b = (char) a;
			if (s.contains(b + ""))
				continue;
			s = s + b;

			int c = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == a)
					c++;
			}
			if (c == 1)
				System.out.println(a);

		}

	}
}
