package Package01;

public class Q174 {

	public static String lameDb(String db, String op, String id, String data) {
		String[] array = db.split("#");
		String s = "";
		if (op.equals("add"))
			s = db + "#" + id + data;
		else if (op.equals("edit")) {
			switch (id) {
			case "1":
				s = "1" + data + "#" + array[1] + "#" + array[2];
				break;
			case "2":
				s = array[0] + "#2" + data + "#" + array[2];
				break;
			case "3":
				s = array[0] + "#" + array[1] + "#3" + data;
				break;
			}
		} else if (op.equals("delete")) {
			switch (id) {
			case "1":
				s = "#" + array[1] + "#" + array[2];
				break;
			case "2":
				s = array[0] + "#" + array[2];
				break;
			case "3":
				s = array[0] + "#" + array[1];
				break;
			}
		} else
			s = db;
		return s;

	}// end lameDb

	public static void main(String[] args) {

		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

		System.out.print(lameDb("1aaa#2ccc#3bbb", "none", "1", "") + "\n");

	}

}
