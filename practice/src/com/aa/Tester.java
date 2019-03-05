package com.aa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		List<Integer>bag = new ArrayList<>();
		bag.add(52);
		bag.add(85);
		bag.add(null);
		bag.add(52);
		bag.add(47);
		System.out.println(bag);
		//¦L¥X[52, 85, null, 52, 47]

		Set<Integer>bags = new HashSet<>();
		bags.add(8);
		bags.add(45);
		bags.add(null);
		bags.add(8);
		bags.add(32);
		System.out.println(bags);
		
	}
	
}
