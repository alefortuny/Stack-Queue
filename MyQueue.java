package stacks_queues;

public class MyQueue 
{
	public char[] queue;
	int tail;
	int HEAD;
	
	public MyQueue(int tamaño)
	{
		this.queue = new char[tamaño];
		this.HEAD = 0;
		this.tail = 0;
	}
	
	public void insert(char data) 
	{
		if(tail == queue.length) 
		System.out.println("Queue is full"); 
		else 
		{
			queue[tail] = data;
			tail++;
		} 
	}
	
	public char delete()
	{
		if(HEAD == tail)
		{
			System.out.println("Queue is empty");
			return '#';
		}
		else
		{
			char elementoEliminado = queue[HEAD];
			HEAD++;
			return elementoEliminado;
		} 
	}
	
	public void imprimirQueue()
	{
		if(HEAD == tail)
		System.out.println("Queue is empty");
		else
		{
			for(int i = HEAD; i < tail; i++)
			{
				System.out.println(queue[i]);
			}
		}
	}
}