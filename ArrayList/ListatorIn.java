package interlist;

public interface ListatorIn <Item> {
	public Item next();
	public Item previous();
	public boolean hasNext();
	public boolean hasPrev();
	public void remove();

}
