package Package01;
/*
You have a green lottery ticket, with ints a, b, c and d on it. 
If the numbers are all different from each other, the prize is 0. 
If all of the numbers are the same, the prize is 30. 
If two of the numbers are the same, the prize is 10. 
If three of the numbers are the same, the prize is 20.

Example:
input: 1
input: 1
input: 1
input: 1
output: 30

Example:
input: 2
input: 1
input: 1
input: 1
output: 20

Example:
input: 2
input: 3
input: 1
input: 1
output: 10

Example:
input: 4
input: 3
input: 2
input: 1
output: 0 
 */
import java.util.Scanner;

public class Q100_GreenTicket2_W2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int prize = 0;

		System.out.println("please enter the first digit: ");
		String x = scan.next();
		System.out.println("please enter the second digit: ");
		String y = scan.next();
		System.out.println("please enter the third digit: ");
		String z = scan.next();
		System.out.println("please enter the forth digit: ");
		String t = scan.next();

		String str1 = x + y + z + t;
		int s1 = str1.length();

		int s2 = x.length();
		int b1 = 0, b2 = 0, b3 = 0, b4 = 0, w = 0;

		int count = 0;
		b1 = 0;
		while (count < (s1 - s2 + 1)) {
			if (str1.substring(count, count + s2).equals(x))
				++b1;
			count++;

		}
		System.out.println("String \"" + x + "\" repeted " + b1 + " times.");

		if (!y.contentEquals(x)) {

			s2 = y.length();
			count = 0;
			b2 = 0;
			while (count < (s1 - s2 + 1)) {
				if (str1.substring(count, count + s2).equals(y))
					++b2;
				count++;

			}
			System.out.println("String \"" + y + "\" repeted " + b2 + " times.");
		}

		String s = x + y;
		if (!s.contains(z)) {

			s2 = z.length();
			count = 0;
			b3 = 0;
			while (count < (s1 - s2 + 1)) {
				if (str1.substring(count, count + s2).equals(z))
					++b3;
				count++;

			}
			System.out.println("String \"" + z + "\" repeted " + b3 + " times.");
		}
		s = x + y + z;
		if (!s.contains(t)) {

			s2 = t.length();
			count = 0;
			b4 = 0;
			while (count < (s1 - s2 + 1)) {
				if (str1.substring(count, count + s2).equals(t))
					++b4;
				count++;

			}
			System.out.println("String \"" + t + "\" repeted " + b4 + " times.");

		}
		if (b1 > b2) {
			w = b2;
			b2 = b1;
			b1 = w;
		}
		if (b3 > b4) {
			w = b3;
			b3 = b4;
			b4 = w;
		}
		if (b2 > b4) {
			w = b2;
			b2 = b4;
			b4 = w;
		}
		System.out.println(b1 + ", " + b2 + ", " + b3 + ", " + b4 + ", ");
		System.out.println((b4 - 1) * 10);

	}

}
