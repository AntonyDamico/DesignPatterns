package com.antonydamico;

import com.antonydamico.display.*;
import com.antonydamico.weather.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        DisplayElement currentDisplay = new CurrentConditionsDisplay(weatherData);
        DisplayElement statisticDisplay = new StatisticDisplay(weatherData);
        DisplayElement forecastDisplay = new ForecasDisplay(weatherData);
        DisplayElement heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(25, 65, 30.4f);
        System.out.println("===================================");
        weatherData.setMeasurements(23, 62, 30.4f);
        System.out.println("===================================");
        weatherData.setMeasurements(27, 70, 29.4f);
        System.out.println("===================================");
    }
}
