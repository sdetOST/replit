package Package01;

import java.util.Scanner;

/*

Message="Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}"
Extract Message to:

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programming and problem solving
 * 
 * 
 * 
 */
public class Q074_SMSmessage {

	public static void main(String[] args) {
		String message; 
		String sender;
		String phoneNumber;
		String messageBody;
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the message: ");
// This was the given message: 
// "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}" 		
		
		message = scan.nextLine();

		System.out.println("Sender: "+message.substring(8,message.indexOf(">")));
		System.out.println("Phone Number: "+message.substring(message.indexOf("[")+1,message.indexOf("]") ));
		System.out.println("Message body: "+message.substring(message.indexOf("{")+1,message.indexOf("}")));

//----------------------------------------------------------------------------------------------
//		String message1 = scan.next(); 			//	System.out.println(message1);
//		String message2 = scan.next(); 			//	System.out.println(message2);
//		String message3 = scan.next(); 			//	System.out.println(message3);
//		String message4 = scan.next();			//	System.out.println(message4);
//		String message5 = scan.next();			//	System.out.println(message5);
//		String message6 = scan.next();			//	System.out.println(message6);
//		String message7 = scan.next();			//	System.out.println(message7);
//		String message8 = scan.next();			//	System.out.println(message8);
//		String message9 = scan.next();			//	System.out.println(message9);
//		String message10 = scan.next();			//	System.out.println(message10);
//		
//		sender = message1+" "+message2;
//		phoneNumber = message3.concat(message4);
//		messageBody = message5+" "+message6+" "+message7+" "+message8+" "+message9+" "+message10;
//
//		System.out.println(sender);
//		System.out.println(phoneNumber);
//		System.out.println(messageBody);
	}
}
