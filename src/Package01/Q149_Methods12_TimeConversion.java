package Package01;
/*

Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45

 */

import java.util.Scanner;

public class Q149_Methods12_TimeConversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the time: ");
		timeConversion(scan.nextLine());
	}

	public static void timeConversion(String s) {
		String s1 = s.substring(0, s.length()-2);
		String[] array =s1.split(":");
		String sh = array[0];	int h = Integer.parseInt(sh); 
		String sm = array[1];	int m = Integer.parseInt(sm);
		String ss = array[2];	int sn = Integer.parseInt(ss);
		String aMpM = s.substring(s.length()-2);
		aMpM = aMpM.toLowerCase();

		if (aMpM.equals("pm")) h = h + 12;
			
		if ( h < 10) sh = "0"+Integer.toString(h);
		else sh = Integer.toString(h);
		if ( m < 10) sm = "0"+Integer.toString(m);
		else sm = Integer.toString(m);
		if ( sn < 10) ss = "0"+Integer.toString(sn);
		else ss = Integer.toString(sn);
		
		System.out.print(sh + ":" + sm + ":" + ss);
	}
}
