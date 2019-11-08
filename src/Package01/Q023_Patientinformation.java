package Package01;
import java.util.Scanner;

public class Q023_Patientinformation {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the patient portal!");
		System.out.println("Please enter your personal information");
		System.out.println();
		
		String firstName, lastName, fullName, email, street, state, city, address, contacts;
		int age, zipcode;
		double height, weight;
		boolean isMarried;
		long workPhoneNumber,personalPhoneNumber;

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter your first name");                         // James
		firstName=scan.nextLine();
		System.out.println("Enter your last name");  						//	May
		lastName=scan.nextLine();
		System.out.println("Enter your email");							// jamesmay@gmail.com
		email=scan.nextLine();
		System.out.println("Enter your street");						// 7925 Jones Branch Dr
		street=scan.nextLine();
		System.out.println("Enter your city");							// McLean
		city=scan.nextLine();
		System.out.println("Enter your state");							// VA
		state=scan.nextLine();
		System.out.println("Enter your zip code");						// 22102
		zipcode=scan.nextInt();
		System.out.println("Enter your work phone number");				// 7896542314
		workPhoneNumber=scan.nextLong();
		System.out.println("Enter your personal phone number");			// 2406542314
		personalPhoneNumber=scan.nextLong();
		System.out.println("Enter your age");							//	35
		age=scan.nextInt();
		System.out.println("Enter your height");						//	5.10
		height=scan.nextDouble();
		System.out.println("Enter your weight");						// 173.2
		weight=scan.nextDouble();
		System.out.println("Are you married?");							// 	true
		isMarried=scan.nextBoolean();
		contacts="Contacts: work phone number - "+workPhoneNumber+", personal phone number - "
						+personalPhoneNumber+",  email: "+email;

		fullName="Full name: "+firstName+", "+lastName;													//May, James
		

		address="Address: "+street+", "+city+", "+state+", "+zipcode;  			// variable by concatenating street, city, state, zip code

	
		System.out.println("Patient personal information");						// Patient personal information

		System.out.println(fullName);											//	Full name: May, James
		System.out.println(address);											//Address: 7925 Jones Branch Dr, McLean, VA 22102
		System.out.println(contacts);											//Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
		System.out.println("Age: "+age);										//Age: 35
		System.out.println("Height: "+height);									//Height: 5.1
		System.out.println("Weight: "+weight+" pounds");						//Weight: 173.2 pounds
		System.out.println("Married?: "+isMarried);								//Married?: true

	}

}
