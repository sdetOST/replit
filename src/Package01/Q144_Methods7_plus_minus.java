package Package01;
/*

Create a method called plus_minus that gets an array of ints (int[]), 
it outputs how many negative , positive and zero numbers are in the array.

for example:

plus_minus (new int[]{1,2,55,-9,-2,0});

will output:
positives:3, negatives:2, zeros:1

*/


import java.util.Scanner;

public class Q144_Methods7_plus_minus {

	private static void plus_minus(int[] arr) {
		int a = 0;
		int b = 0;
		int c = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if ( arr[i] > 0) a++;
			if ( arr[i] < 0) b++;
			if ( arr[i] == 0) c++;
		}
		System.out.printf("positives:%d, negatives:%d, zeros:%d",a,b,c);
	}
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = inp.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {
			System.out.print("Enter the number" + (i + 1)+": ");
			arr[i] = inp.nextInt();
		}

		plus_minus(arr);
	}
}
