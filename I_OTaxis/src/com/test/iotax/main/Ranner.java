// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.

package com.test.iotax.main;

import com.test.iotax.ranner.*;
import com.test.iotax.vehicle.*;
import com.test.iotax.except.SpeedException;

public class Ranner {

	public static void main(String[] args) {		
		IVehicle[] cars =  null;
		DataFileReader dataFileReader = new DataFileReader();
		cars = dataFileReader.readerDataFile("fileToRead.txt");
		
		
//		System.out.println("All cars in taxis:");
//		for (IVehicle car : cars) 
//			System.out.println(car.toString());
//		System.out.println();
//		
//		ITaxiPark taxiOb = new TaxiParkImpl(cars);
//		
//		System.out.print("The cost of taxis: ");
//		System.out.println(taxiOb.costTaxis() + " $");
//		System.out.println();
//		
//		System.out.println("Sort by fuel consaumption:");
//		taxiOb.sortByFuelConsumption();
//		for (IVehicle car : cars) 
//		System.out.println(car.toString());
//		System.out.println();
//		
//		System.out.println("Finde cars by speed by rengó:");
//		try {
//			IVehicle findeCars[] = taxiOb.findeCarsBySpeedByRengó(-120, 150);
//			for (IVehicle car : findeCars)
//				System.out.println(car.toString());
//		} catch (SpeedException e) {
//			System.err.println(e);
//			}
	}
}
