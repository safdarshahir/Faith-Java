package com.nissan.bean;

public class Item {

	//item attributes
	private int itemId;
	private String itemName;
	private String itemDescription;
	private String itemCategory;
	private double itemPrice;
	
	//default constructor
	public Item() {
		System.out.println("Item Created.");
	}
	
	//parameterized constructor
	public Item(int itemId, String itemName, String itemDescription, String itemCategory, double itemPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemCategory = itemCategory;
		this.itemPrice = itemPrice;
	}

	//getters and setters
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

}
