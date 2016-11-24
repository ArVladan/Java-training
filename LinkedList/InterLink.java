package com.sourceit.linked;

import com.sourseit.arrlist.IList;

public interface InterLink<Item> extends IList<Item> {
	
	void addFirst(Item a);
	void addLast(Item a);
	Item getFirst();
	Item getLast();

}
