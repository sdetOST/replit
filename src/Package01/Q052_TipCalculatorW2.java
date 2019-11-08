package Package01;

import java.util.Scanner;

public class Q052_TipCalculatorW2 {

	public static void main(String[] args) {
	    int numbPeople;
	    double totaTip, checkAm, totalPay;
	    double tip = 0.0;
	    String split; 
	    	    
	    String serQua;
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.print("Split:");
	    split = scan.next();
	    
	    System.out.println("Number of people:");
	    numbPeople = scan.nextInt();
	    String people = "&".repeat(numbPeople);

	    System.out.println("Check amount:");
	    checkAm = scan.nextDouble();
	    
	    System.out.println("Service Quality:");
	    serQua = scan.next();
	    String serQua1=serQua.toLowerCase();
	    String serQua2=serQua1.trim();
	    
	    switch (serQua2) {
	    case "poor": tip = checkAm * 0.05; break;
	    case "fair": tip = checkAm * 0.10; break;
	    case "good": tip = checkAm * 0.15; break;
	    case "great": tip = checkAm * 0.20; break;
	    case "excellent": tip = checkAm * 0.25; break;
		default:System.out.println("Invalid entry!"); break;
	    }
	    totalPay = checkAm+ tip;
	    	     
	    System.out.println("Number of people entered: "+ people);
	    System.out.println("Total to pay: "+totalPay);
	    System.out.println("Total tip: "+tip);
	    System.out.println("Total per person: "+(totalPay/numbPeople));
	    System.out.println("Tip per person: "+(tip/numbPeople));
	    
	    
	}
}

