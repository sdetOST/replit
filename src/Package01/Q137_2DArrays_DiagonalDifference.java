package Package01;
/*

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:
1 2 3
4 5 6
9 8 9  

The left-to-right diagonal = 1+5+9 = 15. 
The right to left diagonal =  3+5+9 = 17. 
Their absolute difference is |15-17| = 2.

*/

import java.util.Scanner;

public class Q137_2DArrays_DiagonalDifference {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 3x3 matrix numbers: ");
		
		int[][] matrix = new int[][] { { scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() } };
				
		int result1 = 0;
		int result2 = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j)
					result1 = result1 + matrix[i][j];
				if (i + j == matrix.length-1)
					result2 = result2 + matrix[i][j];
			}
		}
		int result = Math.abs((result1 - result2));

		System.out.println(Math.abs(result));
	}
}
