package compare;

import java.util.ArrayList;

public class CompareDemo {

	public static void main(String[] args) {
		ArrayList<String> oneText = new ArrayList<>();
		ArrayList<String> twoText = new ArrayList<>();
		CompareList<String> res = new CompareList<>();
		MyBufferReader<String> read = new MyBufferReader<>();
		read.addFile(oneText, "D:\\1.txt");
		read.addFile(twoText, "D:\\2.txt");
		if (oneText.size() > twoText.size()) {
			res.compare(twoText, oneText);
		} else {
			res.compare(oneText, twoText);
		}
		for(int i = 0; i < res.result.size(); i++) {
			System.out.println(res.result.get(i));
		}
	}
}
