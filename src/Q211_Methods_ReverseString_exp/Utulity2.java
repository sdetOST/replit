package Q211_Methods_ReverseString_exp;

public class Utulity2 {

	public static String reverseLetters(String word) {

		char[] charArray = word.toCharArray();
// Initialize left and right pointers		
		int r = charArray.length - 1;
		int l = 0;						

// Traverse string from both ends until
// 'l' and 'r'
		while (l < r) {
			
			if (!Character.isAlphabetic(charArray[l]))					// Ignore special characters
				l++;
			else if (!Character.isAlphabetic(charArray[r]))
				r--;

			// Both str[l] and str[r] are not spacial
			else {
				char tmp = charArray[l];
				charArray[l] = charArray[r];
				charArray[r] = tmp;
				l++;
				r--;
			}
		}

		word = new String(charArray);

		return word;
	}

}