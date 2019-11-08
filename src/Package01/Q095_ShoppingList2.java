package Package01;
/*
In this assignment, you will write a program that will generate a shopping list. 
It's more advanced version of assignment #22 (Shopping list I).
Your program should ask use to enter items followed by its price. 
After adding item, ask user if he wants to add one more item. 
If so, repeat previous steps again. If no, print shopping list report and total price 
as show in examples. Your program should accept up to 10 items. 
Hint: use do while loop.

Example:

output: Enter Item1 and its price:
input: Tomatoes
input: 5.5
output: Add one more item?
input: yes
output: Enter Item2 and its price:
input: Cheese
input: 3.5
output: Add one more item?
input: yes
output: Enter Item3 and its price:
input: Apples
input: 6.3
output: Add one more item?
input: no
output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
output: Total price: 15.3

Example:

output: Enter Item1 and its price:
input: Lemons
input: 2.3
output: Add one more item?
input: yes
output: Enter Item2 and its price:
input: Oranges
input: 6
output: Add one more item?
input: no
output: Item1: Lemons Price: 2.3, Item2: Oranges Price: 6.0
output: Total price: 8.3
 * 
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Q095_ShoppingList2 {

	public static void main(String[] args) {
		String [] items = new String[10];
		double[] price = new double[10];

   
	    Scanner scn = new Scanner(System.in);
    
	    System.out.println("Enter Item1 and its price:");
	    items[0] = scn.next();
	    price [0] = scn.nextDouble();

	    System.out.println("Add one more item?");
	    String ans = scn.next();
	    ans = ans.toLowerCase().trim();
	    
	    double total = price [0] ;
	    int i=1;

	    while  ( i <= 10 && ans.contentEquals("yes") ) {
	    	System.out.println("Enter Item"+(i+1)+" and its price:");
		    items[i]  = scn.next();
		    price[i] = scn.nextDouble();
		    total = total + price[i];
		    i++;
		    System.out.println("Add one more item?");
		    ans = scn.next();
		    ans = ans.toLowerCase().trim();
	    }
	    
	    for (int k = 0; k < i; k++ )
	    	
	    	System.out.print( "item"+(k+1)+": "+ items[k]+" Price: "+ price[k]+", " );
	    	System.out.print( "\nTotal price: "+total);
	    	
	}
}
