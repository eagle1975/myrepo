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
	FileInputStream fin;
	
	public IVehicle[] readerDataFile(String file) {
		try {
			 fin = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			System.err.println("Open file error!");
		}
		try {
			int n = fin.available();
			byteBufer = new byte[n];
			fin.read(byteBufer);
			allVehicle = new String(byteBufer);
			vehicle = allVehicle.split(";\r\n"); 
				for (int i = 0; i < vehicle.length; i++) {
					vehicleProperties = vehicle[i].split(",");
					switch (vehicleProperties[vehicleProperties.length - 1]) {
						case  "cargo" : resaltArray[i] = new CargoTaxiImpl(Integer.parseInt(vehicleProperties[0].trim()), vehicleProperties[1].trim(), vehicleProperties[2].trim(), vehicleProperties[3].trim(),
								Integer.parseInt(vehicleProperties[4].trim()), Integer.parseInt(vehicleProperties[5].trim()), Integer.parseInt(vehicleProperties[6].trim()),
								Integer.parseInt(vehicleProperties[7].trim()), Integer.parseInt(vehicleProperties[8].trim()));
							break;
						case "bus" :  resaltArray[i] = new Bus(Integer.parseInt(vehicleProperties[0]), vehicleProperties[1], vehicleProperties[2], vehicleProperties[3],
								Integer.parseInt(vehicleProperties[4]), Integer.parseInt(vehicleProperties[5].trim()), Integer.parseInt(vehicleProperties[6].trim()),
								Integer.parseInt(vehicleProperties[7]), Integer.parseInt(vehicleProperties[8]), vehicleProperties[9]);
							break;
						case "car" : resaltArray[i] = new Cars(Integer.parseInt(vehicleProperties[0]), vehicleProperties[1], vehicleProperties[2], vehicleProperties[3],
								Integer.parseInt(vehicleProperties[4]), Integer.parseInt(vehicleProperties[5].trim()), Integer.parseInt(vehicleProperties[6].trim()),
								Integer.parseInt(vehicleProperties[7]), Integer.parseInt(vehicleProperties[8]), vehicleProperties[9]);
							break;
										
					}
					
				}
								
		}catch(IOException e) {
			System.err.println("Error input output!");
		}
		try {
			if (fin != null)
			fin.close();
		} catch (IOException e) {
			System.err.println("error closing file" + e);
		}
		return resaltArray;
		}
	
}