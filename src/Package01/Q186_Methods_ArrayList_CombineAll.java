package Package01;

/*
 Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add all the words (in order) from wordList1, 
then add all the words (in order) from wordList2.  In other words, it is combining all the elements 
from the two parameters.
 */
import java.util.*;

public class Q186_Methods_ArrayList_CombineAll {

	public static void main(String[] args) {

		ArrayList<String> wordList1 = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
		ArrayList<String> wordList2 = new ArrayList<>(Arrays.asList("6", "7", "8"));

		System.out.println(combineAL(wordList1, wordList2));
	}

	(strin)

		ArrayList<String> combineList = new ArrayList<>();
		combineList.addAll(wordList1);
		combineList.addAll(wordList2);

		return combineList;
	}

}
