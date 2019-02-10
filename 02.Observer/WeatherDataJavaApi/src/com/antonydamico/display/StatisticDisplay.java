package com.antonydamico.display;

import com.antonydamico.observerpattern.Observer;
import com.antonydamico.observerpattern.Subject;
import com.antonydamico.weather.WeatherData;

public class StatisticDisplay implements Observer, DisplayElement {
    private float minTemp = 200;
    private float maxTemp = 0.0f;
    private float tempSum = 0.0f;
    private int numReadings;
    private Subject weatherData;

    public StatisticDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
