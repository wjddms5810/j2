package com.j2.state.dvdplayer;

public class PlayOffState implements State{
	DvdPlayer dvdplayer;
	
	public PlayOffState(DvdPlayer dvdplayer){
		this.dvdplayer = dvdplayer;
	}
	public void windowOff(){
		System.out.println(" -> Window sleep");
	}
	public void windowOn(){
		System.out.println("Window On ");
		dvdplayer.setState(dvdplayer.getWindowOnState());
	}
	public void playOn(){
		System.out.println("You can't play because window is off state");
	}
	public void playOff(){
		System.out.println("Play Off and window off state ");
		dvdplayer.setState(dvdplayer.getWindowOffState());
	}
	public String toString(){
		return "play off state";
	}
}

