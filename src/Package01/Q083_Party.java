package Package01;
/*
Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:
Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda
 * 
 * 
 */
import java.util.Scanner;

public class Q083_Party {

	  public static void main(String[] args) {
		    
		    Scanner input = new Scanner(System.in);
		    String nameL ="";

		    System.out.println("Please enter guest name:");
		    String name = input.next();
		    System.out.println("Do you want to enter new guest name:");
		    String newGuest = input.next();
		    String newGuest1 = newGuest.toLowerCase().trim();
		    while ( newGuest1.equals("yes")) {
		     
		      System.out.println("Please enter guest name:");
		      String nameNext  = input.next();
		      name = name +", "+ nameNext;
		      System.out.println("Do you want to enter new guest name:");
			  newGuest = input.next();
			  newGuest1 = newGuest.toLowerCase().trim();
			  
		    }
		    
		    System.out.println("Guest's list: "+name);
	  }
}
