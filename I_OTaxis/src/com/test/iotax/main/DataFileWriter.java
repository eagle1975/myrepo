package com.test.iotax.main;

import java.io.*;

import com.test.iotax.vehicle.Bus;
import com.test.iotax.vehicle.CargoTaxiImpl;
import com.test.iotax.vehicle.Cars;
import com.test.iotax.vehicle.IVehicle;

public class DataFileWriter {
	private String outputFile;
	
	public DataFileWriter(String outputFile) {
		this.outputFile = outputFile;
	}
	void writeFile(IVehicle[] veh, String s) {
		try (FileOutputStream fout = new FileOutputStream(outputFile, true)) {
			fout.write(s.getBytes());
			for (int i = 0; i < veh.length; i++) {
				fout.write(String.valueOf(veh[i].getId()).getBytes());
				fout.write(", ".getBytes());
				fout.write(veh[i].getMark().getBytes());
				fout.write(", ".getBytes());
				fout.write(veh[i].getModel().getBytes());
				fout.write(", ".getBytes());
				fout.write(veh[i].getColor().getBytes());
				fout.write(", ".getBytes());
				fout.write(String.valueOf(veh[i].getYearProduction()).getBytes());
				fout.write(", ".getBytes());
				fout.write(String.valueOf(veh[i].getPrice()).getBytes());
				fout.write(", ".getBytes());
				fout.write(String.valueOf(veh[i].getFuelConsumption()).getBytes());
				fout.write(", ".getBytes());
				fout.write(String.valueOf(veh[i].getMaxSpeed()).getBytes());
				fout.write(", ".getBytes());
								
				if (veh[i] instanceof Bus) {
					fout.write(String.valueOf(((Bus)veh[i]).getNumberOfPassengers()).getBytes());
					fout.write(", ".getBytes());
					fout.write(((Bus)veh[i]).getPurpose().getBytes());
				}
				else 
					if (veh[i] instanceof Cars) {
						fout.write(String.valueOf(((Cars)veh[i]).getNumberOfPassengers()).getBytes());
						fout.write(", ".getBytes());
						fout.write(((Cars)veh[i]).getBody().getBytes());
					}
					else {
							fout.write(String.valueOf(((CargoTaxiImpl)veh[i]).getLoadÑapacity()).getBytes());
					}
				if (i != (veh.length - 1)) {
					fout.write(";\r\n".getBytes());
				}
				else
					fout.write("\r\n\n".getBytes());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			}
	}
	void writeFilePrice(String s, float cost) {
		try (FileOutputStream fout = new FileOutputStream(outputFile, true)){
			fout.write(s.getBytes());
			fout.write(String.valueOf(cost).getBytes());
			fout.write("\n\n".getBytes());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
