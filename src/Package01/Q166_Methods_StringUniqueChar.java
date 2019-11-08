package Package01;

public class Q166_Methods_StringUniqueChar {

	public static void main(String[] args) {
		String str = "spoon";
		System.out.println(uniqueChars("wooden-spoon"));
	}

	public static String uniqueChars(String str) {
		String s = "";
		for (int j = 0; j < str.length(); j++) {
			char c = str.charAt(j);
			if (s.contains(c + ""))
				continue;
			s = s + str.charAt(j);
		}
		return s;

	}
}
