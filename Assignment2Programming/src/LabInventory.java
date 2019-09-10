import java.util.Scanner;
/**
 * 
 */

/**
 * @author a
 *
 */
public class LabInventory {
	
	static void display_menu() {
		System.out.println("What do you want to do? Make your choices from the menu below.");
		System.out.println("Choice 1: Enter a new Item to the inventory (password required)");
		System.out.println("Choice 2: Change information of an existing Item (password required)");
		System.out.println("Choice 3: Display all the Items with the specified category");
		System.out.println("Choice 4: Display all Items to be re-ordered");
		System.out.println("Choice 5: Number of Items currently in store");
		System.out.println("Choice 6: Quit");
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myKey = new Scanner(System.in);

		System.out.println("Welcome to Electronics Lab Store!");
		
		int i;
		int choice;
		final String PASSWORD = "DitProg123";
		String password;
		int count, maxcount= 0;
		String itemID;
		String name;
		String description;
		String category;
		String supplier_name;
		String supplier_contacts;
		double price;
		int available_qty;
		int size;
		int selection = 0;
		int position = 0;
		

		System.out.println("Please input the maximum number of Items the store can contain");
		size = myKey.nextInt();
	    Item[] itemDatabase = new Item[size];
		do {
			display_menu();
			System.out.println("Please enter your choice: ");
			choice = myKey.nextInt(); 
			
			if (choice == 1) {
				
				do {
					count = 0;
					
					do {
						System.out.println("Enter password: ");
						password = myKey.next();
						
						if (password != "DitProg123" ) {
							System.out.println("Invalid password!Please re-enter!");
							count++;
							maxcount++;
							
						}
					}while (count < 3 && password != "DitProg123");
					if(maxcount < 12) {
						display_menu();
						System.out.println("Please enter your choice: ");
						choice = myKey.nextInt();
					}
				}while (maxcount < 12 && password != "DitProg123");
				
				if (maxcount >= 12) {
					System.out.println("Program detected suspicious activity and is terminating!");
					choice = 6;
				}
				else {
					System.out.println("Option 1!");
					
					System.out.println("Enter a new item to the inventory: ");
				    itemID = myKey.next();
				    
				
					
				for (i = 0; i < size; i++) {
						itemDatabase[i] = new Item();
				}
					
					
					for(i = 0; i < size; i++) {
					//inputing in the object item
						System.out.println("Item ID" + (i+1)  + ": ");
						itemID = myKey.next();
						
						System.out.println("Name" + (i+1) + ": ");
						name = myKey.next();
						
						System.out.println("Description" + (i+1) + ": ");
						description = myKey.next();
						
						System.out.println("Category" + (i+1) + ": ");
						category = myKey.next();
						
						System.out.println("Supplier name" + (i+1) + ": ");
						supplier_name = myKey.next();
						
						System.out.println("Supplier contact" + (i+1) + ": ");
						supplier_contacts = myKey.next();
						
						System.out.println("Price" + (i+1) + ": ");
						price = myKey.nextDouble();
						
						System.out.println("Available quantity" + (i+1) + ": ");
						available_qty = myKey.nextInt();
						
						itemDatabase[i] = new Item();
						
						}
					}
					
				}
				
				
			
			else if (choice == 2) {
				do {
					count = 0;
					
					do {
						System.out.println("Enter password: ");
						password = myKey.next();
						
						if (password != "DitProg123" ) {
							System.out.println("Invalid password!Please re-enter!");
							count++;
							maxcount++;
							
						}
					}while (count < 3 && password != "DitProg123");
					if(maxcount < 12) {
						display_menu();
						System.out.println("Please enter your choice: ");
						choice = myKey.nextInt();
					}
				}while (maxcount < 12 && password != "DitProg123");
				
				if (maxcount >= 12) {
					System.out.println("Program detected suspicious activity and is terminating!");
					choice = 6;
				}
				else {
					System.out.println("Option 2!");
				}
				System.out.println("Which item ID do you want to change? ");
			    itemID = myKey.next();
			    
			    for (i = 0; i < size; i++) {
			    
			    	if(itemDatabase[i].equals(itemID)) {
			    		position = i;
			    		break;
			    }
			    	
					do {
						System.out.println(itemDatabase[i].getitemID() +" \n "+ itemDatabase[i].getname() +" \n "+ itemDatabase[i].getdescription() +" \n "+
						                    itemDatabase[i].getcategory() +" \n "+ itemDatabase[i].getsupplier_name() +" \n "+ itemDatabase[i].getsupplier_contacts() +" \n "+
								            itemDatabase[i].getprice() +" \n "+ itemDatabase[i].getavailable_qty());
						System.out.println("What information of this item would you like to change?");
						System.out.println("1.Name \n 2.Description \n 3.Category \n 4.Supplier Name \n 5.Supplier Contacts \n 6.Price \n 7.Available quantity");
						System.out.println("Please input your selection: ");
						selection = myKey.nextInt();
						
					}while(selection < 1 || selection > 7);
						if (selection == 1) {
							System.out.println("Enter new item name: ");
							name = myKey.next();
							itemDatabase[position].setname(name);
						}
						if (selection == 2) {
							System.out.println("Enter new description: ");
							description = myKey.next();
							itemDatabase[position].setdescription(description);
						}
						if (selection == 3) {
							System.out.println("Enter new category: ");
							category = myKey.next();
							itemDatabase[position].setcategory(category);
						
						if (selection == 4) {
							System.out.println("Enter new supplier name: ");
							supplier_name = myKey.next();
							itemDatabase[position].setsupplier_name(supplier_name);
						}
						if (selection == 5) {
							System.out.println("Enter new supplier contacts: ");
							supplier_contacts = myKey.next();
							itemDatabase[position].setsupplier_contacts(supplier_contacts);
						}
						if (selection == 6) {
							System.out.println("Enter new price: ");
							price = myKey.nextDouble();
							itemDatabase[position].setprice(price);
						}
						else if (selection == 7) {
							System.out.println("Enter new available quantity: ");
							available_qty = myKey.nextInt();
							itemDatabase[position].setavailable_qty(available_qty);
						}
	    
			    }
			
			
			else if (choice == 3) {
				System.out.println("Enter the specified category: ");
				  category = myKey.next();
				  
				  for (i = 0; i < size; i++) {
				  
				  if(itemDatabase[i].getcategory().equals(category)) {
					  
					  System.out.println("Name: "+itemDatabase[i].getname() + " \n Description: "+itemDatabase[i].getdescription() + " \n Category: "+itemDatabase[i].getcategory()
							               + " \n SupplierName: "+itemDatabase[i].getsupplier_name() + " \n SupplierContacts: "+itemDatabase[i].getsupplier_contacts() + " \n Price: "+itemDatabase[i].getprice()
							               + " \n Availablequantity: "+itemDatabase[i].getavailable_qty());
					
					}
			
				 
	        
	    
			
			else if (choice == 4) {
				
				
				
			}
				
					
					
					
					
			}
				  }
			
			else if (choice == 5) {
				System.out.println(gettotalItems());
				
				
			}
			else 
				System.out.println("You chose to exit the program!");
			}
			
			
			
			
			
			
			
			}while(choice != 6);
		
		System.out.println("You have exited the program");
		}
		
			
		
			
			
	}
	private static char[] settotalItems(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	private static int gettotalItems() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
