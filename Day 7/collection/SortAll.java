package com.hsbc.collection;

import java.util.Comparator;

public class SortAll {
	
	public class SortByIdDescending implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return o2.getItemId()-o1.getItemId();
		}
		
		
	}
	
	
	public class SortByNameAscending implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return o1.getItemName().compareTo(o2.getItemName());
		}
				
	}
	
	public class SortByNameDescending implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return o2.getItemName().compareTo(o1.getItemName());
		}
		
		
	}
	
	public class SortByPriceAscending implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return Double.compare(o1.getItemPrice(), o2.getItemPrice());
					
					
		}
		
	}
	
	public class SortByPriceDescending implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return Double.compare(o2.getItemPrice(), o1.getItemPrice());
		}
		
		
	}
	
	public class SortByRatingAscending implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return Double.compare(o1.getRatings(), o2.getRatings());
		}
		
		
	}
	
	public class SortByRatingDescending implements Comparator<Item> {

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			return Double.compare(o2.getRatings(), o1.getRatings());
		}
		
		
	} 
}
