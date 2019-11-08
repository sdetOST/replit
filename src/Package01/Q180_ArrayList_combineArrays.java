package Package01;
/*
 
combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"
 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Q180_ArrayList_combineArrays {

	public static String combineRs(String[] r1, String[] r2) {
		ArrayList<String> combineList = new ArrayList<>();
		
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList(r1));
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(r2));
		
		combineList.addAll(list1);
		combineList.addAll(list2);
		
		String s = "";
		for (int i = 0; i < combineList.size(); i++) 	s+=combineList.get(i);
		
		return s;
		

	}
	public static void main(String[] args) {
		String[] r1 = {"1","2","3"};
		String[] r2 = {"4","5","6","7"};
		System.out.println(combineRs(r1, r2));
	}
}
