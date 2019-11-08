package Q216_OOP12_TJMaxx;
import java.util.ArrayList;
import java.util.List;

/**
 * represents TJMaxx store class. https://tjmaxx.com/
 */
public class TJMaxx {

	/**
	 * Private lists to hold regular Item objects and OnSaleItem objects that
	 * represent items that sell in TJMaxx
	 */
	private List<Item> regularItems;
	private List<OnSaleItem> onSaleItems;

	/**
	 * Public no-args constructor - Instantiates regularItems and onSaleItems lists
	 * as new ArrayList
	 */
	
	public TJMaxx() {
		regularItems = new ArrayList<Item>();
		onSaleItems = new ArrayList<OnSaleItem>();
	}

	/**
	 * adds an item object to regularItems list
	 * 
	 * @param item
	 */
	
	public void addRegularItem(Item item) {
		regularItems.add(item);
	}

	/**
	 * adds OnSaleItem object to onSaleItems list
	 * 
	 * @param item
	 */
	
	public void addOnSaleItem(OnSaleItem item) {
		onSaleItems.add(item);
	}

	/**
	 * getter for regularItems
	 * 
	 * @return
	 */
	
	public List<Item> getRegularItems() {
		return regularItems;
	}

	/**
	 * getter for onSaleItems
	 * 
	 * @return
	 */
	
	public List<OnSaleItem> getOnSaleItems() {
		return onSaleItems;
	}

	/**
	 * return count of regularItem object
	 * 
	 * @return
	 */
	public int regularItemsCount() {
		// TODO change from -1
		return regularItems.size();
	}

	/**
	 * returns count of onSaleItems in TJ Maxx
	 * 
	 * @return
	 */
	
	public int onSaleItemsCount() {
		// TODO change from -1
		return onSaleItems.size();
	}

	/**
	 * returns the name of each item in TJ Maxx starting from regular item then
	 * onSaleItems
	 * 
	 * @return
	 */
	
	
	public List<String> getAllItemNames() {
		
		ArrayList<String> itemNames = new ArrayList<>();
		
		for (Item i: regularItems) itemNames.add(i.getName());
		for (OnSaleItem i: onSaleItems) itemNames.add(i.getName());

		return itemNames;
	}

	/**
	 * gets catalog number and returns price for the item it will search for the
	 * item both regularItems and onsaleonSaleItems
	 * 
	 * @param catalogNumber
	 * @returns 0.0 if product cannot be found with that catalognumber
	 */
	
	public double getItemPrice(int catalogNumber) {
		
		for (int i = 0; i < regularItems.size(); i++) {
			if(regularItems.get(i).getCatalogNumber()==catalogNumber) return regularItems.get(i).getPrice();
		}
		for (int i = 0; i < onSaleItems.size(); i++) {
			if(onSaleItems.get(i).getCatalogNumber()==catalogNumber) return onSaleItems.get(i).getPrice();
		}
		return 0.0;	
			
//		for (Item i: regularItems) {
//			if(i.getCatalogNumber()==catalogNumber)   
//		}
//		for (OnSaleItem i: onSaleItems) {
//			if(i.getCatalogNumber()==catalogNumber) return i.getPrice();
//		}
//		return 0.0;
	}

	/**
	 * accepts a name then searches among onSaleItems. Once it finds, the method
	 * will return that OnSaleItem object
	 * 
	 * @param name
	 * @return
	 */
	
	public OnSaleItem getOnSaleItem(String name) {
		for (OnSaleItem i : onSaleItems) {
			if (i.getName().equals(name)) {
				return i;
			}
		}
		return null;
	}

	/**
	 * removes the item with matching catalogNumber from both regularItems and
	 * onSaleItems. Does nothing if not found
	 * 
	 * @param catalogNumber
	 */
	public void removeItem(int catalogNumber) {
		
		for (int i = 0; i < regularItems.size(); i++) {
			if(regularItems.get(i).getCatalogNumber()==catalogNumber) regularItems.remove(i);
		}
		for (int i = 0; i < onSaleItems.size(); i++) {
			if(onSaleItems.get(i).getCatalogNumber()==catalogNumber) onSaleItems.remove(i);
		}

	}

	/**
	 * - it accepts a catalog number and finds that item among regularItems and
	 * onSaleItems - if it finds the item: - decrease the count of the Item by 1 -
	 * if count reaches 0 after decrementing then remove the product(call removeItem
	 * method)
	 *
	 * @param catalogNumber
	 */
	public void buyItem(int catalogNumber) {

	}

}
