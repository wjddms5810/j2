package com.j2.facade.hometheater.smarthome;

public class Mp3{
  private String description;
  private Light light;
  private int level;
  
  public Mp3(String description){
    this.description = description;
  }
  public void on(){
    System.out.println(description+ " on");
  }
  public void off(){
    System.out.println(description+ " off");
  }
  public void setLight(Light light){
    System.out.println(description+ " setting light level");
    this.light = light;
  }
  public void setVolume(int level){
    System.out.println(description+ " setting volume to "+ level);
    this.level = level;
  }
}