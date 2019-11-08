package q232_OOP21_battleshipPosition;

import java.util.Arrays;

public class position_manger {

	public String[][] boardR;// board array

	private String[] shipTypes = new String[] { "ss", "m", "dddd", "ccc" };

	public position_manger(String[][] br) {
		boardR = br;

	}// end constructor

	public boolean placeShip(int row, int column, int dir, int shipT) {
		String ship = null;
		int len = 0;
		switch (shipT) {
		case 0:	ship = "s";	len = 2;	break;
		case 1:	ship = "m";	len = 1;	break;
		case 2:	ship = "d";	len = 4;	break;
		case 3:	ship = "c";	len = 3;	break;
		default:	System.out.println("Invalid Entry");		break;
		}
		if (isValidPos(row, column, dir, len) == true && dir == 1) {
			for (int i = 0; i < len; i++) {
				boardR[row][column + i] = ship;
			}
			return true;
		}
		if (isValidPos(row, column, dir, len) == true && dir == 0) {
			for (int i = 0; i < len; i++) {
				boardR[row + i][column] = ship;
			}
			return true;
		}
		return false;

	}// end place_ship

	public boolean isValidPos(int row, int column, int dir, int len) {
		String ship = null;
		switch (len) {
		case 1:	ship = "m";	break;	case 2:	ship = "s";	break;
		case 3:	ship = "c";	break;	case 4:	ship = "d";	break;
		default:	System.out.println("Invalid Entry");	break;
		}

		if (dir == 1 && (column + len) <= boardR[row].length) {
			int num = 0;
			for (int i = 0; i < len; i++) {
				if (!boardR[row][column + i].equals("w"))
					num++;
			}
			return (num == 0);
		}
		if (dir == 0 && (row + len) <= boardR.length) {
			int num = 0;
			for (int i = 0; i < len; i++) {
				if (!boardR[row + i][column].equals("w"))
					num++;
			}
			return (num == 0);

		} else
			return false;

	}// end isValidPos

}