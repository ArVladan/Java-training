package com.sourseit.arrlist;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		ArrList<String> test = new ArrList<>();
		System.out.println(test.isEmpty());
		test.add("Киев");
		test.add("Харьков");
		test.add("Львов");
		test.add("Запорожье");
		test.remove("Харьков");
		System.out.println(test.contains("Харьков"));
		test.add("Харьков");
		System.out.println(test.isEmpty());
		Iterator<String> iter = test.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
		
}
