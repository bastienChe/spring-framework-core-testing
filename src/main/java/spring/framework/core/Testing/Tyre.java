package spring.framework.core.Testing;


public class Tyre {

	private String brand;

	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
