package stacks_queues;

public class MyStack 
{
	char[] stack;
	int top;
	int MAX;
	
	public MyStack(int tamaño)
	{
		this.stack = new char[tamaño];
		this.MAX = stack.length - 1;
		this.top = 0;
	}
	
	public void push(char data) 
	{ 
		if(top == MAX)
		System.out.println("Stack is full");
		else 
		{ 
			stack[top] = data;
			top++; 
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
			top--;
			return stack[top];
		}
	}
	
	public void imprimirStack()
	{
		if(top == 0)
		System.out.println("Stack is empty");
		else
		{
			for(int i = 0; i < top; i++)
			{
				System.out.println(stack[i]);
			}
		}
	}
	
	public void invertirCadena(String cadena) 
	{
	    MyStack stack = new MyStack(cadena.length());
	    
	    for (int i = 0; i < cadena.length(); i++) 
	    {
	        stack.push(cadena.charAt(i));
	    }
	    System.out.print("Cadena invertida: ");
	    while (stack.top > 0) 
	    {
	        System.out.print(stack.pop());
	    }
	}
	
	public boolean esPalindromo(String cadena) 
	{
	    MyStack stack = new MyStack(cadena.length());
	    String cadenaSinEspacios = cadena.replaceAll("\\s+", "");
	    char[] caracteres = cadenaSinEspacios.toCharArray();

	    for (char c : caracteres) 
	    {
	        stack.push(Character.toLowerCase(c));
	    }
	    for (char c : caracteres) 
	    {
	        if (Character.toLowerCase(c) != stack.pop()) 
	        {
	            return false;
	        }
	    }

	    return true;
	}
}