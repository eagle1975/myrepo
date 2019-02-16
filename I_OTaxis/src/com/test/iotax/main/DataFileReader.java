package com.test.iotax.main;

import java.io.*;

import com.test.iotax.vehicle.Bus;
import com.test.iotax.vehicle.CargoTaxiImpl;
import com.test.iotax.vehicle.Cars;
import com.test.iotax.vehicle.IVehicle;

public class DataFileReader {
	String allVehicle;
	byte[] byteBufer;
	IVehicle[] resaltArray;
	String[] vehicle;
	String[] vehicleProperties;
	FileInputStream fin = null;
	
	public IVehicle[] readerDataFile(String file) {
		try (FileInputStream fin = new FileInputStream(file)) {												
			int n = fin.available();
			byteBufer = new byte[n];
			fin.read(byteBufer);
		} catch(FileNotFoundException e) {
			System.err.println("Error Inpu Output " + e);
		} catch (IOException e) {
			System.out.println("Error read from the file " + e);
		}
		allVehicle = new String(byteBufer);
		vehicle = allVehicle.split(";\r\n");
		resaltArray = new IVehicle[vehicle.length];
		for (int i = 0; i < vehicle.length; i++) {
			vehicleProperties = vehicle[i].split(",");
			switch (vehicleProperties[vehicleProperties.length - 1].trim()) {
					case  "cargo" : resaltArray[i] = new CargoTaxiImpl(Integer.parseInt(vehicleProperties[0]), vehicleProperties[1].trim(),
							        vehicleProperties[2].trim(),  vehicleProperties[3].trim(), Integer.parseInt(vehicleProperties[4].trim()),
							        Integer.parseInt(vehicleProperties[5].trim()), Integer.parseInt(vehicleProperties[6].trim()), Integer.parseInt(vehicleProperties[7].trim()),
							        Integer.parseInt(vehicleProperties[8].trim()));
					
						break;
					case "bus" :  resaltArray[i] = new Bus(Integer.parseInt(vehicleProperties[0]), vehicleProperties[1].trim(),
								  vehicleProperties[2].trim(), vehicleProperties[3].trim(), Integer.parseInt(vehicleProperties[4].trim()),
								  Integer.parseInt(vehicleProperties[5].trim()), Integer.parseInt(vehicleProperties[6].trim()), Integer.parseInt(vehicleProperties[7].trim()),
								  Integer.parseInt(vehicleProperties[8].trim()), vehicleProperties[9].trim());
						break;
					case "car" : resaltArray[i] = new Cars(Integer.parseInt(vehicleProperties[0]), vehicleProperties[1].trim(),
								 vehicleProperties[2].trim(), vehicleProperties[3].trim(), Integer.parseInt(vehicleProperties[4].trim()),
								 Integer.parseInt(vehicleProperties[5].trim()), Integer.parseInt(vehicleProperties[6].trim()), Integer.parseInt(vehicleProperties[7].trim()),
								 Integer.parseInt(vehicleProperties[8].trim()), vehicleProperties[9].trim());
						break;
			}
		}	
		return resaltArray;
	}
}