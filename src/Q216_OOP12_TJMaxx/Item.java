package Q216_OOP12_TJMaxx;

public class Item {

	// private instance variables
	private String name;
	private int catalogNumber;
	private int quantity;
	private double price;

	/**
	 * public constructor with:
	 * 
	 * @param name
	 * @param quantity
	 * @param catalogNumber
	 * @param price
	 *
	 *                      assigns to values to instance variables
	 */
//	public Item(String name, int quantity, int catalogNumber, double price) {
//
//	}
	
	public Item(String name,int quantity,int catalogNumber, double price) {
		this.name = name;
		this.quantity = quantity;
		this.catalogNumber = catalogNumber;
		this.price = price;
	}
	
	
	

	/**
	 * setter for name instance variable
	 * 
	 * @param name
	 */
//	public void setName(String name) {
//
//	}



	/**
	 * setter for private price
	 * 
	 * @param price
	 */
//	public void setPrice(double price) {
//
//	}

	/**
	 * getter for price
	 * 
	 * @return
	 */
//	public double getPrice() {
//
//		return 0.0;
//	}

	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getCatalogNumber() {
		return catalogNumber;
	}




	public void setCatalogNumber(int catalogNumber) {
		this.catalogNumber = catalogNumber;
	}




	@Override
	public String toString() {
 	return "Item {name=" + name + ", catalogNumber=" + catalogNumber + ", quantity=" + quantity + ", price=" + price
				+ "}";
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public  String getName() {
		return name;
	}




	/**
	 * getter for name
	 * 
	 * @return
	 */
//	public String getName() {
//
//		return null;
//	}

//	public int getQuantity() {
//		// TODO
//		return -1;
//
//	}
//
//	public void setQuantity(int quantity) {
//		// TODO
//
//	}
//
//	public int getCatalogNumber() {
//		// TODO
//		return -1;
//	}
//
//	public void setCatalogNumber(int catalogNumber) {
//
//	}
//
//	/**
//	 * Override toString:
//	 * 
//	 * @returns Object description in this format: "Regular Item{name='Item name',
//	 *          catalogNumber=1234, quantity=5, price=9.99}"
//	 */
//	@Override
//	public String toString() {
//		return "";
//	}

}