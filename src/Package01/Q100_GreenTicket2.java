package Package01;
/*
You have a green lottery ticket, with ints a, b, c and d on it. 
If the numbers are all different from each other, the prize is 0. 
If all of the numbers are the same, the prize is 30. 
If two of the numbers are the same, the prize is 10. 
If three of the numbers are the same, the prize is 20.

Example:
input: 1
input: 1
input: 1
input: 1
output: 30

Example:
input: 2
input: 1
input: 1
input: 1
output: 20

Example:
input: 2
input: 3
input: 1
input: 1
output: 10

Example:
input: 4
input: 3
input: 2
input: 1
output: 0 
 */

import java.util.Scanner;

public class Q100_GreenTicket2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int prize = 0;

	    System.out.println("please enter the first digit: ");	int a = scan.nextInt();
	    System.out.println("please enter the second digit: ");  int b = scan.nextInt();
	    System.out.println("please enter the third digit: "); 	int c = scan.nextInt();
	    System.out.println("please enter the forth digit: "); 	int d = scan.nextInt();
	    
	    
	    if ( a==b && b==c && c==d) 	prize = 30;
	    else if ( (a==b && b==c) || (a==b && b==d) || (a==c && d==c) || (c==b && d==c)) prize = 20;
	    else if ( a==b || a==c || a==d || b==c || b==d || c==d ) prize = 10;
	    else prize = 0;
	    
	    System.out.println(prize);
	    

	}

}
