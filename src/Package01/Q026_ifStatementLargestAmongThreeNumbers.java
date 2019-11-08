package Package01;

import java.util.Scanner;

public class Q026_ifStatementLargestAmongThreeNumbers {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
//	    System.out.println("---------------");
//	    System.out.println("select an option:");
//	    System.out.println("1) option 1");
//	    System.out.println("2) option 2");
//	    System.out.println("3) option 3");
//	    System.out.println("---------------");
//	    
//	    int choice = s.nextInt();
//	    
//	    if (choice == 1) System.out.println("user selected 1");
//	    if (choice == 2) System.out.println("user selected 2");
//	    if (choice == 3) System.out.println("user selected 3");

	    float a =10.0f;
	    float b = 2.0f;
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println("enter choice"); 
	    String in = s.next();
	     
	    if (in == "burger" || in == "chicken" )
	     System.out.println(a);
	    if (in == "soda")
	     System.out.println(b);
	}
}
