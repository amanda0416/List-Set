package com.aa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Random random = new Random();
		int[] freq = new int [20];
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i<10000 ; i++ ) {
			int a = random.nextInt(20);
			list.add(a);
			freq[a]++;
		}
		for(int i = 0 ;i < freq.length; i++) {
			System.out.println(i + ":" + freq[i]);
		}
	
	}

}

