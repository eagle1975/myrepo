package com.test.exctax.ranner;

import com.test.exctax.except.SpeedException;
import com.test.exctax.vehicle.IVehicle;

public interface ITaxiPark {
	
	float costTaxis();
	void sortByFuelConsumption();
	IVehicle[] findeCarsBySpeedByReng�(int minSpeed, int maxSpeed) throws SpeedException;
}
