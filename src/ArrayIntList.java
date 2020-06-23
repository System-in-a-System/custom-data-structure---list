

public class ArrayIntList extends AbstractIntCollection implements IntList {
		
	// Implement IntList interface and abstract methods:

	
	// Adds integer n to the end of the list
	@Override
	public void add(int n) {
		
		// Locate the correct index address & Add an element to it & Update the size count
		values[size++] = n;
		
		// If the content of the array is reaching its bounds, resize the array
		if (size == values.length)
			resize();	
	}

	
	
	// Inserts integer n at position index. 
	// Shifts the element currently at that position (if any) and any subsequent elements to the right
	@Override
	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		
		// Check if index is within the bounds
		checkIndex(index,size+1);
		
		// Shift all subsequent elements after specified index to the right
		for (int i = size; i > index; i--) 
			values[i] = values[i-1];
		
		// Add an element at specified index
		values[index] = n;
		
		// Update the size count
		size++;
		
		// Check if the array needs to be resized
		if (size == values.length)
			resize();
	}

	
	
	// Removes integer at position index
	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
		
		// Check if a given index is within the bounds
		checkIndex(index,size);
		
		// Shift all subsequent elements after given index to the right
		for (int i = index; i < size; i++)
			values[i] = values[i+1];
		
		// Update the size count
		size--;
	}
	
	

	// Gets integer at position index
	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		// Check if a given index is within the bounds
		checkIndex(index, size);
		return values[index];
	}
	
	
	
	// Finds position of integer n, otherwise return -1
	@Override
	public int indexOf(int n) {
		int index = -1;
		
		for (int i = 0; i < values.length; i++) {
			if(values[i] == n) 
				index = i;
		}
		
		return index;
	}

}
