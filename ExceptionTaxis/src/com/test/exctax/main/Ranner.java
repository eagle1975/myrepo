// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.

package com.test.exctax.main;

import com.test.exctax.ranner.*;
import com.test.exctax.vehicle.*;
import com.test.exctax.except.SpeedException;

public class Ranner {

	public static void main(String[] args) {
		
		IVehicle[] cars = {
				new CargoTaxiImpl(1, "Renault",   "Maskott",       "White", 2017, 16500, 10, 150, 7500),
				new CargoTaxiImpl(2, "Iveco",     "Daily",         "Blue",  2009, 9400,  8,  130, 3860),
				new Bus      (3, "Scania",    "OmniExpress",   "Green", 2018, 30000, 15, 180, 51, "tourist"),
				new Bus      (4, "LAZ",       "InterLAZ-10LE", "White", 2017, 25000, 13, 145, 45, "suburban"),
				new Cars     (5, "Opel",      "Omega",         "Black", 2013, 15000, 8,  180, 5, "Hatchback"),
				new Cars     (6, "Chevrolet", "Aveo",          "Red",   2016, 12000, 12, 167, 5, "Sedan"),
				new Cars     (7, "Opel",      "Astra",         "Green", 2009, 15000, 7,  145, 4, "Sedan" )
		};
		
		System.out.println("All cars in taxis:");
		for (IVehicle car : cars) 
			System.out.println(car.toString());
		System.out.println();
		
		ITaxiPark taxiOb = new TaxiParkImpl(cars);
		
		System.out.print("The cost of taxis: ");
		System.out.println(taxiOb.costTaxis() + " $");
		System.out.println();
		
		System.out.println("Sort by fuel consaumption:");
		taxiOb.sortByFuelConsumption();
		for (IVehicle car : cars) 
		System.out.println(car.toString());
		System.out.println();
		
		System.out.println("Finde cars by speed by reng�:");
		try {
			IVehicle findeCars[] = taxiOb.findeCarsBySpeedByReng�(-120, 150);
			for (IVehicle car : findeCars)
				System.out.println(car.toString());
		} catch (SpeedException e) {
			System.err.println(e);
			}
	}
}
