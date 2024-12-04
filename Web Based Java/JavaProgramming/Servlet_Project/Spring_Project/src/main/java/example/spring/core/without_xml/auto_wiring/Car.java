package example.spring.core.without_xml.auto_wiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Car {
	private String make;
	private String model;
	private int price;
	@Autowired
	private Engine engineDetails;
	@Autowired
	//@Autowired
	private MusicSystem musicSystem;
	

	public Car() {
		// TODO Auto-generated constructor stub
	}


	public Car(String make, String model, int price, Engine engineDetails, MusicSystem musicSystem) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.engineDetails = engineDetails;
		this.musicSystem = musicSystem;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Engine getEngineDetails() {
		return engineDetails;
	}


	public void setEngineDetails(Engine engineDetails) {
		this.engineDetails = engineDetails;
	}


	public MusicSystem getMusicSystem() {
		return musicSystem;
	}


	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}


	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", price=" + price + ", engineDetails=" + engineDetails
				+ ", musicSystem=" + musicSystem + "]";
	}
	
	

}
