package com.sourseit.arrlist;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		ArrList<String> test = new ArrList<>();
		System.out.println(test.isEmpty());
		test.add("����");
		test.add("�������");
		test.add("�����");
		test.add("���������");
		test.remove("�������");
		System.out.println(test.contains("�������"));
		test.add("�������");
		System.out.println(test.isEmpty());
		Iterator<String> iter = test.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
		
}
