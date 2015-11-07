package com.j2.command.macro;

public class Heater {
	String location;
	int level;
	public Heater(String location){
		this.location = location;
	}
	public void on() {
		level = 100;
		System.out.println("Heater is on");
	}
	public void off() {
		level = 0;
		System.out.println("Heater is off");
	}
	public void control(int level) {
		this.level = level;
		if (level == 0) {
			off();
		}
		else {
			System.out.println("Heater is controled to " + level + "%");
		}
	}
	public int getLevel() {
		return level;
	}

}