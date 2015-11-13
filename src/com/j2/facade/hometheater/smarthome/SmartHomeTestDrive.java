package com.j2.facade.hometheater.smarthome;

public class SmartHomeTestDrive {
    public static void main(String[] args) {
        Mp3 mp3 = new Mp3("My Mp3");
        Light light = new Light("My Light", mp3);
        Desk desk= new Desk("My Desk", light);
 
        SmartHomeFacade smarthome = new SmartHomeFacade(desk,mp3,light);
        smarthome.startStudy("math");
        smarthome.endStudy();
    }
}