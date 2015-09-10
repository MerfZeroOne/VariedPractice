import java.util.Stack;


public class stringArrayMain {

	public stringArrayMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Stack<String> dataStack = new Stack<String>();
		
		System.out.println("Before adding: " + dataStack);
		
		dataStack.push("This");
		dataStack.push("is");
		dataStack.push("is");
		dataStack.push("a");
		dataStack.push("test");
		System.out.println(dataStack.toString());
		System.out.println(dataStack.pop());
		System.out.println(dataStack.peek());
		System.out.println(dataStack.pop());
		System.out.println(dataStack.pop());
		System.out.println(dataStack.pop());
		
	

	}

}
