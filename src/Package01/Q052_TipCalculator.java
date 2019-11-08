package Package01;

import java.util.Scanner;

public class Q052_TipCalculator {

	public static void main(String[] args) {
	    
	    int numbPeople;
	    double totaTip, checkAm,totalPay;
	    double tip=0.0;
	    String split; 
	    	    
	    String serQua;
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Split:");
	    split = scan.next();
	    
	    System.out.println("Number of people:");
	    numbPeople = scan.nextInt();
	    
	    
	    String people = "&".repeat(numbPeople);
//	    for(int i = 0; i<numbPeople; i++)
//	    	people=people+"&";
	    
//	    switch (numbPeople) {
//	    case 1: people = "&"; break;
//	    case 2: people = "&&"; break;
//	    case 3: people = "&&&"; break;
//	    case 4: people = "&&&&"; break;
//	    case 5: people = "&&&&&"; break;
//		default:System.out.println("Invalid entery!"); break;
//	    }

	    System.out.println("Check amount:");
	    checkAm = scan.nextDouble();
	    
	    System.out.println("Service Quality:");
	    serQua = scan.next();
	    String serQua1=serQua.toLowerCase();
	    String serQua2=serQua1.trim();
	    
	    if (serQua2.equals("poor")) tip = checkAm * 0.05;
	    else if (serQua2.equals("fair")) tip = checkAm * 0.10;
	    else if (serQua2.equals("good")) tip = checkAm * 0.15;
	    else if (serQua2.equals("great")) tip = checkAm * 0.20;
	    else if (serQua2.equals("excellent")) tip = checkAm * 0.25;
	    else System.out.println("Invalid entery!");
				
	    totalPay = checkAm+ tip;
	     
	    System.out.println("Number of people entered: "+ people);
	    System.out.println("Total to pay: "+totalPay);
	    System.out.println("Total tip: "+tip);
	    System.out.println("Total per person: "+(totalPay/numbPeople));
	    System.out.println("Tip per person: "+(tip/numbPeople));
	    
	    
	}
}

