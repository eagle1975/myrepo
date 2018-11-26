
public class Processor {
	
	private Car[] carProc;
	
	public Processor(Car[] carProc) {
		this.carProc = carProc;
	}
	
	void findeCarByMark(String m) {
		for(Car car:carProc) {
			if(m.equals(car.getMarka()))
				printCar(car);
		}
	}
	
	void findeCarByMarkAndYear(String m, int y) {
		for (Car car:carProc) {
			if(m.equals(car.getMarka()) && (y <= (2018 - car.getProductionYear())))
				printCar(car);
		}	
	}
	
	void findeCarByYearAndPrice(int y, int p) {
		for (Car car:carProc) {
			if ((y == car.getProductionYear()) && (p < car.getPrice()))
				printCar(car);
		}
	}
	
	void printCar(Car car) {
		System.out.println(car.toString());
	}
}
