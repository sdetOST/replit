package Assessment_02_03;

public class Assesment_02_04 {

	public static void main(String[] args) {
		System.out.println(appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old."));
	}

	/**
	 * @param target   - string that you need to check.
	 * @param sentence - string where you need to lookup for the target string.
	 * @return
	 */
	public static boolean appearsTwice(String target, String sentence) {

		String[] array = sentence.toLowerCase().split(" ");
		target.toLowerCase();
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].contains(target))
				count++;
		}
		return (count == 2);
	}
}
