package Package01;
/*
Given a method printDataTypes with one string parameter, that must 
determine which primitive data types are capable of properly storing that input. 
Please complete an implementation of this method.

Example:
input: -100
output:
-100 can be fitted in:
* byte
* short
* int 
* long

Example:
input: 32000
output:
32000 can be fitted in:
* short 
* int 
* long

Example:
input:  2147483000
output:
2147483000 can be fitted in: 
* int 
* long

Example:
input: 213333333333333333333333333333333333
output: 213333333333333333333333333333333333 can't be fitted anywhere.

*/
import java.util.Scanner;

public class Q150_Methods13_VerifyDatatypes {

	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter the number: ");
		    String numStr = scan.next();
		    printDataTypes(numStr);
		  }
		  
		  public static void printDataTypes(String numStr){
		    long num = 0;
		    try{
		       num = Long.valueOf(numStr);
		       System.out.println(num+" can be fitted in:");
		       if(num>=-128 && num<=127){
		            System.out.println("* byte");
		        }
		       if(num>=-32768 && num<=32767){
		            System.out.println("* short");
		        }
		       if(num>=-Math.pow(2, 31) && num<=Math.pow(2, 31)-1){
		            System.out.println("* int");
		        }
		       if(num>=-Math.pow(2, 63) && num<=Math.pow(2, 63)-1){
		            System.out.println("* long");
		        }
		    }catch(Exception e){
		       System.out.println(numStr+" can't be fitted anywhere.");
		    }
		  }
		}
