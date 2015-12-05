package com.j2.state.dvdplayer;

public class DvdPlayerTestDrive {
	public static void main(String[] args){
		DvdPlayer dvdPlayer = new DvdPlayer();
		System.out.println(dvdPlayer);
		dvdPlayer.play();
		dvdPlayer.stop();
		System.out.println(dvdPlayer);
		dvdPlayer.windowTurnOn();
		dvdPlayer.windowSleep();
		dvdPlayer.play();
		System.out.println(dvdPlayer);
	}
}
