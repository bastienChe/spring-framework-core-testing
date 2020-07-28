package spring.framework.core.Testing;

import org.springframework.stereotype.Component;

@Component
public class Car  implements Vehicule {
	public void drive() {
		System.out.println("i'm driving a car");
	}
}
