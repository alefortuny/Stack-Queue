package stack;

public class Main 
{
	
	public static void main(String[] args)
	{
		MyStack stack1 = new MyStack(15);
		
		stack1.push('a');
		stack1.push('b');
		stack1.push('c');
		stack1.push('d');
		stack1.push('b');
		
		imprimirStack(stack1.stack);
		
		for(int i = stack1.top; i >= 0; i--)
		{
			System.out.println(stack1.pop());
		}
	
		MyQueue queue1 = new MyQueue(15);
		
		queue1.insert('a');
		queue1.insert('b');
		queue1.insert('c');
		queue1.insert('d');
		stack1.push('b');
		
		imprimirStack(queue1.queue);
		
		System.out.println(queue1.delete());
		System.out.println(queue1.delete());
		System.out.println(queue1.delete());
		System.out.println(queue1.delete());
		System.out.println(queue1.delete());
		System.out.println(queue1.delete());
		
	}
	
	public static void imprimirStack(char[] stack)
	{
		for(int i = 0; i < stack.length; i++)
		{
			System.out.println(stack[i]);
		}
	}
	
}
