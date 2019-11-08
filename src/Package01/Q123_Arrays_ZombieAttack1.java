package Package01;
/*
An array inhabitants represents cities and their respective populations. 
For example, the following arrays shows 8 cities and their respective populations:
[3, 6, 0, 4, 3, 2, 7, 1]
Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives. 
After each day, every city will lose half of its population.
write a program to loop though each city population and make it lose half of its population 
until all cities have no humans left. Make updates to each element in the array 
And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ---- 
  
*/

import java.util.Arrays;
import java.util.Scanner;

public class Q123_Arrays_ZombieAttack1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		System.out.println("Input population of 8 cities as an integer reperesents K: ");
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}
		int max = inhabitants[0];
		for (int i = 0; i < inhabitants.length; i++) {
			if (inhabitants[i] > max)
				max = inhabitants[i];
		}
		int d = 2 +  (int) (Math.log(max) / Math.log(2));
		for (int i = 0; i < d; i++) {
			System.out.println("Day "+i+ " "+ Arrays.toString(inhabitants));
			for (int j=0; j<inhabitants.length; j++) {
				
				inhabitants[j] = inhabitants[j]/2;
			}
			System.out.println("Day "+i+ " "+ Arrays.toString(inhabitants));
		}
		System.out.println("---- EXTINCT ----");
	}
}