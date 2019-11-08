package Package01;

import java.util.Arrays;

public class Q132_2DArrays_MultiplicationTable {

	public static void main(String[] args) {

		int[][] multiplicationTable = new int[10][10];
		for (int i = 0; i < multiplicationTable.length; i++) {
			for (int j = 0; j < multiplicationTable[0].length; j++) {
				multiplicationTable[i][j] = (i + 1) * (j + 1);

			}
		}

		System.out.println(Arrays.deepToString(multiplicationTable));
		
		
//	    for(int i=0 ;i<rows1;i++) {
//	        for(int j=0 ;j<cols-1;j++) {
//	          iff (arr[i][j]=arr[i][j+1]){
//	          System.out.println("matches: "+arr[i][j]};
//	        }
//	      }

	}
}
