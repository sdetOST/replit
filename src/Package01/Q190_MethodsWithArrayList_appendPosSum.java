package Package01;
/*
Create a static method that:

is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers
 
This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), 
the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).  
The original ArrayList should remain unchanged.

*/
import java.util.*;
public class Q190_MethodsWithArrayList_appendPosSum {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(-1, -2, -2, 3, 4, 5, -3, -5));
		
		System.out.println(appendPosSum(nums));

	}

	public static ArrayList appendPosSum(ArrayList<Integer> nums) {
		ArrayList<Integer> res = new ArrayList<>();
		int s = nums.size();
		int t = 0;
		for (int i = 0; i < s; i++) {
			if (nums.get(i) >= 0) {
				res.add(nums.get(i));
				t += nums.get(i);
			}
		}

		res.add(Integer.valueOf(t));

		return res;
	}
}
