package com.aa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuyingListTester {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while(!name.equals("q")) {
			System.out.print("Please enter item name:");
			name = scanner.nextLine();
			System.out.print("Please enter item number:");
			int number = Integer.parseInt(scanner.nextLine());
			items.add(new Item(name,number));
			for(Item item: items) {
				System.out.println(item.name + "\t" +item.number);

			}
		}
	}

}