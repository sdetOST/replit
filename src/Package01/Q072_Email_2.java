package Package01;
/*
 
Write a program that will print out information about user based on email. 
Print first and last name from the upper case. 

Example:
Input: craig_federighi@apple.com
Output: 
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com

 */
import java.util.Scanner;

public class Q072_Email_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the email adress: ");
		String email = scan.next();

		int ind1 = email.indexOf('_');
		int ind2 = email.indexOf('@');
		int ind3 = email.indexOf('.');
		String firstName, lastName, domain, topLevelDomain;

		firstName = email.substring(0, 1).toUpperCase() + email.substring(1, ind1);
		lastName = email.substring(ind1+1, ind1+2).toUpperCase() + email.substring(ind1 + 2, ind2);
		domain = email.substring(ind2 + 1, ind3);
		topLevelDomain = email.substring(ind3+1);

		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Domain: " + domain);
		System.out.println("Top-Level Domain: " + topLevelDomain);
	}
}