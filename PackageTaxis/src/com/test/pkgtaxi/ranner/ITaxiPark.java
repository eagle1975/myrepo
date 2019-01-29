package com.test.pkgtaxi.ranner;

import com.test.pkgtaxi.vehicle.IVehicle;

public interface ITaxiPark {
	
	float costTaxis();
	void sortByFuelConsumption();
	IVehicle[] findeCarsBySpeedByReng�(int minSpeed, int maxSpeed);
}
