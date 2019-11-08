package Package01;

import java.util.Scanner;

public class Q052_TipCalculatorW3 {

	public static void main(String[] args) {
	    
	    int numbPeople;
	    double totaTip, checkAm,totalPay;
	    double tip=0.0;
	    String split; 
	    	    
	    String serQua;
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.print("Split: ");
	    split = scan.next();
	    String split1=split.toLowerCase();
	    String split2=split1.trim();
	    
	    System.out.println("Number of people:");
	    numbPeople = scan.nextInt();
	    String people = "&".repeat(numbPeople);

	    System.out.println("Check amount:");
	    checkAm = scan.nextDouble();
	    
	    System.out.println("Service Quality:");
	    serQua = scan.next();
	    String serQua1=serQua.toLowerCase();
	    String serQua2=serQua1.trim();
	    
	    if(serQua2.equals("poor")||serQua2.equals("fair")||serQua2.equals("good")||
	    		serQua2.equals("great")||serQua2.equals("excellent")) {
	    	if (serQua2.equals("poor")) tip = checkAm * 0.05;
	    	else if (serQua2.equals("fair")) tip = checkAm * 0.10;
	    	else if (serQua2.equals("good")) tip = checkAm * 0.15;
	    	else if (serQua2.equals("great")) tip = checkAm * 0.20;
	    	else if (serQua2.equals("excellent")) tip = checkAm * 0.25;
	    
	    	totalPay = checkAm+ tip;
			if 	(split2.equals("yes")) {
				System.out.println("Number of people entered: "+ people);
			   	System.out.println("Total to pay: "+totalPay);
			   	System.out.println("Total tip: "+tip);
			   	System.out.println("Total per person: "+(totalPay/numbPeople));
			   	System.out.println("Tip per person: "+(tip/numbPeople));
			}else {
				System.out.println("Total to pay: "+totalPay);
			   	System.out.println("Total tip: "+tip);
			}
	    }
	    
	    else System.out.println("Invalid entery!");
	    
	}
}

