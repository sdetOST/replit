package Package01;

import java.util.Scanner;

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

public class Q095_ShoppingList2_W2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;

		do {

			System.out.println("Enter Item"+count+" and its price:");
			item = scn.next();
			price = scn.nextDouble();
			shoppingListReport = shoppingListReport + "Item" + count + ": " + item + " Price: " + price + ", ";
			totalPrice = totalPrice + price;
			count++;
			System.out.println("Add one more item?");
			countinue = scn.next();
			countinue = countinue.toLowerCase().trim();
		} while (countinue.equals("yes"));
		int q = shoppingListReport.length();
		String slp =  shoppingListReport.substring(0,q-2);
		System.out.println(slp);
		System.out.println("Total price: "+totalPrice);

	}
}
