package Package01;

import java.util.Arrays;
import java.util.Scanner;

public class Q127_Arrays_PrintShortestWord2 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the string: ");
	    String str = scan.nextLine();
		
		str = str.replace(" ","");
	    String[] array = str.split(",");
		
	    System.out.println(Arrays.toString(array));
//	    System.out.println(array[1]);
	    
	    int shorter = array[0].length();
	    for (int i = 0; i < array.length; i++) {
	    	if (array[i].length()<shorter) {
	    		shorter = array[i].length();
	    		}
		}
	    String s = "";
    	for (int  j= 0; j < array.length; j++) {
	    	if (array[j].length()==shorter) s = s + array[j]+ ", ";
	    		
	    }
     	
    	String ss = s.substring(0, s.length()-2);
    	
    	System.out.println("["+ss+"]");
	
		}
}
