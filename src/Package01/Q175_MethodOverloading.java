package Package01;

import java.util.*;

public class Q175_MethodOverloading {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 33, 4, 5 };
		Double[] arry = { 1.0, 2.0, 33.0, 4.0, 5.0 };

		System.out.println(findMax(arr));
		System.out.println(findMax(arry));
	}

	public static int findMax(int[] arr) {
		Arrays.sort(arr);
		int r = arr[arr.length - 1];
		return r;
	}

	public static Double findMax(Double[] arry) {
		Arrays.sort(arry);
		Double r2 = arry[arry.length - 1];
		return r2;
	}
}