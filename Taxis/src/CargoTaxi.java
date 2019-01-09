// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.
public class CargoTaxi extends Vehicle {
	
	private int loadÑapacity;
	
	public CargoTaxi(int loadCapacity, int id, String mark, String model, String color, int yearProduction, float price, float fuelConsumption, int maxSpeed) {
		super(id, mark, color, color, maxSpeed, fuelConsumption, fuelConsumption, maxSpeed);
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
		return "CargoTaxi [loadÑapacity=" + loadÑapacity + ", Id=" + getId() + ", Mark=" + getMark() 
		        + ", Model=" + getModel() + ", Color=" + getColor() + ", YearProduction="
				+ getYearProduction() + ", Price=" + getPrice() + ", FuelConsumption=" + getFuelConsumption()
				+ ", MaxSpeed=" + getMaxSpeed() + "]";
	}
}
