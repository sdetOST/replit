package Package01;
/*
 
In this task, we gonna talk about JSON files. JavaScript Object Notation (JSON) -  
is a language-independent data format. Write a program that will parse JSON file, 
and print out into the console first name and last name as displayed in the example below. 
In this task, JSON file will be provided as a String variable. 
 
Example:
input:{"id": 1934, "firstName": "James", "lastName": "May", "role": "student-team-member"}
output:
First name: James
Last name: May
  
  
*/

import java.util.Scanner;

public class Q092_ParseJSON {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the html:  ");
		String json = scan.nextLine();
		json = json.replace(" ", "");
		
		int x = json.indexOf("firstName")+ 12;
		int y = json.indexOf("lastName")+ 11;
		int a = json.indexOf("\"", x+1);
		int b = json.indexOf("\"", y+1);
		
		
		System.out.println("First name: "+ json.substring(x,a));
		System.out.println("Last name: "+ json.substring(y,b));
			
	}
		
}
