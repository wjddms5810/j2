package com.j2.command.macro;

public class TV {
	String location;
	int level;
	public TV(String location){
		this.location = location;
	}
	public void on() {
		level = 100;
		System.out.println("TV is on");
	}
	public void off() {
		level = 0;
		System.out.println("TV is off");
	}
	public void control(int level) {
		this.level = level;
		if (level == 0) {
			off();
		}
		else {
			System.out.println("TV is controled to " + level + "%");
		}
	}
	public int getLevel() {
		return level;
	}

}
