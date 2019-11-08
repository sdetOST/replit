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
public class Q073_BuildRoute {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter the Start Point: ");
	    String start = scan.next();
	    scan.nextLine();
	    System.out.print("Enter the End Point: ");
	    String end = scan.next();
	    String st = "";  //  "0,1";
	    String ed = "";  //  "0,1";
	    
	    String r1 = "";
	    String r2 = "";

    
	    switch (start) {
	    	case "A":	st = "01";	break;
	    	case "B":	st = "11";	break;
	    	case "C":	st = "10";	break;
	    	case "D":	st = "00";	break;
	    	}
	    switch (end) {
			case "A": 	ed = "01";	break;
			case "B": 	ed = "11";	break;	
			case "C": 	ed = "10";	break;
			case "D":  	ed = "00";	break;
    	    }
	    
	    int xst = st.charAt(0);	System.out.println("xst :"+xst);				// 48
	    int yst = st.charAt(1);	System.out.println("yst :"+yst);				//49
	    int xed = ed.charAt(0);	System.out.println("xed :"+xed);
	    int yed = ed.charAt(1); System.out.println("yed :"+yed);
	    

	    
	    if (xst == xed && yst == yed) {	r1 = ""; r2 = ""; System.out.println(end+" found");}
	    else { 	    
	    	if (xst > xed)			r1 = "left>";
	    	else if (xst < xed) 	r1 = "right>";
	    	else if (xst == xed)	r1= "";
	    	
		    if (yst > yed) 			r2 = "down";
		    else if (yst < yed)		r2 = "up";
		    else if (yst == yed)	r2 = "";
		    
		    System.out.println(r1+r2+": "+end+" found");
		    }
	    
	   

	}

}
