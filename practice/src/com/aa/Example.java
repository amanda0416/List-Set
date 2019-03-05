package com.aa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		List<String>daytemper = new ArrayList<>();
		daytemper.add("3月5日24度");
		daytemper.add("3月6日18度");
		daytemper.add("3月7日12度");
		daytemper.add("3月8日16度");
		System.out.println(daytemper);
		//印出近幾日氣溫預報

		Set<String>lottery = new HashSet<>();
		lottery.add("Bob(85)");
		lottery.add("Tom(34)");
		lottery.add("Jenny(12)");
		lottery.add("Jack(99)");
		lottery.add("Sandy(56)");
		System.out.println(lottery);
		//印出中獎者及其編號

	}

}
