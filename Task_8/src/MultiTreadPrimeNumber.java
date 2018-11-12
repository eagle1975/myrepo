

public class MultiTreadPrimeNumber {

	public static void main(String[] args) {
		int minRangeValue;
		int maxRangeValue;
		int numberOfThread;
		int interval;
		
		minRangeValue = Integer.parseInt(args[0]);
		maxRangeValue = Integer.parseInt(args[1]);
		numberOfThread = Integer.parseInt(args[2]);
		interval = (maxRangeValue - minRangeValue) / numberOfThread;
		
		for (int i = 0; i < numberOfThread; i++) {
			if ((i + 1) < numberOfThread) {
				new MyThread("Thread #" + (i + 1), minRangeValue + (i * interval), minRangeValue + ((i + 1) * interval));
			}
			else if ((i + 1) == numberOfThread) {
				new MyThread("Thread #" + (i + 1), minRangeValue + (i * interval), maxRangeValue);
			}
		}
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("Main thread interrapted");
		}
		System.out.println("Main thread ended");
	}

}
