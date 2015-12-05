package com.j2.state.dvdplayer;

public class WindowOnState implements State{
	DvdPlayer dvdplayer;
	
	public WindowOnState (DvdPlayer dvdplayer){
		this.dvdplayer = dvdplayer;
	}
	public void windowOff(){
		System.out.println("Window off");
		dvdplayer.setState(dvdplayer.getWindowOffState());
	}
	public void windowOn(){
		System.out.println("Window is On now");
	}
	public void playOn(){
		System.out.println("Play On");
		dvdplayer.setState(dvdplayer.getPlayOnState());
	}
	public void playOff(){
		System.out.println("Play Off");
		dvdplayer.setState(dvdplayer.getPlayOffState());
	}
	public String toString(){
		return "window on state";
	}
}
