package Package01;

import java.util.Arrays;

public class Q177_Methods_Arrays_Merge {

	public static int[] mergR(int[] a, int[] b) {
		
		Arrays [] r = new Arrays[a.length+b.length];
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			
			r[count++]=a[i];
			
		}
		return r;
			

	}// end mergR

	public static void main(String[] args) {

	}
}
