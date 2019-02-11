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
			System.out.println("Open file error!");
		}
		try {
			int n = fin.available();
			byteBufer = new byte[n];
			fin.read(byteBufer);
			System.out.println(new String(byteBufer));
//			for (int i = 0; i < n; i++) {
//				System.out.print((char)byteBufer[i]);
//				//System.out.print();
				
//		}
			
		}catch(IOException e) {
			System.out.println("Error input output!");
		}
		
		return resaltArray;
		}
}
