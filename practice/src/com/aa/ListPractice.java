package com.aa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListPractice {

	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> r = new ArrayList<Integer>();
		for(int i = 0; i < 20; i++) {
			r.add(0);
		}
		for(int i = 0 ; i < 10000 ; i++) {
			int a = random.nextInt(20);
			Integer freq = r.get(a);
			r.set(a, freq + 1 );
		}
		
		System.out.println(r);
	}

}
