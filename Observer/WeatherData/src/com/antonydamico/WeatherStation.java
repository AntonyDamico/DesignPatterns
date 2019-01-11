package com.antonydamico;

import com.antonydamico.display.CurrentConditionsDisplay;
import com.antonydamico.display.DisplayElement;
import com.antonydamico.weather.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        DisplayElement currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(25, 65, 30.4f);
        weatherData.setMeasurements(23, 62, 30.4f);
        weatherData.setMeasurements(27, 70, 29.4f);
    }
}
