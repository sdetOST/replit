package Package01;
/*
Given a 8x8 two-dimensional array of strings named chessboard. 
Initialize values inside an array accordingly to the chess board. 
So first element in the array, chessboard[0][0] should have a value "1a", 
and last element in the array, chessboard[7][7] should have a value "8h".

*/

import java.util.Arrays;

public class Q135_2DArrays_ChessBoard {

	public static void main(String[] args) {
		String[][] chessBoard = new String[8][8];

		for (int i = 0; i < chessBoard.length; i++) {
			String c = "a";
			int x = 'a';										//
			for (int j = 0; j < chessBoard[i].length; j++) {
				chessBoard[i][j]=(i+1)+c+"";
				x++;
				c = (char)(x)+"";
			}
		}

		System.out.println(Arrays.deepToString(chessBoard));

	}
}

//			int x = Integer.parseInt(c);
//
//			String c = Integer.toString(x);  or  String c = String.valueOf(x);
