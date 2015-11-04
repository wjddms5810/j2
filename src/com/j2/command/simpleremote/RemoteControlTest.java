package com.j2.command.simpleremote;

public class RemoteControlTest{
  public static void main(String args[]){
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light light = new Light();
    LightOnCommand lightOn = new LightOnCommand(light);
    remote.setCommand(lightOn);
    remote.bottonWasPressed();
    Door door = new Door();
    GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(door);
    remote.setCommand(doorOpen);
    remote.bottonWasPressed();
  }
}