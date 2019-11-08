package Package01;
/*
Given two arrays of ints sorted in increasing order, outer and inner, 
print out true if all of the numbers in inner appear in outer. 
Take advantage of the fact that both arrays are already in sorted order.
Example:
input (outer): 1, 2, 4, 6
input (inner): 2, 4
output: true

Example:
input (outer): 1, 2, 4
input (inner): 6, 5
output: false
 
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q130_Arrays_InnerOuter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Outer & Inner sizes: ");
		int sizeOuter = scan.nextInt();
		int sizeInner = scan.nextInt();

		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];

		for (int j = 0; j < sizeOuter; j++) {
			System.out.println("Enter Outer [" + j + "]: ");
			outer[j] = scan.nextInt();
		}
		for (int i = 0; i < sizeInner; i++) {
			System.out.println("Enter Inner [" + i + "]: ");
			inner[i] = scan.nextInt();
		}
// Arrays to string
		String outerS = Arrays.toString(outer);
		String innerS = Arrays.toString(inner);

// Eliminate repeated characters from strings			
		String outerSS = "";
		for (int i = 0; i < outerS.length(); i++) {
			String c = outerS.charAt(i) + "";
			String s = outerS.substring(i + 1);
			if (!s.contains(c))
				outerSS = outerSS + c;
		}

		String innerSS = "";
		for (int i = 0; i < innerS.length(); i++) {
			String c = innerS.charAt(i) + "";
			String s = innerS.substring(i + 1);
			if (!s.contains(c))
				innerSS = innerSS + c;
		}

// Count NewInner string characters in NewOuter		
		int count = 0;
		for (int i = 0; i < innerSS.length(); i++) {
			String c = innerSS.charAt(i) + "";
			if (outerSS.contains(c))
				count++;
		}
// Count needs to be equal to newInner string length to be true
		System.out.print(innerSS.length() == count ? "true" : "false");

	}
}
