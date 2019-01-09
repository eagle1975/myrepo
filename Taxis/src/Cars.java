// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.
public class Cars extends Passenger {
	
	private String body;

	public Cars(String body, int numberOfPassengers, int id, String mark, String model, String color, int yearProduction,
			float price, float fuelConsumption, int maxSpeed) {
		super(numberOfPassengers, id, mark, model, color, yearProduction, price, fuelConsumption, maxSpeed);
		
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
		return "Cars [body=" + body + super.toString() + "]";
	}
}
