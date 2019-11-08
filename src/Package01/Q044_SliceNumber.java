package Package01;

import java.util.Scanner;

public class Q044_SliceNumber {

	public static void main(String[] args) {
	    int num, digit1, digit2, digit3, digit4, digit5;
	    
	    Scanner scan = new Scanner(System.in);
	   
	    System.out.println("Enter your number:");
	    num = scan.nextInt();
	    digit5 = num%10;
	    num = num/10;
	    digit4 = num%10;
	    num = num/10;
	    digit3 = num%10;
	    num = num/10;
	    digit2 = num%10;
	    num = num/10;
	    digit1 = num%10;
	    num = num/10;
	    System.out.println("Display prompt: "+digit1);
	    System.out.println("Display prompt: "+digit2);
	    System.out.println("Display prompt: "+digit3);
	    System.out.println("Display prompt: "+digit4);
	    System.out.println("Display prompt: "+digit5);
	  }
}
