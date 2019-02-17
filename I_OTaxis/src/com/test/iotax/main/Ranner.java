// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.

package com.test.iotax.main;

import com.test.iotax.ranner.*;
import com.test.iotax.vehicle.*;
import com.test.iotax.except.SpeedException;

public class Ranner {

	private static final String FILE_TO_READ = "D:/Workspace/I_OTaxis/fileToRead.txt";
	private static final String FILE_TO_WRITE = "D:/Workspace/I_OTaxis/fileOutput.txt";

	public static void main(String[] args) {
		IVehicle[] cars;
		DataFileReader dataFileReader = new DataFileReader(FILE_TO_READ);
		DataFileWriter dataFileWriter = new DataFileWriter(FILE_TO_WRITE);
		
		cars = dataFileReader.readerDataFile();
							
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
		
		System.out.println("Finde cars by speed by rengó:");
		try {
			IVehicle findeCars[] = taxiOb.findeCarsBySpeedByRengó(-120, 150);
			for (IVehicle car : findeCars)
				System.out.println(car.toString());
		} catch (SpeedException e) {
			System.err.println(e);
			}
	}
}
