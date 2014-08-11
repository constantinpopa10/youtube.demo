package dessignPatterns.observer.headfirst.javaAPI;

import java.util.Observable;


public class ForecastDisplay implements java.util.Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Observable weatherData;

	public ForecastDisplay(Observable weatherData) {
		this.setWeatherData(weatherData);
		weatherData.addObserver(this);
	}

//	public void update(float temp, float humidity, float pressure) {
//                lastPressure = currentPressure;
//		currentPressure = pressure;
//
//		display();
//	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	public Observable getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(Observable weatherData) {
		this.weatherData = weatherData;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}
