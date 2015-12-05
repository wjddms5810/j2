package com.j2.state.dvdplayer;

public class PlayOnState implements State{
	DvdPlayer dvdplayer;
	
	public PlayOnState(DvdPlayer dvdplayer){
		this.dvdplayer = dvdplayer;
	}
	public void windowOff(){
		System.out.println("yos can't window off because this is play state.");
	}
	public void windowOn(){
		System.out.println("Window is On now");
	}
	public void playOn(){
		System.out.println("dvdplayer is playing now");
	}
	public void playOff(){
		System.out.print("Play Off");
		dvdplayer.setState(dvdplayer.getPlayOffState());
	}
	public String toString(){
		return "play on state";
	}
}

