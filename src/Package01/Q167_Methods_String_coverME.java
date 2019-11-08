package Package01;

/*
 
CoverString method will take 2 string parameters from the caller. 

Your job is to write an important code that will :

- to search and find each appearance of coverME within main
- then surround it with [coverMe] (square brackets)
- if you cannot find the coverME within main after tirelessly looping then just return whole main itself covered [main].
- keep in mind that coverME value can be of any length.

Examples:
coverString("java methods", "me") ) ; ==> "java [me]thods"

coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"

coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"

coverString("apples", "pears") ) ; ==> "[apples]" 
 
 */
public class Q167_Methods_String_coverME {

	public static void main(String[] args) {

		System.out.println(coverString("apples", "oo")); // java [me]thods
	}

	public static String coverString(String main, String coverME) {
		
		String coverME2 = "[" + coverME + "]";
		String main2 = "[" + main + "]";
		main = main.contains(coverME)? main.replace(coverME, coverME2):main.replace(main, main2);
			
		return main;
	}
}
