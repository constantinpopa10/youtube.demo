package dessignPatterns.observer.headfirst.javaAPI;

import java.util.Observable;

public class CurrentConditionsDisplay implements java.util.Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Observable weatherData;

	public CurrentConditionsDisplay(Observable weatherData) {
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}

//	public void update(float temperature, float humidity, float pressure) {
//		this.temperature = temperature;
//		this.humidity = humidity;
//		display();
//	}
	
	public void update (Observable obs, Object arg){
		if( obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
		System.out.println("Some push data: " + arg);
	}

	public void display() {
		System.out.println("Current conditions: " + temperature
				+ " F degrees and and " + humidity + " % humidity");
	}
}
