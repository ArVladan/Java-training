package com.sourseit.arrlist;

public class Test {

	public static void main(String[] args) {
		ArrList<String> test = new ArrList<>();
		
		test.add("Киев");
		test.add("Харьков");
		test.add("Львов");
		test.add("Запорожье");
	//	test.remove("Запорожье");
	//	System.out.println(test.contains("Запорожье"));
	//	test.add("Запорожье");
		for (int i = 0; i < test.size; i++) {
			System.out.println(test.iterator.next());
		}
		for (int i = test.size; i > 1; i--) {
			System.out.println(test.iterator.previous());
		}
		System.out.println(test.iterator.next());
		System.out.println(test.iterator.next());
		test.iterator.remove();
		for (int i = 0; i < test.size; i++) {
			System.out.println(test.get(i));
		}
	}

}
