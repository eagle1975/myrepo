
public class FixedStack implements IntStack{

	private int stack[];
	private int toss;
	public FixedStack(int size) {
		stack = new int[size];
		toss = -1;
	}
	public void push(int item) {
		if (toss == stack.length -1)
			System.out.println("Стек заполнен");
		else
			stack[++toss] = item;
				
	}
	public int pop() {
		if (toss < 0) {
			System.out.println("Стек не загружен");
			return 0;
			
		}
		else
			return stack[toss--];
					
			
		
	}
	
	
}
