package Package01;
/*
 * 
Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;

public class q221 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
				
		System.out.println(twoTimes(list1));

	}
	public static ArrayList<Integer> twoTimes(ArrayList<Integer> ints){
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < ints.size(); i++) {
			list.add(ints.get(i));
			list.add(ints.get(i));
		}
		return list;
		
		
	}
	

}
