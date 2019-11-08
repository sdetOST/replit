package Package01;
/*
The code provided in your main method will take in five Strings and save them 
into an array called arr.  Print out the first three letter of each element of arr, 
one per line.  You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["apple", "banana"] 

prints:  app
         ban
 
 
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q109_ArraysPprinting01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i = 0; i < 5; i++) {

			System.out.println("Enter string " + (i + 1) + ": ");
			arr[i] = input.nextLine();
		}

		String[] arr1 = new String[1];
		String[] arr2 = new String[1];
		String[] arr3 = new String[1];
		String[] arr4 = new String[1];
		String[] arr5 = new String[1];

		arr1[0] = arr[0];
		arr2[0] = arr[1];
		arr3[0] = arr[2];
		arr4[0] = arr[3];
		arr5[0] = arr[4];

		String str1 = Arrays.toString(arr1);
		System.out.println(str1.substring(1, 4));
		String str2 = Arrays.toString(arr2);
		System.out.println(str2.substring(1, 4));
		String str3 = Arrays.toString(arr3);
		System.out.println(str3.substring(1, 4));
		String str4 = Arrays.toString(arr4);
		System.out.println(str4.substring(1, 4));
		String str5 = Arrays.toString(arr5);
		System.out.println(str5.substring(1, 4));

	}

}
