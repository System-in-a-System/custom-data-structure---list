
import java.lang.IndexOutOfBoundsException;

/* A simple interface describing an integer list*/
public interface IntList extends Iterable<Integer> {
	
	/* Adds integer n to the end of the list. */
	public void add(int n);
	
	/* Inserts integer n at position index. 
	 * Shifts the element currently at that position (if any)
	 * with furher shifting of all subsequent elements to the right.  */
	public void addAt(int n, int index) throws IndexOutOfBoundsException;
	
	/* Removes integer at the position index. */
	public void remove(int index) throws IndexOutOfBoundsException;
	
	/* Gets integer at the position index. */
	public int get(int index) throws IndexOutOfBoundsException;
	
	/* Returns the number of integers currently stored. */
	public int size();
	
	/* Returns true if collection is empty. */
	public boolean isEmpty();
	
	/* Finds position of integer n, otherwise returns -1 */
	public int indexOf(int n);
	
	/* Returnds String of format "[ 7 56 -45 68 ... ]" */
	public String toString();
}
