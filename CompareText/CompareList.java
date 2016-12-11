package compare;

import java.util.ArrayList;
import java.util.List;

public class CompareList<Item> implements Compare<Item> {
	public ArrayList<Item> result = new ArrayList<>(); 

	@Override
	public void compare(List<Item> a, List<Item> b) {
		for (int i = 0; i < a.size(); i++) {
			if ((a.get(i)).equals(b.get(i))) {
				continue;
			} else {
				result.add((Item) a.get(i));
				result.add((Item) b.get(i));
			}	
		}
		for (int i = a.size(); i < b.size(); i++) {
			result.add(b.get(i));
		}
	}
	
}


