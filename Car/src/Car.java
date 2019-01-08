
public class Car {
	
	private int id;
	private String marka;
	private String model;
	private int productionYear;
	private String color;
	private int price;
	private int registrationNumber;
	
	public Car(int id, String marka, String model, int productionYear, String color, int price, int registrationNumber) {
		this.id = id;
		this.marka = marka;
		this.model = model;
		this.productionYear = productionYear;
		this.color = color;
		this.price = price;
		this.registrationNumber = registrationNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public String toString() {
		return "Car [ id = " + id + ", marka = " + marka + ", model = " + model + ", productionYear = " + productionYear +
				", color = " + color + ", price = " + price + ", registrationNumber = " + registrationNumber + " ]";
	}
	
	

}
