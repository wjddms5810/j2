package com.j2.state.dvdplayer;

public class WindowOffState implements State{
	DvdPlayer dvdplayer;
	
	public WindowOffState(DvdPlayer dvdplayer){
		this.dvdplayer = dvdplayer;
	}
	public void windowOff(){
		System.out.println("Window off and play stop");
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
	}
	public String toString(){
		return "window off state";
	}
}
