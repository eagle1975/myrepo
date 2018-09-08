
public class MaxMinLong {

	public static void main(String[] args) {
	int numbers[] = {1, 324, 22, 56745, 234, 8434, 234564, 7896543};
	int i;
	int temp;
	int counter;
	int min = 10;
	int max = 0;
	int minValue = 0;
	int maxValue = 0;
	
	for (i = 0; i < numbers.length; i++) {
		temp = numbers[i] / 10;
		counter = 1;
		while (temp > 0) {
			temp = temp / 10;
			counter += 1;
		}
		if (min > counter) {
			min = counter;
			minValue = numbers[i];
		}	
		else { 
			max = counter;
			maxValue = numbers[i];
		}
	}
	System.out.print(" min mumber" + " " + minValue +  " " + "contein" + " " + min + " "+ "digits");
	System.out.println();
	System.out.print(" max mumber" + " " +  maxValue + " " + "contein" + " " + max + " " + "digits");
	}

}
