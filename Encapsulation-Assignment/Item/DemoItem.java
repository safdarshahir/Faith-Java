package com.nissan.app;
import java.util.Scanner;
import com.nissan.bean.Item;
import com.nissan.oops.InvalidEntryException;

/*
 * Create a class named Item(store Item) and construct the item with possible attributes.
Create another class named Report Generator and put a main method in the Report
Generator class. Create an instance of the Item class inside the Report Generator and display
its attribute values in the screen.
*/
public class DemoItem {

	public static void main(String[] args) throws InvalidEntryException {

		//creating 5 item objects
		Item[] items = new Item[5];
		int noOfItems = addItems(items);
		displayItems(items,noOfItems);
	
	}

	//displaying data in table format
	private static void displayItems(Item[] items, int noOfItems) {
		
		System.out.println("\n Displaying Item table:");
		System.out.print("\n -----------------------------------------------------------------------------------------");
		System.out.printf("\n %-15s %-15s %-20s %-20s %-20s", "Item No.", "Item Name", "Item Description", "Item Category","Item Price");
		System.out.print("\n -----------------------------------------------------------------------------------------");
		for (int i = 0; i < noOfItems; i++) {
			System.out.printf("\n %-15d %-15s %-20s %-20s %-20.2f",
								items[i].getItemId(),
								items[i].getItemName(),
								items[i].getItemDescription(),
								items[i].getItemCategory(),
								items[i].getItemPrice());
		}

		System.out.print("\n -----------------------------------------------------------------------------------------");
		

		
	}

	//Method to add items to Items
	private static int addItems(Item[] items) throws InvalidEntryException {
		
		//declaring input variables
		int noOfItems=0;
		char choice;
		Scanner input = new Scanner(System.in);

		try {
			do {

				items[noOfItems] = new Item();
				System.out.print("Enter Item no.:");
				int accNo = input.nextInt();
				items[noOfItems].setItemId(accNo);
				
				System.out.print("Enter Item Name:");
				String accType = input.next();
				items[noOfItems].setItemName(accType);
				
				System.out.print("Enter item Description :");
				String itemDesc = input.next();
				items[noOfItems].setItemDescription(itemDesc);
				
				System.out.print("Enter Category:");
				String itemCategory = input.next();
				items[noOfItems].setItemCategory(itemCategory);

				System.out.print("Enter Item Price:");
				double price = input.nextDouble();
				items[noOfItems].setItemPrice(price);

				//incrementing no of items
				noOfItems++;

				//reading users choice
				System.out.print("Continue(y/n):");
				choice = input.next().charAt(0);

			} while (choice != 'n');
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Limit Exceeded.");
		}
		
		return noOfItems;
	}
	

}
