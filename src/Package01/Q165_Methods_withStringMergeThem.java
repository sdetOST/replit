package Package01;
/*
When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.   Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"

 */
public class Q165_Methods_withStringMergeThem {

	public static void main(String[] args) {
		String one = "spoon";
		String two = "java";

		System.out.println(mergeStrings(one, two));
	}
	public static String mergeStrings(String one, String two) {

		int a = one.length();
		int b = two.length();
		int n = (a < b) ? a : b;
		String merg = "";
		for (int i = 0; i < n; i++) {
			merg += "" + one.charAt(i) + two.charAt(i);
		}
		if (a > b) {
			for (int i = n; i < a; i++)	merg += one.charAt(i);
		}
		if (b > a) {
			for (int i = n; i < b; i++)	merg += two.charAt(i);
		}
		return merg;
	}
}