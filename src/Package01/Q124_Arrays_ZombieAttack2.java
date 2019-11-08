package Package01;
/*

An array inhabitants represents cities and their respective populations. 
For example, the following arrays shows 8 cities and their respective populations:
[3, 6, 0, 4, 3, 2, 7, 1]
Some cities have a population of 0 due to a pandemic zombie disease that is wiping 
away the human lives. After each day, any city that is adjacent to a zombie-ridden city 
will lose half of its population.

Write a program to loop though each city population and make it lose half of its population 
if it is adjacent(right or left) to a city with zero people until all cities have no humans left.

Make updates to each element in the array And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----

 */

import java.util.Arrays;
import java.util.Scanner;

public class Q124_Arrays_ZombieAttack2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		
		System.out.println("Input population of 8 cities as an integer reperesents K: ");
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}
		int l = inhabitants.length;
		int[] inhabitants2 = new int[8];
		int j = 0;
		int i = 0;
		System.out.println("Day " + i + " " + Arrays.toString(inhabitants));
		int max = 1;
		do {
			System.arraycopy(inhabitants, 0, inhabitants2, 0, 7);	
			for (j = 0; j < l ; j++) {

				if (j == 0 && inhabitants2[j+1] == 0) 			inhabitants[0] = inhabitants[0] / 2;
				else if (j == 0 && inhabitants2[j+1] != 0) 		inhabitants[0] = inhabitants[0];
				else if (j == l-1 && inhabitants2[j-1] == 0)		inhabitants[l-1] = inhabitants[l-1] / 2;
				else if (j == l-1 && inhabitants2[j-1] != 0)		inhabitants[l-1] = inhabitants[l-1];
				else if (inhabitants2[j+1] == 0 || inhabitants2[j-1] == 0) 	inhabitants[j] = inhabitants[j] / 2;
				
				max = inhabitants[0];
				for (int k = 0; k < l; k++) {
					if (inhabitants[k] > max)
						max = inhabitants[k];
				}
			}
			System.out.println("Day " + ++i + " " + Arrays.toString(inhabitants));
			
		}while (max > 0);
		
		System.out.println("---- EXTINCT ----");
	}
}