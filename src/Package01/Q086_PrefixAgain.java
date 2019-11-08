package Package01;

import java.util.Scanner;

public class Q086_PrefixAgain {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String str = scan.next();
	    System.out.print("Enter a number: ");
	    int n = scan.nextInt();
	    String x = str.substring(0,n);
	    String y = str.substring(n);

	       
	    System.out.println(y.contains(x)?"true":"false");
	    
		  }
}


