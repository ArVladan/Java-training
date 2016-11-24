package com.sourceit.linked;

public class MyLinked<Item> implements InterLink<Item> {
	private Node firstNode;
	private Node lastNode;
	private int size;
	
	public MyLinked() {
	
	}
	
	@Override
	public void add(Item a) {
		Node newNode = new Node(a);
		if (size == 0) {
			firstNode = newNode;
			lastNode = newNode;
		} else  {
			Node temp = lastNode;
			lastNode = newNode;
			newNode.prev = temp;
			temp.next = newNode;	
		}
		size++;
	}

	@Override
	public Item get(int position) {
		int index = 1;
		Node fix = (Node) firstNode;
		if (position > size/2) {
			fix = lastNode;
			index = size;
			while (index > position) {
				fix = (Node) fix.prev;
				index--;
			}
		} else {
			while (index < position) {
				fix = (Node) fix.next;
				index++;
			}
		}
		return fix.element;
	}


	@Override
	public int size() {
		
		return size;
	}


	@Override
	public void remove(Item t) {
		Node remove = new Node(t);
		if (remove.element == firstNode.element) {
			firstNode = (Node) firstNode.next;
			firstNode.prev = null;
			size--;
			return;
		}
		if (remove.element == lastNode.element) {
			lastNode = (Node) lastNode.prev;
			lastNode.next = null;
			size--;
			return;
		}
		Node fix = firstNode;
			for (int i = 0; i < size; i++) {
				if (fix.element == remove.element) {
					remove = fix;
					fix = (Node) fix.prev;
					fix.next = remove.next;
					remove = (Node) remove.next;
					remove.prev = fix;
					size--;
					return;
				}
				fix = (Node) fix.next;
			}
			
	}


	@SuppressWarnings("unchecked")
	@Override
	public boolean contains(Object t) {
		Node contains = new Node((Item) t);
		Node fix = (Node) firstNode;
		for (int i = 0; i < size; i++) {
			if (fix.element == contains.element) {
				return true;
			} else {
				fix = (Node) fix.next;
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
		firstNode = null;
		lastNode = null;
		size = 0;
	}

	@Override
	public void addLast(Item a) {
		add(a);
	}

	@Override
	public void addFirst(Item a) {
		Node newNode = new Node(a);
		if (firstNode.next == null) {
			lastNode = firstNode;
			lastNode.prev = newNode;
			newNode.next = lastNode;	
		} else {
			firstNode.prev = newNode;
			newNode.next = firstNode;
		}
		firstNode = newNode;
		size++;
	}
	
	@Override
	public Item getFirst() {
		if (size == 0) {
			return null;
		}
		return (Item) firstNode.element;
	}

	
	@Override
	public Item getLast() {
		if (size == 0) {
			return null;
		}
		return (Item) lastNode.element;
	}
	
	private class Node {
		private Item element;
		private Node next;
		private Node prev;
		
		Node (Item element) {
			this.element = element;
		}

	}

}
