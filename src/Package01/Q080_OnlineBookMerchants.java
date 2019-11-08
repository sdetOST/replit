package Package01;
/*

Online Book Merchants offers premium customers 
1 free book with every purchase of 5 or more books and offers 
2 free books with every purchase of 8 or more books. 
It offers regular customers 
1 free book with every purchase of 7 or more books, and offers 
2 free books with every purchase of 12 or more books. 
Write a program that assigns freeBooks the appropriate value 
based on the values of the boolean variable isPremiumCustomer 
and the int variable nbooksPurchased. 
Print amount of freeBooks into the console.  

*/
import java.util.Scanner;

public class Q080_OnlineBookMerchants {

	public static void main(String[] args) {
		int freeBooks = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Premium Customer?, true or false ");
		boolean isPremiumCustomer = scan.nextBoolean();
		System.out.println("Number of book purchased:  ");
		int nbooksPurchased = scan.nextInt();

		if (isPremiumCustomer) {
			if (nbooksPurchased >= 8)			freeBooks = 2;
			else if (nbooksPurchased >= 5)		freeBooks = 1;
//		    else freeBooks = 0;
		} else {
			if (nbooksPurchased >= 12)			freeBooks = 2;
			else if (nbooksPurchased >= 7)		freeBooks = 1;
//		    else freeBooks = 0;
		}
		System.out.print(freeBooks);
	}
}
