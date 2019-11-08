package Package01;
/*

add_to_r is a method that gets an array and a number.

the method creates a new array bigger by one then (int[] r).
It populates the new array with the old ones(r) values.
and finally in the last position adds the number (int n) to it.

for example:

method input: add_to_r(new int{1,5,77,8}  ,2)

outputs (int array):
[1, 5, 77, 8, 2]


*/

import java.util.Arrays;
import java.util.Scanner;

public class Q148_Methods11_AddToArray {

	  public static void add_to_r(int[] r,int n) {
			
			int nsize = r.length +1; 
			int[] new_r = new int[nsize];
			
	    System.arraycopy(r, 0, new_r, 0, nsize-1);
	    new_r[nsize-1]=n;
	    
	    System.out.println(Arrays.toString(new_r));
			
		}
	  
	  public static void main(String[] args) {
	    
	    
	    Scanner inp = new Scanner(System.in);
	    System.out.println("Enter the size of array and the number you would like to add: ");
	    int size = inp.nextInt(),n = inp.nextInt();
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++){
	    	System.out.println("Enter the element"+(i+1)+": ");
	        arr[i]=inp.nextInt();
	    }
	    
	     add_to_r(arr, n);
	   
	    
	  }
	}
