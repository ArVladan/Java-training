package com.sourseit.arrlist;

import java.util.Iterator;

public class ArrList<Item> implements IList<Item>, Iterable<Item> {
    public Object arr[];
    public int size = 0;
    
    public int index = 0;
    
    public ArrList() {
        this.arr = new Object[10];
       
    }
    
    public ArrList(int length) {
        this.arr = new Object[length];
    }
    
    @Override
    public void add(Item a) {
    	if (size >= arr.length)
    		resize();
    	arr[size++] = a;
    }
    
	private void resize() {
		Object[] temp = new Object[(arr.length * 3) / 2 + 1];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];	
		}
		arr = temp;
	}

	@SuppressWarnings("unchecked")
	@Override
    public Item get(int position) {
        return (Item) arr[position]; // arr[position] -> (String)Object 
    }
    

    @Override
    public int size() {
        return size;
    }
   
    @Override
    public void remove(Item t) {
    	for (int i = 0; i <= size; i++) {
    		if (arr[i] == t) {
    			for (; i < size; i++) {
    	    		arr[i] = arr[i+1];
    	    	}
    		}
    	}
    	size--;
    }
  
    
    @Override
    public boolean contains(Item t) {
 
    	for(int i = 0; i <= size; i++ ) {
    		if (arr[i] == t) {
    			return true;	
    		}
    	}
    	return false;
    }
    
    @Override
	
    public boolean isEmpty() {
    	return size == 0;
    }
    
    @Override
    public void clear() {
    	Object[] clean = new Object[arr.length];
    	size = 0;
    	arr = clean;
    }

	@Override
	public Iterator<Item> iterator() {
		Iterator<Item> it = new Iterator<Item>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < size && arr[index] != null;
			}

			@SuppressWarnings("unchecked")
			@Override
			public Item next() {
				return (Item) arr[index++];
			}
			
			
		};
		return it;
	}

	
	
}
	


