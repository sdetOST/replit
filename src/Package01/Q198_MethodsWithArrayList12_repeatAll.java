package Package01;

import java.util.ArrayList;
import java.util.Arrays;

public class Q198_MethodsWithArrayList12_repeatAll {

	public static void main(String[] args) {
		ArrayList<Boolean> list = new ArrayList<>(Arrays.asList(true, false, false));
		repeatAL(list);
	}
	public static void repeatAL(ArrayList<Boolean>  list) {
		  
		  list.addAll(list);
		  System.out.println(list);	
	}
}
