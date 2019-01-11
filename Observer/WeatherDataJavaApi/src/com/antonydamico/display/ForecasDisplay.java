package com.antonydamico.display;

import com.antonydamico.observerpattern.Observer;
import com.antonydamico.observerpattern.Subject;

public class ForecasDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForecasDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        if (currentPressure < lastPressure) {
            System.out.println("The pressure is lower");
        } else if (currentPressure > lastPressure) {
            System.out.println("The pressure is higher");
        } else {
            System.out.println("The pressure is the same");
        }
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }
}
