package Package01;

import java.util.Arrays;
import java.util.Scanner;

public class aaaaaaaaaaaa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		System.out.println("Input population of 8 cities as an integer reperesents K: ");
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}
		int count = 0;// we use count for number of days
		// int[] inhabitants = { 3, 6, 0, 4, 3, 2, 7, 1 }; Day 0 [3, 6, 0, 4, 3, 2, 7,
		// 1]
//		System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
		int zero = 0;
		int i = 0;
		while (zero != 8) {
//			zero = 0;// will reset zero value after each for loop
			for (i = 0; i < inhabitants.length; i++) {
				inhabitants[i] = inhabitants[i]; // lose half
				if (inhabitants[i] == 0)
					zero++; // if equals zero we increase by 1
				inhabitants[i] = inhabitants[i] / 2; // lose half
			}

			System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
			count++;
		}
//		while (zero != 8);// we check number of zero .if 8 it will break the loop
		System.out.println("---- EXTINCT ----");

//------------------------------------------------------------------------------------

//		int count = 0;// we use count for number of days
//		// int[] inhabitants = { 3, 6, 0, 4, 3, 2, 7, 1 };  Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
//		System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
//		int zero;
//		do {
//			zero = 0;// will reset zero value after each for loop
//			for (int i = 0; i < inhabitants.length; i++) {
//				inhabitants[i] = inhabitants[i] / 2; // lose half
//				if (inhabitants[i] == 0)
//					zero++; // if equals zero we increase by 1
//			}
//			count++;
//			System.out.println("Day " + count + " " + Arrays.toString(inhabitants));
//		} 
//		while (zero != 8);// we check number of zero .if 8 it will break the loop
//		System.out.println("---- EXTINCT ----");
	}
}
