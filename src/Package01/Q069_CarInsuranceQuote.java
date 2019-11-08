package Package01;

import java.util.Scanner;

public class Q069_CarInsuranceQuote {

	public static void main(String[] args) {
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String dL = "";
		String accident="";
		String referenceNumber=""; 
		int zip = 0;
		int age = 0;
		int experience =1;

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		System.out.println("Enter your name");
		name = scan.nextLine();
		System.out.println("Do you have a US driver license?");
		dL = scan.nextLine();
		dL=dL.toLowerCase();
		dL=dL.trim();
		    
		if (dL.equals("no")) {
			System.out.println("Invalid data!"); 
			System.exit(0);
		}else premium *=1;
			
		System.out.println("Enter your zip code");
		zip = scan.nextInt();
		premium = (zip == 20910 || zip == 20740 )? premium + 60 :
				(zip == 22102  || zip == 22103 )? premium + 30 :
					   premium + 50;
				
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership = scan.next();
		vehicleOwnership = vehicleOwnership.toLowerCase();
		vehicleOwnership = vehicleOwnership.trim();
		premium = (vehicleOwnership.equals("owned") )? premium + 10 : premium + 20;
			
		System.out.println("How is this vehicle primarily used?");
		vehicleUsage = scan.next();
		vehicleUsage = vehicleUsage.toLowerCase();
		vehicleUsage = vehicleUsage.trim();
		switch (vehicleUsage){
			case "business": premium += 50; break;
			case "pleasure": premium += 10; break;
			case "commute": premium += 20; break;
			default:System.out.println("Invalid data!");break;
			}
			
		if (vehicleUsage.equals("commute")) {
			System.out.println("Days Driven To Work And/Or School");
			daysDrivenToWorkOrSchool = scan.nextInt();
			premium = premium + 5 * daysDrivenToWorkOrSchool;
			System.out.println("Miles Driven To Work And/Or School");
			milesToWorkOrSchool = scan.nextInt();
			premium = premium + milesToWorkOrSchool;
		}else premium *= 1;
			
		System.out.println("How old are you?");
		age = scan.nextInt();
			
		if ( age < 16) {
			System.out.println("Invalid data!");
			System.exit(0);
			}
		else if( age >= 16 && age < 18)	premium *= 20 ;
		else if( age >= 18 && age <= 21)	premium *= 6 ;
		else if( age >  21 && age <  25)	premium *= 2 ;
		else premium =  premium;
		
		System.out.println("How many years you've been driving?");
		experience = scan.nextInt();
			
		if (experience==0 || (age-experience) < 16 ) {
			System.out.println("Invalid data!");
			System.exit(0);
		}else premium =  premium - 5 * experience;
			
		System.out.println("Have you had any accidents in the last 5 years?");
		accident = scan.next();
		accident = accident.toLowerCase();
		accident = accident.trim();

		if(accident.contentEquals("yes")){
			System.out.println("How many?");
			accidentsAmount = scan.nextInt();
			premium =  premium + accidentsAmount * 0.2 * premium;
		}
		else premium *=1;
		
		scan.nextLine();													/////////////////////////////////
			
		System.out.println("Have you had continuous insurance for the past 12 months?");
		continuousInsurance = scan.nextLine();
		continuousInsurance = continuousInsurance.toLowerCase();
		continuousInsurance = continuousInsurance.trim();
													
		if (continuousInsurance.contentEquals("no")) {
			premium *= 2 ;
		}else premium *=1;
		
		System.out.println("What is the highest level of education you have completed?");
		education = scan.nextLine();
		education = education.toLowerCase();
		education = education.trim();
		education = education.replace(" ","");
		
		if (education.equals("phd")||education.equals("bachelors")||education.equals("masters"))
			premium = 0.95 * premium ;
		else if (education.equals("doctors"))
			premium = 0.90 * premium ;
		else if (education.equals("high school")) premium =  premium ;
		else premium = 1.05 * premium ;
		
		System.out.println(name+", here's your quote!");
		System.out.println("Start Your Policy Today For: $"+premium);
		referenceNumber = name.substring(0,2)+age+name.substring(name.length()-2)+zip+education;
		referenceNumber = referenceNumber.toUpperCase();
		
		System.out.println("Reference number: "+referenceNumber );
	}
}

