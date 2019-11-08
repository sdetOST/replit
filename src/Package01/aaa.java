package Package01;

import java.util.Arrays;

public class aaa {

	public void main(String[] args) {		
//		AirConditioner ac = new AirConditioner();
//		ac.brand = "Samsung";
//		ac.currentTemp = 79.7f;
//		ac.isOn = true;

		int[] arr = { 1, 2, 33, 4, 5 };
		Double[] arry = { 1.0, 2.0, 33.0, 4.0, 5.0 };

		System.out.println(findMax(arr));
		System.out.println(findMax(arry));
	}

	public int findMax(int[] arr) {
		Arrays.sort(arr);
		int r = arr[arr.length - 1];
		return r;
	}

	public Double findMax(Double[] arry) {
		Arrays.sort(arry);
		Double r2 = arry[arry.length - 1];
		return r2;
	}
}
