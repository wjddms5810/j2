package com.j2.observer;

import java.util.*;

public class WeatherData implements Subject{
  private ArrayList <Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;
  public WeatherData(){
    observers = new ArrayList<Observer>();
  }
  public void registerObserver(Observer o){
    observers.add(o);
  }
  public void removeObserver(Observer o){
    int i = observers.indexOf(o);
    if(i >= 0){
      observers.remove(i);
    }
  }
  public void notifyObservers(){
    for (int i=0; i<observers.size(); i++){
      Observer observer = (Observer)observers.get(i); //upcasting이므로 명시해줘야 합니다.
      observer.update(temperature,humidity,pressure);
    }
  }
  public void  measurementsChanged(){
    notifyObservers();
  }
  public void setMeasurements(float temperature, float humidity, float pressure){
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
} 
  
                     