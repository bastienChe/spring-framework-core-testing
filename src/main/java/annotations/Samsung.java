package annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

	@Autowired
	MobileProcessor cpu;
	
	public void config() {
		System.out.println("In Samsung config..");
		cpu.process();
	}
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
	
}
