package Package01;
import java.util.Arrays;
import java.util.Scanner;
/*
The method person get a string with this format : "name,last name,age"
for example: 

person("jon,doe,30");

the output is:
 
person name: jon last name: doe age: 30

hint: use the split method to split the string to a string array where there is a "," char
 
 */
public class Q145_Methods8_SplitPersonInfo {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter name,last name and age: ");
		String s = inp.nextLine();

		person(s);
	}

	public static void person(String s) {
		
		String[] array = s.split(",");
		
		System.out.printf("person name: "+array[0]+" last name: "+array[1]+" age: "+array[2]);

	}

}
