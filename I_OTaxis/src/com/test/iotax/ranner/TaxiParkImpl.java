// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.

package com.test.iotax.ranner;

import com.test.iotax.except.SpeedException;
import com.test.iotax.vehicle.IVehicle;

public class TaxiParkImpl implements ITaxiPark{
	
	private static IVehicle[] res = new IVehicle[0];
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
	public IVehicle[] findeCarsBySpeedByRengó(int minSpeed, int maxSpeed) throws SpeedException {
		if (minSpeed < 0 || maxSpeed < 0) 
			throw new SpeedException();
		for (IVehicle car : cars) {
			if ((minSpeed <= car.getMaxSpeed()) && (car.getMaxSpeed() <= maxSpeed)) 
				res = arrayFiller(res, car);
		}
		 return res;
   }
	IVehicle[] arrayFiller(IVehicle[] cars, IVehicle findeCar) {
		IVehicle[] temp = new IVehicle[cars.length + 1];
		for (int i = 0; i < cars.length; i++)
			temp[i] = cars[i];
		temp[cars.length] = findeCar;
		return temp;
	}
}	
	


