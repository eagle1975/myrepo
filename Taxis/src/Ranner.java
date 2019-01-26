// 08.01.2019
// Taxi Park. Cost calculation. Sort by fuel consumption. Finding cars at maximum speed in a given range.
public class Ranner {

	public static void main(String[] args) {
		
		Vehicle[] cars = {
				new CargoTaxi(1, "Renault",   "Maskott",       "White", 2017, 16500, 10, 150, 7500),
				new CargoTaxi(2, "Iveco",     "Daily",         "Blue",  2009, 9400,  8,  130, 3860),
				new Bus      (3, "Scania",    "OmniExpress",   "Green", 2018, 30000, 15, 180, 51, "tourist"),
				new Bus      (4, "LAZ",       "InterLAZ-10LE", "White", 2017, 25000, 13, 145, 45, "suburban"),
				new Cars     (5, "Opel",      "Omega",         "Black", 2013, 15000, 8,  180, 5, "Hatchback"),
				new Cars     (6, "Chevrolet", "Aveo",          "Red",   2016, 12000, 12, 167, 5, "Sedan"),
				new Cars     (7, "Opel",      "Astra",         "Green", 2009, 15000, 7,  145, 4, "Sedan" )
		};
		
		System.out.println("All cars in taxis:");
		for (Vehicle car : cars) 
			System.out.println(car.toString());
		System.out.println();
		
		System.out.print("cost taxis: ");
		TaxiPark t = new TaxiPark(cars);
		System.out.println(t.costTaxis() + " $");
		System.out.println();
		
		System.out.println("Sort by fuel consaumption:");
		t.sortByFuelConsumption();
		for (Vehicle car : cars) 
		System.out.println(car.toString());
		System.out.println();
		
		System.out.println("Finde cars by speed by rengó:");
		Vehicle finde[] = new Vehicle[t.findeCarsBySpeedByRengó(167, 180).length];
		finde = t.findeCarsBySpeedByRengó(167, 180);
		for (int i = 0; i < finde.length; i++) 
			System.out.println(finde[i]);
	}
}
