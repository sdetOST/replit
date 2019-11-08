package Package01;

import java.util.Arrays;
import java.util.Scanner;

public class Q133_Diving {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float score[] = new float[7];
		int i = 0;
		for (float k : score) {
			System.out.println("Enter score for judge " + (i + 1) + ":");
			score[i] = input.nextFloat();
			i++;
		}
		System.out.println("Enter difficulty:");
		float d = input.nextFloat();

		Arrays.sort(score);
		float[] score2 = Arrays.copyOfRange(score, 1, score.length - 1);

		float total = 0;
		for (i = 0; i < score2.length; i++) {
			total = total + score2[i];
		}
		total = total * d * 0.6f;
		System.out.println("Total : " +total);

	}
}
