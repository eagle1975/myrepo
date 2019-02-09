package com.test.iotax.ranner;

import com.test.iotax.except.SpeedException;
import com.test.iotax.vehicle.IVehicle;

public interface ITaxiPark {
	
	float costTaxis();
	void sortByFuelConsumption();
	IVehicle[] findeCarsBySpeedByReng�(int minSpeed, int maxSpeed) throws SpeedException;
}
