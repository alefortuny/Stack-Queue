package stack;

public class MyQueue 
{
	char[] queue;
	int tail;
	int MAX;
	int head;
	
	public MyQueue(int tamaño)
	{
		this.queue = new char[tamaño];
		this.MAX = queue.length;
		this.tail = 0;
		this.head = 0;
	}
	
	public void insert(char data) 
	{
		if(tail == MAX) 
		{
			System.out.println("Queue is full"); 
		}
		else 
		{
			queue[tail++] = data;/* inserts data*/ 
		} 
	}
	
	public char delete() 
	{ 
		if(tail == 0)
		{
			System.out.println("Queue is empty"); 
			return '#';
		}
		else 
		{
			tail = tail - 1 ; /* decreases top */
			return queue[head++]; /*retuns eliminated element*/
		}
	}
	
}
