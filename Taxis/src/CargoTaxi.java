// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.
public class CargoTaxi extends Vehicle {
	
	private int loadÑapacity;
	
	public CargoTaxi(int id, String mark, String model, String color, int yearProduction, float price, float fuelConsumption, int maxSpeed, int loadCapacity) {
		super(id, mark, model, color, yearProduction, price, fuelConsumption, maxSpeed);
		this.loadÑapacity = loadCapacity;
	}

	public int getLoadÑapacity() {
		return loadÑapacity;
	}

	public void setLoadÑapacity(int loadÑapacity) {
		this.loadÑapacity = loadÑapacity;
	}

	@Override
	public String toString() {
		return "CargoTaxi [Id()=" + getId() + ", Mark=" + getMark() + ", Model=" + getModel()
				+ ", Color=" + getColor() + ", YearProduction=" + getYearProduction() + ", Price="
				+ getPrice() + ", FuelConsumption=" + getFuelConsumption() + ", MaxSpeed=" + getMaxSpeed()
				+ ", loadÑapacity=" + loadÑapacity + "]";
	}
}
