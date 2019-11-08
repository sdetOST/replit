package Package01;

import java.util.Scanner;

public class Q030_SecondsConverter {

	public static void main(String[] args) {
	    int inputSeconds, hours, minutes, seconds;
	    
	    Scanner scn = new Scanner(System.in);
	    System.out.println("Enter seconds:");
	    
	    inputSeconds = scn.nextInt();
	    
	    hours = inputSeconds/3600;
	    int k1 = inputSeconds%3600;
	    minutes = k1/60;
	    seconds = k1%60;
	    
	    System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
}
}