package Package01;

import java.util.Scanner;

/*
A sandwich is two pieces of bread with something in between. Print the string 
that is between the first and last appearance of "bread" in the given string, 
or return string "nothing" if there are not two pieces of bread.

Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam

Example:
input: xxbreadapple
output: nothing

Example:
input: breadbutterbread
output: butter 
 
*/

public class Q093_GetSandwich {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sandwich string: ");
		String str = scan.next();

		int n = str.indexOf("bread");
		int m = str.indexOf("bread", n + 6);

		if (n != -1 && m != -1) {
			System.out.println(str.substring(n + 5, m));
		} else
			System.out.println("nothing");

	}
}
