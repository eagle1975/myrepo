package com.test.iotax.main;

import java.io.*;
import com.test.iotax.vehicle.IVehicle;

public class DataFileWriter {
	private String outputFile;
	public DataFileWriter(String outputFile) {
		this.outputFile = outputFile;
	}
	void writeFile(IVehicle[] veh) {
		try (FileOutputStream fot = new FileOutputStream(outputFile)) {
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
