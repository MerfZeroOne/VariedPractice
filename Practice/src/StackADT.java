
public interface StackADT<T> {
	
	
	
	public void push (T element); 
	// adds the specified element to the top of this stack
	
	public T pop();
	//removes and returns the top element of this stack
	
	public T peek();
	// returns the top element of the stack without removing it
	
	public boolean isEmpty();
	// returns true if the stack contains no elements
	
	public int size();
	// returns the number of elements in this stack
	
	public String toString();
	// returns a sting representation of this stack

	

	
	

}
