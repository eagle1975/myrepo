package com.test.pkgtaxi.vehicle;
// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.
public interface IVehicle {
	 int getId();
	 void setId(int id);
	 
	 String getMark();
	 void setMark(String mark);
		
	 String getModel();
	 void setModel(String model);
		
	 String getColor();
	 void setColor(String color);
		
	 int getYearProduction();
	 void setYearProduction(int yearProduction);
		
	 float getPrice(); 
     void setPrice(float price);
	 
	 float getFuelConsumption();
	 void setFuelConsumption(float fuelConsumption);
		
	 int getMaxSpeed();
	 void setMaxSpeed(int maxSpeed);
}
