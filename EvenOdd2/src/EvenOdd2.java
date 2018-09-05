
public class EvenOdd2 {

	public static void main(String[] args) {
	int array[] = {1, 2, 3, 55, 65, 75, 44, 128, 52, 83};
	int i;
	
	System.out.print("Even numbers:" + " ");
		for (i = 0; i < array.length; i++) {
			if ((array[i] % 2) == 0) 
				System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.print("Odd numbers:" + " ");
		for (i = 0; i < array.length; i++) {
			if ((array[i] % 2) != 0) 
				System.out.print(array[i] + " ");
		}
	}
}