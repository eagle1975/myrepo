
public class Runner {

	public static void main(String[] args) {
		Car[] cars = { new Car(1,  "Zaz",       "Slavuta",      2001, "Green", 5000,     1054576),
		               new Car(2,  "Zaz",       "Tavriya Nova", 2004, "Blue",  4500,     1024678),
		               new Car(3,  "Opel",      "Vectra",       1998, "Green", 10000,    6787014),
		               new Car(4,  "Opel",      "Astra",        2009, "Green", 7000,     876323),
		               new Car(5,  "Opel",      "insignia",     2015, "Navi",  20000,    778743),
		               new Car(6,  "BMW",       "X3",           2014, "White", 40000,    78634),
		               new Car(7,  "BMW",       "X5",           2015, "Black", 60000,    67832987),
		               new Car(8,  "Chevrolet", "Aveo",         2015, "White", 8000,     6787245),
		               new Car(9,  "Chevrolet", "Aveo",         2016, "Red",   12000,    67854),
		               new Car(10, "Scoda",     "Octavia",      2016, "Orang", 18500,    78965),
				       new Car(11, "Mersedes",  "bens",         2009, "Red",   12250,    12097),
					   new Car(12, "Opel",      "Vectra",       1984, "blu",   7365,     1111),
					   new Car(13, "Opel",      "Vectra",       2009, "Red",   15000,    876323),
		               new Car(14, "Opel",      "insignia",     2009, "Blue",  20000,    778743)};
		
		Processor proc = new Processor(cars);
		
		System.out.println("A list of cars of a given brand:\n");
		proc.findeCarByMark("BMW");
		System.out.println();
		
		System.out.println("A list of cars of a given model that have been operated for more than n years:\n");
		proc.findeCarByMarkAndYear("Opel", 9);
		System.out.println();
		
		System.out.println("A list of vehicles of a given year of release, the price of which is higher than the specified:\n");
		proc.findeCarByYearAndPrice(2009, 12000);
		System.out.println();
		
		System.out.println("Print All cars:\n");
		proc.printAll();
	}

}
