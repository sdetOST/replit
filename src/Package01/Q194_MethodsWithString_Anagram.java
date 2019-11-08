package Package01;

import java.util.*;

public class Q194_MethodsWithString_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isAnagram(String word1, String word2) {
		char[] array1 = word1.toLowerCase().replace(" ", "").toCharArray();
		char[] array2 = word2.toLowerCase().replace(" ", "").toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		String s1 = Arrays.toString(array1);
		String s2 = Arrays.toString(array2);

		return (s2.equals(s1)) ? true : false;
	}
}
