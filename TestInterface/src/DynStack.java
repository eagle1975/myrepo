
public class DynStack implements IntStack{
	
	private int stack[];
	private int toss;
	
	public DynStack(int item) {
		stack = new int[item];
		toss = -1;
	}
	
	public void push(int item) {
		if (toss == stack.length - 1) {
			int temp[] = new int[stack.length * 2];
			for (int i = 0; i < stack.length; i++)
				temp[i] = stack[i];
			stack = temp;
			stack[++toss] = item;
		}
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
