package Package01;
/*
 A variable inhabitants represents a city and its respective populations. 
 City might have a population of 0 due to a pandemic zombie disease that is wiping away the human lives. 
 After each day, a city will lose half of its population.write a program to loop the city population 
 and make it lose half of its population until no humans left. Print the each day like below for each day:
example1- inhabitants is 6

Day 0 [6]
Day 1 [3]
Day 2 [1]
---- EXTINCT ----

example2- inhabitants is 0
---- EXTINCT ----

example3- inhabitants is 20
Day 0 [20]
Day 1 [10]
Day 2 [5]
Day 3 [2]
Day 4 [1]
---- EXTINCT ----
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Q096_ZombieAttack1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter inhabitants number:");
		int inhabitants = scan.nextInt();

		int inh2 = inhabitants * 2;

		int b = 0;
		for (int i = 0; i <= inhabitants; i++) {
			if (inh2 / 2 >= 1) {
				System.out.println("Day " + b + " [" + inh2 / 2 + "]");
				inh2 = inh2 / 2;
				b++;
			}
		}
		System.out.println("---- EXTINCT ----");
		
	}
}
//-----------------------------------------------------------------------
		
		
		
//	}
//}


