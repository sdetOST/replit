package Package01;
/*

Hypertext Markup Language (HTML) is the standard markup language for creating 
web pages and web applications. HTML is the language in which most websites 
are written. HTML is used to create pages and make them functional. 

Example: 
input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
output: myid

 */
import java.util.Scanner;

public class Q090_ParseHTML {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the html:  ");
		String html = scan.nextLine();
		
		int x = html.indexOf("id");
		int a = html.indexOf("\"", x+3);
		int b = html.indexOf("\"", a+1);
		
		if (a != -1) 		System.out.println(html.substring(a+1,b));
		else 				System.out.println("Invalid input!");
			
	}
		
}
