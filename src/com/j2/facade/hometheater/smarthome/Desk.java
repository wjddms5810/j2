package com.j2.facade.hometheater.smarthome;

public class Desk {
    String description;
    Light light;
    public Desk(String description, Light light) {
        this.description = description;
        this.light = light;
    }
    public void startStudymode() {
        System.out.println(description + " start studymode");
    }
    public void endStudymode() {
        System.out.println(description + " end studymode");
    }
    public String toString() {
        return description;
    }
}