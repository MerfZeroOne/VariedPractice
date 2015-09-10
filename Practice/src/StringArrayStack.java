import java.util.Arrays;

// PRACTICE

public class StringArrayStack<T> implements StackADT<T> {
	private int top;
	private T[] stack;

	
	// CONSTRUCTOR
	public StringArrayStack(int initialCapacity) {
		
		top=0;
		stack = (T[])(new Object[initialCapacity]);
	}

	//PUSH
	@Override
	public void push(T element) {
	if (size()== stack.length)
			expandCapacity();
	stack[top] = element;
	top++;
		
	}
	//EXPAND CAPACITY
	public void expandCapacity(){
		stack = Arrays.copyOf(stack, stack.length*2);
	}
	
	// POP
	public T pop()throws EmptyCollectionException {
		if (isEmpty())
			throw new EmptyCollectionException ("The Stack is empty!");
		top--;
		T result = stack[top];
		stack[top] = null;
		return result;
	}

	
	public T peek() throws EmptyCollectionException  {
		if (isEmpty())
			throw new EmptyCollectionException ("The Stack is empty!");
		return stack[top -1];
	}

	
	public boolean isEmpty() {
		return top==0;
	}

	
	public String toString(){
		String sResult = " ";
		for (int i = 0; i < top; i++)
			sResult += stack[i] + " ";
			
		return sResult;
	}





	@Override
	public int size() {
		// TODO Auto-generated method stub
		return stack.length;
	}



}