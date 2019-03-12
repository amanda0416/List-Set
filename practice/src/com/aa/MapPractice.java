package com.aa;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapPractice {

	public static void main(String[] args) {
		Random rand = new Random(20);
		 Map<Integer,Integer> a =new HashMap<Integer,Integer>(); 
		 for (int i = 0; i < 10000; i++ ) {
			 int b = rand.nextInt(40);
			 Integer freq = a.get(b);
			 if(freq == null) {
				 a.put(b, 1);
			 }else {
				 a.put(b, freq+1);
			 }
		 }
		
		 System.out.println(a);
	}

}
