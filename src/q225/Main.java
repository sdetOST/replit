package q225;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		MultiplicationTable table = new MultiplicationTable();
		System.out.println(Arrays.toString(table.generateTable(3,6)));

		int[] mult = {0,3,6,9,12,15};
		table.checkTable(3,mult);
		System.out.println(table.checkTable(3,mult));
		
	}

}
