package com.sourseit.arrlist;
public class TestMission {

	public static void main(String[] args) {
		
		ArrList<String> test = new ArrList<>();
		System.out.println(test.isEmpty());
		
		test.add("�����������");
		test.add("�������");
		test.add("�����");
		test.add("�������");
		test.add("�������");
		test.add("�������");
		test.add("�����������");
	
		System.out.println("���� ������ get:");
		for (int i = 0; i < test.size; i++) {
			System.out.println("���� ������:" + test.get(i));
		}
		System.out.println("���� ������ size:");
		System.out.println(test.size);
		
		System.out.println("���� ������ remov:");
		test.remove("�����");
		for (int i = 0; i < test.size; i++) {
			System.out.println(test.get(i));
		}
		System.out.println("���� ������ conteins:");
		System.out.println(test.contains("�����"));
		System.out.println(test.contains("�������"));
		System.out.println("���� ������ clear:");
		test.clear();
		System.out.println(test.isEmpty());
	
	}
		
}
