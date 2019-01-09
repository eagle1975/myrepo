// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.
public class CargoTaxi extends Vehicle {
	
	private int load�apacity;
	
	public CargoTaxi(int loadCapacity, int id, String mark, String model, String color, int yearProduction, float price, float fuelConsumption, int maxSpeed) {
		super(id, mark, color, color, maxSpeed, fuelConsumption, fuelConsumption, maxSpeed);
		this.load�apacity = loadCapacity;
	}

	public int getLoad�apacity() {
		return load�apacity;
	}

	public void setLoad�apacity(int load�apacity) {
		this.load�apacity = load�apacity;
	}

	@Override
	public String toString() {
		return "CargoTaxi [load�apacity=" + load�apacity + ", Id=" + getId() + ", Mark=" + getMark() 
		        + ", Model=" + getModel() + ", Color=" + getColor() + ", YearProduction="
				+ getYearProduction() + ", Price=" + getPrice() + ", FuelConsumption=" + getFuelConsumption()
				+ ", MaxSpeed=" + getMaxSpeed() + "]";
	}
}
