package Package01;
//Given a 2d array of ints, find the biggest number(int) in the array and print it.

import java.util.Scanner;

public class Q122_2DArray_largestNumber {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter rows and colum number: ");
		int rows = inp.nextInt(), cols = inp.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = inp.nextInt();
			} 														// end for cols
		} 															// end for rows

		int max = arr [0][0];

		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				if(arr[i][j]>max)
					max=arr[i][j];
			} 														
		} 								
			
			
			System.out.println(max);
		}

	}																// end main

