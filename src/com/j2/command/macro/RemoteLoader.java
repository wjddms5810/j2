package com.j2.command.macro;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
 
		TV livingRoomTV = new TV("Living Room");
		Light livingRoomLight = new Light("Living Room");
		DVD livingRoomDVD = new DVD("Living Room");
		Heater livingRoomHeater = new Heater("Living Room");

		TVOnCommand livingRoomTVOn = new TVOnCommand(livingRoomTV);
		TVOffCommand livingRoomTVOff = new TVOffCommand(livingRoomTV);
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		DVDOnCommand livingRoomDVDOn = new DVDOnCommand(livingRoomDVD);
		DVDOffCommand livingRoomDVDOff = new DVDOffCommand(livingRoomDVD);
		HeaterOnCommand livingRoomHeaterOn = new HeaterOnCommand(livingRoomHeater);
		HeaterOffCommand livingRoomHeaterOff = new HeaterOffCommand(livingRoomHeater);
		
		Command[] partyOn = {livingRoomTVOn,livingRoomLightOn,livingRoomDVDOn,livingRoomHeaterOn};
		Command[] partyOff = {livingRoomTVOff,livingRoomLightOff,livingRoomDVDOff,livingRoomHeaterOff};
		MacroCommand PartyOnMacro = new MacroCommand(partyOn);
		MacroCommand PartyOffMacro = new MacroCommand(partyOff);
		remoteControl.setCommand(0, PartyOnMacro, PartyOffMacro);
 
		System.out.println("ON--------------------------------");
		remoteControl.onButtonWasPushed(0);
		System.out.println("OFF--------------------------------");
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
	}

}
