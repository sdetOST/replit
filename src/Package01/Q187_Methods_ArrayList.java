package Package01;

import java.util.ArrayList;
import java.util.Arrays;

public class Q187_Methods_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
		String targetWord = "2";
		
		System.out.println(removeAll(wordList, targetWord));

	}
	  public static void removeAll(ArrayList<String> wordList, String targetWord) {
		    
		    for (int i = 0; i < wordList.size(); i++)    wordList.remove(targetWord);
		    
		  }
}
