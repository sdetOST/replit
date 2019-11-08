package Package01;

import java.util.Scanner;

public class Q022_Shoppinglist1 {

	public static void main(String[] args) {
	    String item1,item2,item3,report;
	    double price1, price2, price3, totalPrice;
	    
	    Scanner scn = new Scanner(System.in);
	    System.out.println("Enter Item1 and its price:");
	    item1 = scn.next();
	    price1 = scn.nextDouble();
	    System.out.println("Enter Item2 and its price:");
	    item2 = scn.next();
	    price2 = scn.nextDouble();
	    System.out.println("Enter Item3 and its price:");
	    item3 = scn.next();
	    price3 = scn.nextDouble();
	    
	    report = "Item1: "+item1+" Price:"+price1+", Item2: "+item2+" Price:"+price2+", Item3: "+item3+" Price:"+price3;
	    
	    System.out.println(report);
	    
	    System.out.println("Total price: "+(price1+price2+price3));
	    
	}
	
}
