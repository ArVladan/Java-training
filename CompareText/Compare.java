package compare;

import java.util.List;

public interface Compare<Item> {
	void compare(List<Item> a, List<Item> b);
}
