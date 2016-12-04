package com.sourseit.arrlist;

public interface IList<Item> {
    void add(Item a);
    Item get(int position);
    int size();  
    void remove(Item t);
    boolean contains(Item t);
    boolean isEmpty();
    void clear();
}