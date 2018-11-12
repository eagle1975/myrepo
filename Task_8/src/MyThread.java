

 class MyThread implements Runnable {
	String name;
	Thread thr;
	int min;
	int max;
	
	MyThread(String nameTread, int minValue, int maxValue) {
		name = nameTread;
		min = minValue;
		max = maxValue;
		thr = new Thread(this, name);
		System.out.println("New thread:" + thr);
		thr.start();
	}
	
	public void run() {
		try {
			 for (int i = min; i <= max; i++) {
					for (int n = 2; n  <= i; n++) {
						if ((i % n) == 0) {
							if (n != i)
								break;
							else System.out.print(i + " ");
						}
					}
			Thread.sleep(50);
			 }
		} catch (InterruptedException e ) {
			System.out.println(name + "interrupted" );
		}
		System.out.println(name + "completed");
	}
}
