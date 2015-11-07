package com.j2.command.macro;

public class HeaterOffCommand implements Command{
	Heater Heater;
	int level;
	public HeaterOffCommand(Heater Heater) {
		this.Heater = Heater;
	}
 
	public void execute() {
        level = Heater.getLevel();
		Heater.off();
	}
 
	public void undo() {
		Heater.control(level);
	}
}
