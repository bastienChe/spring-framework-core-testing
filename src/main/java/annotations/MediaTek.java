package annotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary if I need it to be default implementation of MobileProcessor used in Samsung class
public class MediaTek implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("I'm Mediatek Processor");
	}

	
	
}
