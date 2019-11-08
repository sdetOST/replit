package Package01;
import java.util.Scanner;
public class Q053_LaptopConfigurator {

	  public static void main(String[] args) {
		    double price = 0;
				String storageType, screenType, cpu, scrResol;
				int ram = 0 ;
				int memorySize;
				
				Scanner scan = new Scanner(System.in);
		    
		    System.out.println("Select screen size:");
		    screenType = scan.next();
		    switch (screenType) {
		    case "13.3": price = price+200 ; break;
		    case "15.0": price = price+300 ; break;
		    case "17.3": price = price+400 ; break;
		    default: System.out.println("Invalid entery");
		    }
		    
		    System.out.println("Select CPU type:");
		    cpu = scan.next();
		    
		    switch (cpu) {
		    case "i3": price = price+150 ; break;
		    case "i5": price = price+250 ; break;
		    case "i7": price = price+350 ; break;
		    default: System.out.println("Invalid entery");
		    }
		    System.out.println("Select RAM size:");
		    ram = scan.nextInt();
		    int num1 = ram/4;
		    price = price + 50*num1;
		    
		    System.out.println("Select storage type:");
		    storageType = scan.next();
		    String sT = storageType.toUpperCase();
		    String sT1= sT.trim();
		    
		    System.out.println("Enter memory size:");
		    memorySize = scan.nextInt();
		    int mS = memorySize/500;
		    
		    switch (sT1) {
		    case "SSD": price = price + mS*100 ; break;
		    case "HDD": price = price + mS*50 ; break;
		    default: System.out.println("Invalid entery");
		    }		    
		    System.out.println("Enter screen resolution:");
		    scrResol = scan.next();
		    String sR = scrResol.toUpperCase();
		    String sR1= sR.trim();
		    
		    switch (sR1) {
		    case "FULLHD": price = price + 100 ; break;
		    case "4K": price = price + 200 ; break;
		    default: System.out.println("Invalid entery");
		    }
		    System.out.println("Laptop price is: "+price);
	}
}
