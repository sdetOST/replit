package Package01;

import java.util.Arrays;

public class Q203 {

	public static void main(String[] args) {

		int[] i = new int[3];
		i = populate(i);
		System.out.println(Arrays.toString(i));
		i[0]=1;

	}

	public static int[] populate(int[] r) {
		for (int j = 0; j < 3; j++)
			r[j] = j + 1;
		return r;

	}

}
