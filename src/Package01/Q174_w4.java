package Package01;

public class Q174_w4 {

	public static String lameDb(String db, String op, String id, String data) {
		String result = "";
		switch (op) {
		case ("add"):
			result = db + "#" + id + data;
			break;
		case ("edit"):
			int index = db.indexOf(id);
			result = db.replace(db.substring(index, index + 4), (id + data));
			break;
		case ("delete"):
			String[] newDb = db.split("#");
			if (id.equals("1")) {
				result = "#" + newDb[1] + "#" + newDb[2];
			}
			if (id.equals("2")) {
				result = newDb[0] + "#" + newDb[2];
			}
			if (id.equals("3")) {
				result = newDb[0] + "#" + newDb[1] + "#";
			}
			break;
		case ("none"):
			result = db;
			break;
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");

		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");
		
		System.out.print(lameDb("1aaa#2ccc#3bbb", "none", "1", "") + "\n");

	}

}
