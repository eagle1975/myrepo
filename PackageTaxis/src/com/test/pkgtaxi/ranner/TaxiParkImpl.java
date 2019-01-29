package com.test.pkgtaxi.ranner;

import com.test.pkgtaxi.vehicle.IVehicle;

// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.
public class TaxiParkImpl implements ITaxiPark{
		
	private IVehicle[] cars;
	
	public TaxiParkImpl(IVehicle[] car) {
		cars = car;
	}
	
	public float costTaxis() {
		float cost = 0;
		for (IVehicle car : cars) {
			cost += car.getPrice();			
		}
		return cost;
	}
	
	public void sortByFuelConsumption() {
		IVehicle temp;
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
	public IVehicle[] findeCarsBySpeedByRengó(int minSpeed, int maxSpeed) {
		int counter = 0;
		 int r = 0;
		 IVehicle[] res;
		 for (IVehicle car : cars) {
			if ((minSpeed <= car.getMaxSpeed()) && (car.getMaxSpeed() <= maxSpeed)) {
				counter += 1;
			}
		}
		 res = new IVehicle[counter];
		 for (IVehicle ca : cars) {
			 if ((minSpeed <= ca.getMaxSpeed()) && (ca.getMaxSpeed() <= maxSpeed)) {
				 res[r++] = ca;
				 }
			 }
		 return res;
   }
}	
	


