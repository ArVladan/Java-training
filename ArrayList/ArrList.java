package com.sourseit.arrlist;
import interlist.ListatorIn;

public class ArrList<Item> implements IList<Item> {
    public Object arr[];
    public int size = 0;
    public ArrayIterator<Item> iterator;
    public int index = 0;
    
    public ArrList() {
        this.arr = new Object[10];
        this.iterator = new ArrayIterator<Item>();
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
    	if (size == 0) {
    		return true;
    	} else {
    	return false;
    	}
    }
    
    @Override
    public void clear() {
    	Object[] clean = new Object[arr.length];
    	size = 0;
    	arr = clean;
    }
    
   
	@SuppressWarnings("hiding")
	public class ArrayIterator<Item> implements ListatorIn <Item> {
		int i = 0;

		@SuppressWarnings("unchecked")
		@Override
		public Item next() {
			if (index == -1) {
				index = 1;
			}
			while (hasNext()) {
				index--;
				return (Item) arr[index++]; 
			}
			return null;
		}

		@SuppressWarnings("unchecked")
		@Override
		public Item previous() {
			if (index == size) {
				index -= 2;
			}
			while (hasPrev()) {
				index++;
				return (Item) arr[index--]; 
			}
			return null;
		}

		@Override
		public boolean hasNext() {
			while (index++ < size) {
				return true;
			}
			return false;		
		}

		@Override
		public boolean hasPrev() {
			while (index-- >= 0) {
				return true;
			}
			return false;
		}

		@Override
		public void remove() {
			for (int i = 0; i <= size; i++) {
	    		if (arr[i] == arr[index-1]) {
	    			for (; i < size; i++) {
	    	    		arr[i] = arr[i+1];
	    			}
	    		}
	    	}
			index--;
			size--;
		}
    	
    }
}
