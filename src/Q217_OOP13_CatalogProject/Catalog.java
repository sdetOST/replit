package Q217_OOP13_CatalogProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Catalog {


	public ArrayList<String> items = new ArrayList<>();
	public ArrayList<Double> prices = new ArrayList<>();
	public ArrayList<Double> monthlyPayments = new ArrayList<>();

	/**
	 * This method adds all listed items to <items> arraylist
	 * that is already declared above
	 */
	public void loadItems() {
		
		
		items = new ArrayList<>(Arrays.asList("iPhone 6s","iPhone 6s Plus","iPhone X",
												"MacbookPro","ThumbDrive","Beats HeadPhones",
												"Mouse","Charger","iPad",
												"Dyson Vacuum","TV","Apple Watch"));
		
      /*	
        "iPhone 6s","iPhone 6s Plus","iPhone X","MacbookPro","ThumbDrive",
        "Beats HeadPhones","Mouse","Charger","iPad","Dyson Vacuum","TV","Apple Watch"
        
       */	
	}
	/**
	 * This method adds all listed prices to <prices> arraylist
	 * that is already declared above
	 */
	public void loadPrices() {
		prices = new ArrayList<>(Arrays.asList(449.0,549.0,1149.0,
											1499.99,39.99,349.99,
											79.99,39.99,429.0,
											399.0,2199.0,559.0));
				
		/*
		 * 449.0,549.0,1149.0,1499.99,39.99,349.99,79.99,39.99,429.0,399.0,2199.0,559.0
		 */
	}
	
	/**
	 * This method adds all listed monthly payments to <monthlyPayments> arraylist
	 * that is already declared above
	 */
	
	public void loadMonthlyPayments() {
		monthlyPayments = new ArrayList<>(Arrays.asList(18.71,22.88,56.16,
														79.49,2.68,15.12,
														8.98,4.56,18.31,
														16.25,89.49,21.18));
		
		/*
		  18.71,22.88,56.16,79.49,2.68,15.12,8.98,4.56,18.31,16.25,89.49,21.18
		  */
	}
	
	/**
	 * This method will load whole catalog data - <items>,<prices>,<monthlyPayments>
	 * Call loadItems(),loadPrices(),loadMonthlyPayments() that you created above
	 */
	public void loadWholeCatalog() {
		loadItems();
		loadPrices();
		loadMonthlyPayments();
	}

	/**
	 * Write a method that reads values from above ArrayLists and 
	 * returns a stringbuilder with all item details:
	 * return format(each item in new line and delimited by '-' ):
	 * 	iPhone 6s-449.0-18.71
			iPhone 6s Plus-549.0-22.88
			..
	 * 
	 */
	
	public StringBuilder getWholeCatalog() {
		loadWholeCatalog();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < items.size(); i++) {			
		sb = sb.append(items.get(i)+"-"+prices.get(i)+"-"+monthlyPayments.get(i)+"\n");
		return sb;
		}
return null;
		
	}

	/**
	 * write a method that an item name and returns all details for it. If item
	 * is not in the list then returns null
	 *  ex: 
	 * getItemDetails("ThumbDrive") -->ThumbDrive-39.99-2.68 
	 * getItemDetails("Charger") --> Charger-39.99-4.56
	 * getItemDetails("Potato") --> null
	 * 
	 * @param item
	 * @return
	 */

	public String getItemDetails(String item) {
		loadWholeCatalog();
		int i = items.indexOf(item);
		if (i<0) return null;
		else return item + "-" + prices.get(i)+ "-" + monthlyPayments.get(i);
	
	}

	/**
	 * write a method that accepts a price and returns a ArrayList<String> with
	 * items with all detail that have less than or equal monthly payments
	 * 
	 * getItemsLessThanAMonthlyPrice(5.99) --> ThumbDrive-39.99-2.68
	 * 										  Charger-39.99-4.56 
	 * getItemsLessThanAMonthlyPrice(1.99) --> ""
	 * 
	 * @param double price
	 * @return ArrayList<String>
	 */

	public ArrayList<String> getItemsLessThanAMonthlyPrice(double price) {
		//LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();
		//TODO
		ArrayList<String> lessThan = new ArrayList<>();
		
		for (int i = 0; i < monthlyPayments.size(); i++) {
			if ( monthlyPayments.get(i) <=price) 
			{
				lessThan.add(items.get(i)+"-"+prices.get(i).toString()+"-"+monthlyPayments.get(i).toString());
			}
		}

			return lessThan;
			
			

	}
	
	/**
	 * Method accepts a item name and updates total Price and monthly payments
	 * for that item in <items>,<prices>,<monthlyPayments> arrayLists
	 * When assigning monthlyPayments do =>  newPrice/12 <= to get monthly payments
	 * 
	 * @param item name
	 * @param newPrice
	 */
	
	public void updatePrice(String item, double newPrice) {
		//LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();
		//TODO
		
	for (int i = 0; i < items.size(); i++) {
		if (items.get(i).equals(item)) {
			prices.remove(i);
			monthlyPayments.remove(i);
			prices.add(i, newPrice);
			monthlyPayments.add(i, newPrice/12);
			
			
//			prices.set(i, newPrice);
//			monthlyPayments.set(i,newPrice/12);
		}
		
	}
			
	
		
		
//		int i = items.indexOf(item);
//		prices.remove(i);
//		monthlyPayments.remove(i);
//		prices.add(i, newPrice);
//		monthlyPayments.add(i, newPrice/12);
//		prices.set(i,newPrice);
//		monthlyPayments.set(i,newPrice/12);
	}
	
	/**
	 * Method looks for an item in the catalog and removes
	 * all details for that item including item name, price, monthlypayments
	 * 
	 * 
	 * @param item
	 */
	
	public void deleteItemFromCatalog(String item) {
		//LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();
		//TODO
		int i = items.indexOf(item);
		items.remove(item);
		prices.remove(i);
		monthlyPayments.remove(i);
		
	}

	
	
}