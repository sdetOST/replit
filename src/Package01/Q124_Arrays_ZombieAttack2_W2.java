package Package01;

import java.util.Arrays;
import java.util.Scanner;

public class Q124_Arrays_ZombieAttack2_W2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		// TODO. Write you code below this line.
		// TODO. Write you code below this line.
		int day = 0;
		int indexOfLastElement = inhabitants.length - 1;
		int totalPopulation = 0;
		boolean precedingCityLostAllInhabitants = false;
		System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
		do {
			day++;
			for (int i = 0; i < inhabitants.length; i++) {
				// if it's a first city
				// then we want to check if population of second city is equals to 0
				if (i == 0) {
					// if population of second city is equals to 0
					if (inhabitants[1] == 0) {
						// first will loose half of the population
						inhabitants[0] = inhabitants[0] / 2;
					}
					// if it's a last city
					// then we want to check if population of second before las city is equals to 0
				} else if (i == indexOfLastElement) {
					// if population of second before las city is equals to 0
					if (inhabitants[indexOfLastElement - 1] == 0) {
						// then last city will loose half of the population
						inhabitants[indexOfLastElement] = inhabitants[indexOfLastElement] / 2;
					}
				} else {
					// if it's no t a first or last city
					// the we are checking if it's not already 0
					if (inhabitants[i] != 0) {
						// the we are checking if following value is equals to 0
						if (inhabitants[i + 1] == 0) {
							// if it's true, then this city losses half of the population
							inhabitants[i] = inhabitants[i] / 2;
							// if preceding city has no population and it
							// didn't loose population within a same the day
						} else if (inhabitants[i - 1] == 0 && !precedingCityLostAllInhabitants) {
							// if it's true, then this city losses half of the population
							inhabitants[i] = inhabitants[i] / 2;
							// this is for seeting our condition
							// it set precedingCityLostAllInhabitants to true only if city lost all
							// inhabitants
							if (inhabitants[i] == 0) {
								precedingCityLostAllInhabitants = true;
							}
						}
					}
				}

			}
			// we are printing updated info
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
			// we are checking how many inhabitants left
			// if there is no more inhabitants
			// breake from the loop
			for (int i : inhabitants) {
				totalPopulation += i;
			}
			// break if no more inhabitants
			if (totalPopulation == 0) {
				break;
			}
			// reset condition
			precedingCityLostAllInhabitants = false;
			// reset counter
			totalPopulation = 0;
		} while (true);

		System.out.println("---- EXTINCT ----");
	}
}