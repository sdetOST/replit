package Package01;
/*
Write a program that will print out rout instructions. Your program should take 2 parameters: 
start point and end point. Use left, right, up and down for navigation. 
Insert ">" between commands. 
If start point equals to end point - 
display: "start/end(start or end variable!) found". 
Note: you may move only clock wise.       
 A  __________  B
   |  ---->   |
   |          |
   | ^     |  |
   | |     v  | 
   |  <---    |
   |__________| 
  D             E 

Example:
Input: A
Input: D
Output: right > down > left: D found

Example:
Input: C
Input: C
Output: C found
 * 
 */
import java.util.Scanner;

public class Q073_BuildRoute_W2 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    for(int i = 1; i>0; i++) {
	    System.out.print("Enter the Start Point: ");
	    String start = scan.next();
	    scan.nextLine();
	    System.out.print("Enter the End Point: ");
	    String end = scan.next();
	    
	    String r = start + end;
	    
	    switch (r) {
    		case "AA":	System.out.println("A found");						break;
    		case "BB":	System.out.println("B found");						break;
    		case "CC":	System.out.println("C found");						break;
    		case "DD":	System.out.println("D found");						break;
    		case "AB":	System.out.println("right: B found");				break;
    		case "AC":	System.out.println("right > down: C found");		break;
    		case "AD":	System.out.println("right > down > left: D found");	break;
    		case "BA":	System.out.println("down > left > up: A found");	break;
    		case "BC":	System.out.println("down: C found");				break;
    		case "BD":	System.out.println("down > left: D found");			break;
    		case "CA":	System.out.println("left > up: A found");			break;
    		case "CB":	System.out.println("left > up > right: B found");	break;
    		case "CD":	System.out.println("left: D found");				break;
    		case "DA":	System.out.println("up: A found");					break;
    		case "DB":	System.out.println("up > right: B found");			break;
    		case "DC":	System.out.println("up > right > down: C found");	break;
    		}
	    }
	}
}
