package com.j2.facade.hometheater.smarthome;

public class Light {
    String description;
    Mp3 mp3;
    double level;
 
    public Light(String description, Mp3 mp3) {
        this.description = description;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    public void setLevel(double level) {
        System.out.println(description + " setting level to " + level);
        this.level = level;
    }
    public String toString() {
        return description;
    }
}