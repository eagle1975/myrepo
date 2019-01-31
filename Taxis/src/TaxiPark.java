// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.
public class TaxiPark {
		
	private Vehicle[] cars;
	private static Vehicle[] res = new Vehicle[0]; 
	
	public TaxiPark(Vehicle[] car) {
		cars = car;
	}
	
	public float costTaxis() {
		float cost = 0;
		for (Vehicle car : cars) {
			cost += car.getPrice();			
		}
		return cost;
	}
	
	public void sortByFuelConsumption() {
		Vehicle temp;
		for (int i = 0; i < cars.length -1; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getFuelConsumption() > cars[j].getFuelConsumption()) {
					temp = cars[i];
					cars[i] = cars[j];
					cars[j] = temp;
				}
			}
		}
	}
	public Vehicle[] findeCarsBySpeedByRengó(int minSpeed, int maxSpeed) {
		
		 for (Vehicle car : cars) {
			if ((minSpeed <= car.getMaxSpeed()) && (car.getMaxSpeed() <= maxSpeed)) 
				res = arrayFiller(res, car);
		}
		 return res;
  }
	Vehicle[] arrayFiller(Vehicle[] cars, Vehicle findeCar) {
		Vehicle[] temp = new Vehicle[cars.length + 1];
		for (int i = 0; i < cars.length; i++)
			temp[i] = cars[i];
		temp[cars.length] = findeCar;
		return temp;
	}
}	
	


