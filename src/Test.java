
public class Test {

	//Testna klasa
	
	public static void main(String[] args) {
	
		MyQueue queue = new MyQueue();
		for (int i=0; i<5; i++)
		{
			queue.push(i+1);
		}
		for (int i=0; i<5; i++)
		{
			System.out.println(queue.pop());
		}
		
		Stack stack = new Stack();
		for (int i=0; i<5; i++)
		{
			stack.push(i+1);
		}
		for (int i=0; i<5; i++)
		{
			System.out.println(stack.pop());
		}
		System.out.println("Minimal value: " + stack.getMin());

	}

}
