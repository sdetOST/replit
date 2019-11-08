package Package01;

import java.util.*;

public class Q212_MethodsWithArrayLists13_deliveryCalc {

	public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {
		int total = 0;
		int count = 0;

		for (int i = 0; i < deliveries.size(); i++) {

			count += deliveries.get(i);
		}

		if (count % max_fuel == 0)
			total = count / max_fuel;
		else
			total = 1 + count / max_fuel;

		return total;

	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(3);
		arr.add(1);
		arr.add(2);
		arr.add(6);

		int times = refuel_times(arr, 3);
		System.out.print(times);// should output 5

	}// end main
}
