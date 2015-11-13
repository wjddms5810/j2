package com.j2.facade.hometheater.smarthome;
public class SmartHomeFacade {
    private Desk desk;
    private Mp3 mp3;
    private Light light;
    
    public SmartHomeFacade(Desk desk, Mp3 mp3,Light light) {
        this.desk = desk;
        this.mp3 = mp3;
        this.light = light;
    }
 
    public void startStudy(String subject) {
        System.out.println("Get ready to study ...");
        desk.startStudymode();
        light.on();
        light.setLevel(5);
        mp3.on();
        mp3.setVolume(3);
    }
    public void endStudy() {
        System.out.println("End Study...");
        desk.endStudymode();
        light.off();
        mp3.off();
    }
}