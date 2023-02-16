package stack;

public class MyStack 
{	
	char[] stack;
	int top;
	int MAX;
	
	public MyStack(int tamaño)
	{
		this.stack = new char[tamaño];
		this.MAX = stack.length;
		this.top = 0;
	}
	
	public void push(char data) 
	{ 
		if(top == MAX)
		{
		System.out.println("Stack is full");
		}
		else 
		{ 
			stack[top] = data; /* adds element*/
			top++; /* increases top */ 
		} 
	} 

	
	public char pop() 
	{ 
		if(top == 0)
		{
			System.out.println("Stack is empty"); 
			return '\0';
		}
		else 
		{
			top = top - 1 ; /* decreases top */
			return stack[top]; /*retuns eliminated element*/
		}
	}
}
