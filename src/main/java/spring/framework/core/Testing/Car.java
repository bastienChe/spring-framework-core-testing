package spring.framework.core.Testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car  implements Vehicule {
	
	@Autowired
	private Tyre tyre;
	
	public void drive() {
		System.out.println("i'm driving a car and here is the tyre : " + tyre.toString());
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
}
