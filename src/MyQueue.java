import java.util.Stack;


public class MyQueue {
	
	private Stack first = new Stack();
	private Stack second = new Stack();
	
	/**
	 * Metoda koja dodaje novi element
	 * @param value
	 */
	
	public void push(int value)
	{
		first.push(value);
	}
	
	/**
	 * Metoda koja izbacuje prvi element koji je dodan i ispisuje njegovu vrijednost
	 * @return value
	 */
	
	public int pop()
	{
		if (second.isEmpty() == true)
		{
			while(first.isEmpty() == false)
			{
				second.push(first.pop());
			}
		}
		return (int) second.pop();
	}
	
	/**
	 * Metoda koja ispisuje prvi element koji je dodan
	 * @return
	 */
	
	public int peek()
	{
		return (int) second.peek();
	}
	
	/**
	 * Metoda koja vraæa broj elemenata
	 * @return size
	 */
	
	public int getSize()
	{
		return second.size();
	}
	
	/**
	 * Metoda koja vraæa element odreðen indeksom
	 * @param index
	 * @return value
	 */
	
	public int get(int index)
	{
		return (int) second.get(index);
	}
}
