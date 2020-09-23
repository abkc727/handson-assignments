package com.hsbc.collection;

import com.hsbc.collection.Item;

public class Item implements Comparable<Item>{
	private int itemId;
	private String itemName;
	private double itemPrice;
	private double ratings;
	
	
	
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String itemName, double itemPrice, double ratings) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.ratings = ratings;
	}

	
	
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

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	
	
	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", ratings=" + ratings
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (itemId != other.itemId)
			return false;
		return true;
	}

	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return (this.getItemId()-o.getItemId());
	}
	
	
	
	

}
