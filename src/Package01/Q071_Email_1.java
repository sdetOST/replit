package Package01;
/*
 
In this task, you need to swap first name with last name in the email. 
If email doesn't contains underscore - do not anything. 
Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: viktoryakubovich@gmail.com
output: viktoryakubovich@gmail.com

 */
import java.util.Scanner;

public class Q071_Email_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the email adress: ");
	    String email = scan.next();
	    int l = email.length();
	    String result;
	    int ind1 = email.indexOf('_');
	    int ind2 = email.indexOf('@');

	    
	    if (ind1 != -1) {
	    result = email.substring(ind1+1,ind2) + "_" + email.substring(0,ind1) + email.substring(ind2);
	    } else result = email;
	    
	    System.out.println(result);
	    	
	    }
}
