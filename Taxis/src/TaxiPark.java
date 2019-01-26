// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.
public class TaxiPark {
		
	private Vehicle[] cars;
	
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
		int counter = 0;
		 int r = 0;
		 Vehicle[] res;
		 for (Vehicle car : cars) {
			if ((minSpeed <= car.getMaxSpeed()) && (car.getMaxSpeed() <= maxSpeed)) {
				counter += 1;
			}
		}
		 res = new Vehicle[counter];
		 for (Vehicle ca : cars) {
			 if ((minSpeed <= ca.getMaxSpeed()) && (ca.getMaxSpeed() <= maxSpeed)) {
				 res[r++] = ca;
				 }
			 }
		 return res;
   }
}	
	


