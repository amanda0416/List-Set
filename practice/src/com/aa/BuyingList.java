package com.aa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuyingList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String>things = new ArrayList<>();
		List<Integer>num = new ArrayList<>();
		while (true) {
			System.out.print("add the list(1/0):");
			int a = scanner.nextInt();
			if (a == 1) {
				System.out.print("Please enter item name:");
				String thing = scanner.nextLine();
				scanner.nextLine();
				things.add(thing);
				System.out.print("Please enter item number:");
				int number = scanner.nextInt();
				num.add(number);
			}
			if (a == 0) {
				break;
			}
		}
		System.out.println("item name:"+ things  + "\n" +"item number:" + num );
	}
}