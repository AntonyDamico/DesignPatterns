package com.antonydamico.observerpattern;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
