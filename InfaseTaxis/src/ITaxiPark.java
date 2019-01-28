
public interface ITaxiPark {
	
	float costTaxis();
	void sortByFuelConsumption();
	IVehicle[] findeCarsBySpeedByRengó(int minSpeed, int maxSpeed);
}
