/**
reverse order command-line arguments
@author Alexandr Orlichenko
*/
public class Inversion {

	public static void main(String[] args) {
		int i;
				
		for (i = args.length - 1; i >= 0; i--)  
			System.out.print(args[i] + " ");
	}
}