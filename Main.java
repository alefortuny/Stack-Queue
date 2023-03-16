package stacks_queues;

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
		
		stack1.imprimirStack();
		System.out.println("");
		
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		stack1.pop();
		System.out.println("");
		
		MyQueue queue1 = new MyQueue(15);
		
		queue1.insert('a');
		queue1.insert('b');
		queue1.insert('c');
		queue1.insert('d');
		queue1.insert('b');
		
		queue1.imprimirQueue();
		System.out.println("");
		
		System.out.println(queue1.delete());
		System.out.println(queue1.delete());
		System.out.println(queue1.delete());
		System.out.println(queue1.delete());
		System.out.println(queue1.delete());
		queue1.delete();
		System.out.println("");
		
		String cadena = "tarea completada";
		MyStack invertir = new MyStack(cadena.length());
	    invertir.invertirCadena(cadena);
	    System.out.println("");
	    
	    System.out.println("");
	    String posiblePalindromo = "anita lava la tina";
	    MyStack stack = new MyStack(posiblePalindromo.length());
	    System.out.println("¿El string: " + posiblePalindromo + " es palíndromo? " + stack.esPalindromo(posiblePalindromo));
	}
}