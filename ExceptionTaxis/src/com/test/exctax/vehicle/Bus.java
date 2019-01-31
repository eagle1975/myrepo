// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.

package com.test.exctax.vehicle;

public class Bus extends PassengerImpl {
	
	private String purpose;
	
	public Bus(int id, String mark, String model, String color, int yearProduction, float price, float fuelConsumption,
			int maxSpeed, int numberOfPassengers, String purpose) {
		super(id, mark, model, color, yearProduction, price, fuelConsumption, maxSpeed, numberOfPassengers);
		
		this.purpose = purpose;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	@Override
	public String toString() {
		return "Bus [Id=" + getId() + ", Mark=" + getMark() + ", Model=" + getModel() + ", Color="
				+ getColor() + ", YearProduction=" + getYearProduction() + ", Price=" + getPrice()
				+ ", FuelConsumption=" + getFuelConsumption() + ", MaxSpeed=" + getMaxSpeed()
				+ ", NumberOfPassengers=" + getNumberOfPassengers() + ", purpose=" + purpose + "]";
	}

	
}
