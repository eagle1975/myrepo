package com.test.iotax.main;

import java.io.*;
import com.test.iotax.vehicle.IVehicle;

public class DataFileReader {
	byte[] byteBufer;
	IVehicle[] resaltArray;
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
			String allCars = new String(byteBufer);
			//System.out.println(allCars);
			String[] cars = allCars.split(";\r\n"); 
			String[] carsProperties; 
				for (String c : cars)
					
					System.out.println(c);
//			for (String c : cars)
//				System.out.println(c);
			//System.out.println(new String(byteBufer));
		}catch(IOException e) {
			System.err.println("Error input output!");
		}
		
		return resaltArray;
		}
	
}