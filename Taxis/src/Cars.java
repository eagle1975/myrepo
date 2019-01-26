// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.
public class Cars extends Passenger {
	
	private String body;
			
	public Cars(int id, String mark, String model, String color, int yearProduction, float price, float fuelConsumption,
			int maxSpeed, int numberOfPassengers, String body) {
		super(id, mark, model, color, yearProduction, price, fuelConsumption, maxSpeed, numberOfPassengers);
		
		this.body = body;		
	}
	
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Cars [Id=" + getId() + ", Mark=" + getMark() + ", Model=" + getModel() + ", Color="
				+ getColor() + ", YearProduction=" + getYearProduction() + ", Price=" + getPrice()
				+ ", FuelConsumption=" + getFuelConsumption() + ", MaxSpeed=" + getMaxSpeed()
				+ ", NumberOfPassengers=" + getNumberOfPassengers() + ", body=" + body + "]";
	}

	
}
