// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.

package com.test.iotax.vehicle;

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
     void setPrice(int price);
	 
	 float getFuelConsumption();
	 void setFuelConsumption(int fuelConsumption);
		
	 int getMaxSpeed();
	 void setMaxSpeed(int maxSpeed);
}
