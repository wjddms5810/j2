package com.j2.observer;

public class WeatherStatiom{
  public static void main(String[] ars){
    WeatherData weatherData  = new WeatherData();
    CureentConditionsDisplay currentDisplay = new CureentConditionsDisplay (weatherData);
    weatherData.setMeasurements(80,65,30.4f);
  }
}