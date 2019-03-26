package com.aa;

import java.util.ArrayList;
import java.util.List;

public class Item {
	String name;
	int number;
	
	public Item (String name , int number) {
		this.name = name;
		this.number = number;
		List<String>names = new ArrayList<>();
		List<Integer>num = new ArrayList<>();
		names.add(name);
		num.add(number);
	}
	
}