package com.sourseit.arrlist;
public class TestMission {

	public static void main(String[] args) {
		
		ArrList<String> test = new ArrList<>();
		System.out.println(test.isEmpty());
		
		test.add("Понедельник");
		test.add("Вторник");
		test.add("Среда");
		test.add("Четверг");
		test.add("Пятница");
		test.add("Суббота");
		test.add("Воскресенье");
	
		System.out.println("Тест метода get:");
		for (int i = 0; i < test.size; i++) {
			System.out.println("День недели:" + test.get(i));
		}
		System.out.println("Тест метода size:");
		System.out.println(test.size);
		
		System.out.println("Тест метода remov:");
		test.remove("Среда");
		for (int i = 0; i < test.size; i++) {
			System.out.println(test.get(i));
		}
		System.out.println("Тест метода conteins:");
		System.out.println(test.contains("Среда"));
		System.out.println(test.contains("Вторник"));
		System.out.println("Тест метода clear:");
		test.clear();
		System.out.println(test.isEmpty());
	
	}
		
}
