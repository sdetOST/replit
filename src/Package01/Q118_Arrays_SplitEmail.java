package Package01;
/*

Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:
email --> info@cybertekschool.com
Print:  
Email id: info
Email domain: cybertekschool.com


If email contains no @ character or multiple @ characters then print invalid email:

email --> hello-gmail.com
print:  
invalid email

email --> my@fancy@email.com
print:  
invalid email

 */
import java.util.Scanner;

public class Q118_Arrays_SplitEmail {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter email : ");
	    String email = input.nextLine();
	    
		int b = 0;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@')
			++b;
		}
		if (b != 1 ) System.out.println("invalid email");
		else {
			
			String[] word = email.split("@");
			
			System.out.println("Email id: \n"+word[0]);
			System.out.println("Email domain: \n"+word[1]);
		}
	    
	    
	}

}
