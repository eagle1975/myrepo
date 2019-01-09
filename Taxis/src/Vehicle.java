// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.
public class Vehicle {
	
	private int id;
	private String mark;
	private String model;
	private String color;
	private int yearProduction;
	private float price;
	private float fuelConsumption;
	private int maxSpeed;
	
	public Vehicle(int id, String mark, String model, String color, int yearProduction, float price, float fuelConsumption, int maxSpeed) {
		this.id = id;
		this.mark = mark;
		this.model = model;
		this.color = color;
		this.yearProduction = yearProduction;
		this.price = price;
		this.fuelConsumption = fuelConsumption;
		this.maxSpeed = maxSpeed;
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
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(float fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", mark=" + mark + ", model=" + model + ", color=" + color + ", yearProduction="
				+ yearProduction + ", price=" + price + ", fuelConsumption=" + fuelConsumption + ", maxSpeed="
				+ maxSpeed + "]";
	}
	
	
}
