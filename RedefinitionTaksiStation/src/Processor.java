
 class Processor {
	
	private Car[] carProc;
	
	public Processor() {
		
	}
	
	public Processor(Car[] car) {
		this.carProc = car;
	}
	
	public void findeCarByMark(Car[] cars, String marka) {
		for(Car car : cars) {
			if(marka.equals(car.getMarka()))
				printCar(car);
		}
	}
	
	public void findeCarByMark(String marka) {
		if (getCarProc() != null) {
			findeCarByMark(getCarProc(), marka);
		}
	}
	
	public void findeCarByMarkAndYear(Car[] cars, String marka, int year) {
		for (Car car : cars) {
			if(marka.equals(car.getMarka()) && (year <= (2018 - car.getProductionYear())))
				printCar(car);
		}	
	}
	
	public void findeCarByMarkAndYear(String marka, int year) {
		if (getCarProc() != null) {
			findeCarByMarkAndYear(getCarProc(), marka, year);
		}
	}
	
	void findeCarByYearAndPrice(Car[] cars, int year, int price) {
		for (Car car : cars) {
			if ((year == car.getProductionYear()) && (price < car.getPrice()))
				printCar(car);
		}
	}
	
	void findeCarByYearAndPrice(int year, int price) {
		if (getCarProc() != null) {
			findeCarByYearAndPrice(getCarProc(), year, price);
		}
	}
	
	void printCar(Car car) {
		System.out.println(car);
	}
	
	public Car[] getCarProc() {
		return carProc;
	}
}

