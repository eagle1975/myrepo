
public class PrimeNumber {
	public static void main(String[] args) {
		int numbers[] = {2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
		int i, n;
	
	   for (i = 0; i < numbers.length; i++) {
			for (n = 2; n  <= numbers[i]; n++) {
				if ((numbers[i] % n) == 0) {
					if (n != numbers[i])
						break;
					else System.out.print(numbers[i] + " ");
				}
			}
		}
	}
}
