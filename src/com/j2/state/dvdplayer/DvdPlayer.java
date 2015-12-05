package com.j2.state.dvdplayer;

public class DvdPlayer {
	State windowOnState;
	State windowOffState;
	State playOnState;
	State playOffState;
	
	State state ;
	
	public DvdPlayer(){
		windowOnState = new WindowOnState(this);
		windowOffState = new WindowOffState(this);
		playOnState = new PlayOnState(this);
		playOffState = new PlayOffState(this);
		state = windowOnState;
	}
	
	public void play(){
		state.playOn();
	}
	public void stop(){
		state.playOff();
		state.windowOff();
	}
	public void windowSleep(){
		state.windowOff();
		state.playOff();
	}
	public void windowTurnOn(){	
		state.windowOn();
	}
	void setState(State state){
		this.state = state;
	}
	public State getState(){
		return state;	
	}
	public State getWindowOnState(){
		return windowOnState;
	}
	public State getWindowOffState(){
		return windowOffState;
	}
	public State getPlayOnState(){
		return playOnState;
	}
	public State getPlayOffState(){
		return playOffState;
	}
	public String toString(){
		StringBuffer result = new StringBuffer();
		result.append("\nJeong Eun's dvdPlayer");
		result.append("\nDvdplayer is "+state+"\n");
		return result.toString();
	}	
}
