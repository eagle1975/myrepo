// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.
public class Bus extends Passenger {
	
	private String purpose;

	public Bus(String purpose, int numberOfPassengers, int id, String mark, String model, String color, int yearProduction, float price,	float fuelConsumption, int maxSpeed) {
		super(numberOfPassengers, id, mark, model, color, yearProduction, price, fuelConsumption, maxSpeed);
		
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
		return "Bus [purpose=" + purpose + ", NumberOfPassengers=" + getNumberOfPassengers() + ", Id="
				+ getId() + ", Mark=" + getMark() + ", Model=" + getModel() + ", Color=" + getColor()
				+ ", YearProduction=" + getYearProduction() + ", Price=" + getPrice()
				+ ", FuelConsumption=" + getFuelConsumption() + "]";
	}
}
