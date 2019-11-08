package Package01;

public class Q193_MethodsWithString_palindrome {

	public static void main(String[] args) {
		String check = "Noon";
		System.out.println(isPalindrome(check));

	}
	  public static boolean isPalindrome(String check) {
		    String s1 = check.toLowerCase();
		    String s2 = s1.replace(" ","");
				int l = s2.length();
				String reverse = "";
				while (l > 0) {
					l--;
					reverse += s2.charAt(l);
				}
				System.out.println(s2);
				System.out.println(reverse);
				return (s2.equals(reverse)) ? true : false;
		    
		  }
}
