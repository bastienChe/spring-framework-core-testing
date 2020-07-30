package annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="annotations")
public class AppConfig {
	
//	useless with using @component and @qualifier annotations
//	@Bean
//	public Samsung getPhone() {
//		return new Samsung();
//	}
//	
//	@Bean
//	public MobileProcessor getProcessor() {
//		return new Snapdragon();
//	}
	
	
}
