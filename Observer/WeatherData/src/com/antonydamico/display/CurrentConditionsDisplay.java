package com.antonydamico.display;

import com.antonydamico.observerpattern.Observer;
import com.antonydamico.observerpattern.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + this.temperature + "C " +
                "and " + this.humidity + "% humidity");
    }
}
