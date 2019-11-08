package Package01;

public class Q174_w3 {

	public static void main(String[] args) {
		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "3", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");

		System.out.print(lameDb("1aaa#2ccc#3bbb", "none", "1", "") + "\n");

	}

	public static String lameDb(String db, String op, String id, String data) {
		String[] arr = db.split("#");
		String newdb = "";
		int num = Integer.parseInt(id);
		if (op.equals("add"))
			newdb = db + "#" + id + data;
		else if (op.equals("edit")) {
			arr[num - 1] = id + data;
			newdb = arr[0] +"#"+ arr[1]+"#"+ arr[2];
		} else if (op.equals("delete")) {
			arr[num - 1] = "";
			if ( num == 1 )	newdb = arr[0] +"#"+ arr[1]+"#"+ arr[2];
			else newdb = arr[0]+"#"+ arr[1]+arr[2];
		} else if (op.equals("none"))
			newdb = db;
		return newdb;
	}
}
