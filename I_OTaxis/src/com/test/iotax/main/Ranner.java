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
		dataFileWriter.writeFile(cars, "All cars in taxis: \n\n");					
		
		ITaxiPark taxiOb = new TaxiParkImpl(cars);
		
		dataFileWriter.writeFilePrice("The cost of taxis: ", taxiOb.costTaxis());;
				
		taxiOb.sortByFuelConsumption();
		dataFileWriter.writeFile(cars, "Sort by fuel consaumption: \n\n");

		try {
			IVehicle findeCars[] = taxiOb.findeCarsBySpeedByRengó(120, 150);
			dataFileWriter.writeFile(findeCars, "Finde cars by speed by rengó: \n\n");		
		} catch (SpeedException e) {
			System.err.println(e);
			}
	}
}
