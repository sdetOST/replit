package Package01;
/*

isPos is a method that checks if  an int positive or not positive

1. If  the int num is positive print positive else print not positive

2. Complete main method by calling isPos method for each element in the array arr.

*/

import java.util.Scanner;

public class Q146_Methods9_isPos {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = inp.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {
			System.out.print("Enter the number" + (i + 1)+": ");
			arr[i] = inp.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			isPos(num);
		}
	}

	public static void isPos(int num) {
		System.out.println(num > 0 ? "positive" : "not positive");
	}
}
