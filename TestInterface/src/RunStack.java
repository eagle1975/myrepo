
public class RunStack {

	public static void main(String[] args) {
		
		FixedStack fst = new FixedStack(8);
		FixedStack fst1 = new FixedStack(10);
		
		DynStack dst = new DynStack(5);
		DynStack dst1 = new DynStack(9);
		
		IntStack inface;
		
		inface = fst;
		
		for (int i = 0; i < 8; i++)
			inface.push(i);
		for (int i = 0; i < 8; i++)
			System.out.println(inface.pop());
		
		inface = fst1;
		
		for (int i = 0; i < 10; i++)
			inface.push(i);
		for (int i = 0; i < 10; i++)
			System.out.println(inface.pop());
		
		inface = dst;
		
		for (int i = 0; i < 10; i++)
			inface.push(i);
		for (int i = 0; i < 10; i++)
			System.out.println(inface.pop());
		
		inface = dst1;
		
		for (int i = 0; i < 15; i++)
			inface.push(i);
		for (int i = 0; i < 15; i++)
			System.out.println(inface.pop());
	}

}
