package com.hsbc.collection;

import com.hsbc.collection.SortAll;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMain {
	
	public static void main(String[] args) {
		
		List<Item> list = new ArrayList<Item>();
		
		list.add(new Item(1,"Box",20,4.1));
		list.add(new Item(2,"Pen",10,4.9));
		list.add(new Item(3,"Pencil",15,4.5));
		list.add(new Item(4,"Table",200,3.1));
		list.add(new Item(5,"Chair",120,4.8));
		
		for(Item i : list) 	
			System.out.println(i);
		
		Collections.sort(list);
		
		System.out.println("------After sorting------");
		for(Item i : list) 	
			System.out.println(i);
		
		SortAll sortAll = new SortAll();
		SortAll.SortByIdDescending sortIdDescending = sortAll.new SortByIdDescending();
		SortAll.SortByNameAscending sortNameAscending = sortAll.new SortByNameAscending();
		SortAll.SortByNameDescending sortNameDescending = sortAll.new SortByNameDescending();
		SortAll.SortByPriceAscending sortPriceAscending = sortAll.new SortByPriceAscending();
		SortAll.SortByPriceDescending sortPriceDescending = sortAll.new SortByPriceDescending();
		SortAll.SortByRatingAscending sortRatingAscending = sortAll.new SortByRatingAscending();
		SortAll.SortByRatingDescending sortRatingDescending = sortAll.new SortByRatingDescending();
		
		
		Collections.sort(list, sortIdDescending);
		System.out.println("------After sorting by Id Descending ------");
		for(Item i : list) 	
			System.out.println(i);
		
		Collections.sort(list, sortNameAscending);
		System.out.println("------After sorting by Name Ascending------");
		for(Item i : list) 	
			System.out.println(i);
		
		Collections.sort(list, sortNameDescending);
		System.out.println("------After sorting by Name Descending------");
		for(Item i : list) 	
			System.out.println(i);
		
		Collections.sort(list, sortPriceAscending);
		System.out.println("------After sorting by Price Ascending------");
		for(Item i : list) 	
			System.out.println(i);
		
		
		Collections.sort(list, sortPriceDescending);
		System.out.println("------After sorting by Price Descending------");
		for(Item i : list) 	
			System.out.println(i);
		
		Collections.sort(list, sortRatingAscending);
		System.out.println("------After sorting by Rating Ascending------");
		for(Item i : list) 	
			System.out.println(i);
		
		
		Collections.sort(list, sortRatingDescending);
		System.out.println("------After sorting by Rating Descending------");
		for(Item i : list) 	
			System.out.println(i);
		
		
	}

}
