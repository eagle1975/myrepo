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
		for (int i = 0; i <= cars.length -1; i++) {
			for (int j = 1; j <= cars.length; j++) {
				if (cars[i].getFuelConsumption() > cars[j].getFuelConsumption()) {
					temp = cars[i];
					cars[i] = cars[j];
					cars[j] = temp;
				}
			}
		}
	}
	
	public Vehicle[] findeCarsBySpeedByRengó(int minSpeed, int maxSpeed) {
		Vehicle tempArray[] = null;
		for (Vehicle car : cars) {
			if (minSpeed <= car.getMaxSpeed() && car.getMaxSpeed() <= maxSpeed)
				tempArray = hoarderFinderCars(car, tempArray);
		}
		return tempArray;
	}
	
	public Vehicle[] hoarderFinderCars(Vehicle car, Vehicle[] tempArray) {
		Vehicle[] tempHolderArray = new Vehicle[tempArray.length + 1];
		tempHolderArray = tempArray;
		tempHolderArray[tempArray.length + 1] = car;
		return tempHolderArray;
		
				
	}

}
