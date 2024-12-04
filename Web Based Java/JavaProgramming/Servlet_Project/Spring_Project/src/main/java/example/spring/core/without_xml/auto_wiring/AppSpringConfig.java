package example.spring.core.without_xml.auto_wiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppSpringConfig {

	//Configuration of 3 beans: Engine, MusicSystem and Car
	
	@Bean("carEngine")
	//@Primary
	public Engine getEngine() {
		
		Engine eng= new Engine("1600 CC", "Petrol");
		return eng;
	}
	

	@Bean("carSuperEngine")
	@Primary
	public Engine getSuperEngine() {
		
		Engine eng= new Engine("2000 CC", "Petrol");
		return eng;
	}
	@Bean("carMusicSystem")
	public MusicSystem getMusicSystem()
	{
		MusicSystem ms = new MusicSystem();
		ms.setMake("Sony");
		ms.setSoundEffect("Dolby");
		return ms;
	}
	
	@Bean("myCar")
	public Car getMyCar()
	{
		Car myCar = new Car();
		myCar.setMake("Hyundai");
		myCar.setModel("Creta");
		myCar.setPrice(25000000);
		return myCar; 
		
		/*
		 * 
		 */
		
		
		
		
	}
}
