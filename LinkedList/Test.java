package com.sourceit.linked;

public class Test {

	public static void main(String[] args) {
		
		MyLinked<String> test = new MyLinked<>();
		System.out.println("test isEmpty " + test.isEmpty());
		test.add("Январь");
		test.add("Февраль");
		test.add("Март");
		test.addFirst("Декабрь");
		test.addLast("Апрель");
		test.add("Май");
		test.add("Июнь");
	
		System.out.println("Тест метода size:");
		System.out.println(test.size());
		System.out.println("Тест метода getFirst:");
		System.out.println(test.getFirst());
		System.out.println("Тест метода getLast:");
		System.out.println(test.getLast());
		System.out.println("Тест метода get(int position):");
		System.out.println(test.get(5));
		System.out.println("Тест метода contains:");
		System.out.println(test.contains("Февраль"));
		System.out.println("Тест метода remove:");
		test.remove("Июнь");
		System.out.println(test.contains("Июнь"));
		System.out.println("test isEmpty " + test.isEmpty());
		test.clear();
		System.out.println("size " + test.size());

	}

}
