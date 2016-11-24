package com.sourceit.linked;

public class Test {

	public static void main(String[] args) {
		
		MyLinked<String> test = new MyLinked<>();
		System.out.println("test isEmpty " + test.isEmpty());
		test.add("������");
		test.add("�������");
		test.add("����");
		test.addFirst("�������");
		test.addLast("������");
		test.add("���");
		test.add("����");
	
		System.out.println("���� ������ size:");
		System.out.println(test.size());
		System.out.println("���� ������ getFirst:");
		System.out.println(test.getFirst());
		System.out.println("���� ������ getLast:");
		System.out.println(test.getLast());
		System.out.println("���� ������ get(int position):");
		System.out.println(test.get(5));
		System.out.println("���� ������ contains:");
		System.out.println(test.contains("�������"));
		System.out.println("���� ������ remove:");
		test.remove("����");
		System.out.println(test.contains("����"));
		System.out.println("test isEmpty " + test.isEmpty());
		test.clear();
		System.out.println("size " + test.size());

	}

}
