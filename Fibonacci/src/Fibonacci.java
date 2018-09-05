
public class Fibonacci {

	public static void main(String[] args) {
		int array[];
		array = new int [20];
		int i;
		int sum = 0;
		
		array[0] = array[1] = 1;
		for (i = 2; i < 20; i++, sum = 0) {
			sum = array[i-2] + array[i - 1];
			array[i] = sum;
		}
		for (i = 0; i < 20; i++) 
			System.out.print(array[i] + " ");
	}

}
