package com.aa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		List<String>daytemper = new ArrayList<>();
		daytemper.add("3��5��24��");
		daytemper.add("3��6��18��");
		daytemper.add("3��7��12��");
		daytemper.add("3��8��16��");
		System.out.println(daytemper);
		//�L�X��X���Źw��

		Set<String>lottery = new HashSet<>();
		lottery.add("Bob(85)");
		lottery.add("Tom(34)");
		lottery.add("Jenny(12)");
		lottery.add("Jack(99)");
		lottery.add("Sandy(56)");
		System.out.println(lottery);
		//�L�X�����̤Ψ�s��

	}

}
