package spring.framework.core.Testing;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicule {
	public void drive() {
		System.out.println("i'm driving a bike");
	}
}
