package spring.framework.core.Testing;

import org.springframework.stereotype.Component;

public class Tyre {

	private String brand;

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
