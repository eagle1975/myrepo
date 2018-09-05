
public class EvenOdd {

	public static void main(String[] args) {
	int i;
	int a;
	
	System.out.print("Even numbers:" + " ");
		for (i = 0; i < args.length; i++) {
			 a = Integer.parseInt(args[i]);
			if ((a % 2) == 0) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
		System.out.print("Odd numbers:" + " ");
		for (i = 0; i < args.length; i++) {
			a = Integer.parseInt(args[i]);
			if ((a % 2) != 0) {
				System.out.print(a + " ");
			}
		}
	}
}
