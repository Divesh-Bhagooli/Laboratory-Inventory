/**
 * 
 */

/**
 * @author a
 *
 */
public class Item {	
	private static int totalItems=0;
	/*creating attributes*/
	private String itemID;
	private String name;
	private String description;
	private String category;
	private String supplier_name; 
	private String supplier_contacts;
	private double price;
	private int available_qty;
	
	/*creating constructors*/
	/*
	 * default constructors
	 */
	
	/**
	 * 
	 */
	public Item() {
		this.itemID = null;
		this.name = null;
		this.description = null;
		this.category = null;
		this.supplier_name = null;
		this.supplier_contacts = null;
		this.price = 0.0;
		this.available_qty = 0;
		settotalItems(gettotalItems() + 1); //incrementing the count to track the num of objects 
	}

	public Item(String itemID, String name, String description,  String category, String supplier_name, String supplier_contacts, double price, int available_qty) {
		this.itemID = itemID;
		this.name = name;
		this.description = description;
		this.category = category;
		this.supplier_name = supplier_name;
		this.supplier_contacts = supplier_contacts;
		setprice(price);
		setavailable_qty(available_qty);
		settotalItems(gettotalItems() + 1); //incrementing the count to track the num of objects 
	}
	
	/*getters*/
	
	public String getitemID() {
		return this.itemID;
		
	}
	
	public String getname() {
		return this.name;
		
	}
	
	public String getdescription() {
		return this.description;
		
	}
	
	public String getcategory() {
		return this.category;
		
	}
	
	public String getsupplier_name() {
		return this.supplier_name;
		
	}
	
	public String getsupplier_contacts() {
		return this.supplier_contacts;
		
	}
	
	public double getprice() {
		return this.price;
		
	}
	
	public double getavailable_qty() {
		return this.available_qty;
		
	}
	
	/*setters*/
	public void setitemID(String itemID)   {
		 this.itemID = itemID;
		
	}
	
	public void setname(String name)   {
		 this.name = name;
		
	}
	
	public void setdescription(String description) {
		this.description = description;
		
	}
	
	public void setcategory(String category) {
		this.category = category;
		
	}
	
	public void setsupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
		
	}
	
	public void setsupplier_contacts(String supplier_contacts) {
		this.supplier_contacts = supplier_contacts;
		
	}
	
	public void setprice(double price) {
		if (price > 0) {
			this.price = price;
		}
			else {
				System.out.println("A price value cannot be less than 0. Please re-enter!");
				this.price = 0.0;
			}
		
		
	}
	
	public void setavailable_qty(int available_qty) {
		if (available_qty < 0) {
			this.available_qty = available_qty;
		}
			else {
				System.out.println("Quantity cannot be less than 0. Please re-enter!");
				this.available_qty = 0;
			}
			
	}
	
	/**
	 * @return get counter
	 */
	public static int gettotalItems() {
		return totalItems;
	}

	/**
	 * @param set counter
	 */
	public static void settotalItems(int totalItems) {
		Item.totalItems = totalItems;
	}
	
	/*====================================================================================================*/
	/**
	 *  Converting into toString
	 */
	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", Name=" + name + ", Description=" + description + ", Category=" + category
				+ ", SupplierName=" + supplier_name + ", Supplier Contacts=" + supplier_contacts + ", Price=" + price + ", Available quantity=" + available_qty + "]";

	}





	
	
			
	}





