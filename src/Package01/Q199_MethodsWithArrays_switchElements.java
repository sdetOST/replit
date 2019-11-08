package Package01;

import java.util.Arrays;

public class Q199_MethodsWithArrays_switchElements {

	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(do_switch(i)));

	}

	public static int[] do_switch(int[] i) {
		int temp = i[0];
		i[0] = i[i.length - 1];
		i[i.length - 1] = temp;

		return i;

	}
}
