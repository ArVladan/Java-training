package compare;

import java.util.Iterator;

import com.sourseit.arrlist.ArrList;

public class Compare {

	public static void main(String[] args) {
	ArrList <String> oneText = new ArrList<>();
	ArrList <String> twoText = new ArrList<>();
	ArrList <String> result = new ArrList<>();
	oneText.add("��������� ���� ������� ������");
	oneText.add("����� � ���������� ������ ����");
	oneText.add("�� �� ����� �� ���� ��� backup�");
	oneText.add("��� ����� ����");
	twoText.add("��������� ���� ������� ������");
	twoText.add("����� � ���������� ������ ����");
	twoText.add("�� �� ����� �� ���� ��� backup�");
	twoText.add("��-��, ��������, ��� ����� ����!");

	if (oneText.size == twoText.size) {
		for (int i = 0; i < oneText.size; i++) {
			if ((oneText.get(i)).equals(twoText.get(i))) {
				continue;
			} else {
				result.add(oneText.get(i));
				result.add(twoText.get(i));
			}
		}
	} else if (oneText.size > twoText.size) {
		for (int i = 0; i < twoText.size; i++) {
			if ((oneText.get(i)).equals(twoText.get(i))) {
				continue;
			} else {
				result.add(oneText.get(i));
				result.add(twoText.get(i));
			}
		}
		for (int i = twoText.size; i < oneText.size; i++) {
			result.add(oneText.get(i));
		}
	} else {
		for (int i = 0; i < oneText.size; i++) {
			if ((oneText.get(i)).equals(twoText.get(i))) {
				continue;
			} else {
				result.add(oneText.get(i));
				result.add(twoText.get(i));
			}
		}
		for (int i = oneText.size; i < twoText.size; i++) {
			result.add(twoText.get(i));
		}
	}
	
	Iterator<String> it = result.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	
	}
}