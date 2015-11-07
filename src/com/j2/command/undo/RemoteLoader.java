package com.j2.command.undo;

public class RemoteLoader{
  public static void main(String args[]){
    RemoteControlWithUndo remote = new RemoteControlWithUndo();
    Light light = new Light("Living Room");
    DVD livingRoomDVD = new DVD("Living Room");

    LightOnCommand livingRoomLightOn = new LightOnCommand(light);
    LightOffCommand livingRoomLightOff = new LightOffCommand(light);
    DVDOnCommand livingRoomDVDOn = new DVDOnCommand(livingRoomDVD);
    DVDOffCommand livingRoomDVDOff = new DVDOffCommand(livingRoomDVD);
    remote.setCommand(0,livingRoomLightOn,livingRoomLightOff);
    remote.onButtonWasPushed(0);
    remote.offButtonWasPushed(0);
    remote.undoButtonWasPushed();
    System.out.println(remote);
    remote.setCommand(1, livingRoomDVDOn, livingRoomDVDOff);
    remote.onButtonWasPushed(1);
    remote.undoButtonWasPushed();
    remote.offButtonWasPushed(1);
    System.out.println(remote);
  }
}

