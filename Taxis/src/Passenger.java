 // 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.
public class Passenger extends Vehicle {
	
	private int NumberOfPassengers;
	
	public Passenger(int numberOfPassengers, int id, String mark, String model, String color, int yearProduction, float price, float fuelConsumption, int maxSpeed) {
		super(id, mark, model, color, yearProduction, price, fuelConsumption, maxSpeed);
		this.NumberOfPassengers = numberOfPassengers;
	}

	public int getNumberOfPassengers() {
		return NumberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		NumberOfPassengers = numberOfPassengers;
	}

	@Override
	public String toString() {
		return "Passenger [NumberOfPassengers=" + NumberOfPassengers + ", Id=" + getId() + ", Mark="
				+ getMark() + ", Model=" + getModel() + ", Color=" + getColor() + ", YearProduction="
				+ getYearProduction() + ", Price=" + getPrice() + ", FuelConsumption=" + getFuelConsumption()
				+ ", MaxSpeed=" + getMaxSpeed() + "]";
	}
}
