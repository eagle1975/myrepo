// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.

package com.test.iotax.vehicle;
 
public class PassengerImpl implements IVehicle {
	 private int id;
	 private String mark;
	 private String model;
	 private String color;
	 private int yearProduction;
	 private int price;
	 private int fuelConsumption;
	 private int maxSpeed;
	 private int NumberOfPassengers;
	
	public PassengerImpl(int id, String mark, String model, String color, int yearProduction, int price, int fuelConsumption, int maxSpeed, int numberOfPassengers) {
		this.id = id;
		this.mark = mark;
		this.model = model;
		this.color = color;
		this.yearProduction = yearProduction;
		this.price = price;
		this.fuelConsumption = fuelConsumption;
		this.maxSpeed = maxSpeed;
		this.NumberOfPassengers = numberOfPassengers;
	}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYearProduction() {
		return yearProduction;
	}

	public void setYearProduction(int yearProduction) {
		this.yearProduction = yearProduction;
	}

	public float getPrice() {
		return (float) price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getFuelConsumption() {
		return (float) fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumberOfPassengers() {
		return NumberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		NumberOfPassengers = numberOfPassengers;
	}
	

	@Override
	public String toString() {
		return "Passenger [Id=" + getId() + ", Mark=" + getMark() + ", Model=" + getModel()
				+ ", Color=" + getColor() + ", YearProduction=" + getYearProduction() + ", Price="
				+ getPrice() + ", FuelConsumption=" + getFuelConsumption() + ", MaxSpeed=" + getMaxSpeed()
				+ ", NumberOfPassengers=" + NumberOfPassengers + "]";
	}

	
		
}
