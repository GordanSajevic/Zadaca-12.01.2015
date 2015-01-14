
public class Stack {
	
	private Node head;
	private int min = 0;
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public Stack()
	{
		this.head = null;
	}
	
	/**
	 * Metoda koja dodaje novi element
	 * @param value
	 */
	
	public void push(int value)
	{
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
		if (min == 0)
		{
			min = newNode.value;
		}
		else if (min > newNode.value)
		{
			min = newNode.value;
		}
	}
	
	/**
	 * Metoda koja uklanja posljednji element i ispisuje njegovu vrijednost
	 * @return value
	 */
	
	public int pop()
	{
		if (head == null)
		{
			throw new NullPointerException("Stack is empty!");
		}
		Node current = head;
		head = head.next;
		int value = current.value;
		current = null;
		return value;
	}
	
	 public int getMin() {
	       return min;
	    }

	/**
	 * Metoda koja ispisuje vrijednost posljednjeg elementa
	 * @return value
	 */ 
	
	public int peek()
	{
		if (head == null)
		{
			throw new NullPointerException("Stack is empty!");
		}
		return head.value;
		
	}
	/**
	 * Metoda koja vraæa dužinu liste
	 * @return int
	 */
	
	public int getSize()
	{
		if (head == null)
		{
			return 0;
		}
		return getSize(head, 1);
	}
	
	/**
	 * Metoda koja rekurzivno raèuna dužinu liste
	 * @param current
	 * @param counter
	 * @return int
	 */
	
	private int getSize(Node current, int counter)
	{
		if (current == null)
		{
			return counter;
		}
		return getSize(current.next, counter+1);
	}
	
	/**
	 * Metoda koja vraæa boolean vrijednost u zavisnosti da li imamo u listi element sa vrijednošæu value
	 * @param value
	 * @return boolean
	 */
	
	public boolean contains(int value)
	{
		return contains(head, value);
	}
	
	/**
	 * Metoda koja rekurzivno provjerava da li imamo u listi element sa vrijednošæu value
	 * @param current
	 * @param value
	 * @return boolean
	 */
	
	private boolean contains(Node current, int value)
	{
		
		if (current.value == value)
		{
			return true;
		}
		if (current.next == null)
		{
			return false;
		}
		return contains(current.next, value);
	}
	
	/**
	 * Node klasa
	 * @author gordansajevic
	 *
	 */
	
	private class Node
	{
		private int value;
		private Node next;
		
		/**
		 * Konstruktor sa jednim parametrom
		 * @param value
		 */
		
		public Node(int value)
		{
			this.value = value;
			this.next = null;
		}
		
		/**
		 * Konstruktor sa dva parametra
		 * @param value
		 * @param next
		 */
		
		public Node(int value, Node next)
		{
			this.value = value;
			this.next = next;
		}
	}

}
