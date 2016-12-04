package com.sourseit.arrlist;

public class Test {

	public static void main(String[] args) {
		ArrList<String> test = new ArrList<>();
		
		test.add("����");
		test.add("�������");
		test.add("�����");
		test.add("���������");
		test.remove("�������");
		System.out.println(test.contains("�������"));
		test.add("�������");
		for (int i = 0; i < test.size; i++) {
			System.out.println(test.iterator.next());
		}
		for (int i = test.size; i > 1; i--) {
			System.out.println(test.iterator.previous());
		}
		System.out.println(test.iterator.next());
		System.out.println(test.iterator.next());
		test.iterator.remove();
		System.out.println(test.iterator.next());
		for (int i = 0; i < test.size; i++) {
			System.out.println(test.get(i));
		}
	}

}
