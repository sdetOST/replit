package Package01;

import java.util.Scanner;

public class Q084_Factorial {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");    
		long x = scan.nextInt();
		long n = 1;
//		int m = 1;
//	    while ( m <=x  ){
//	       n = n * m ;
//	       m++;
//		      
//	    }
//	    System.out.println(n);
	    
//----------------------------------------
	    for (int i = 1; i <= x; i++)
	    	
	    	n=n*i;
	    
	    System.out.println(n);
	    
	    
	}
}
