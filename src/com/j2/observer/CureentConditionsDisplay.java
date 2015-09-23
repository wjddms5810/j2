package com.j2.observer;

public class CureentConditionsDisplay implements Observer{
  private float temperature;
  private float humidity;
  private Subject weatherData;
  public CureentConditionsDisplay(Subject weatherData){
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  public void update(float temperature, float humidity, float pressure){
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }
  public void display(){
    System.out.println("current conditions: " +temperature + humidity);
  }
}